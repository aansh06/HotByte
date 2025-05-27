import React, { useEffect, useState } from "react";
import "./Navbar.css";
import PersonIcon from "@mui/icons-material/Person";
import {
  Avatar,
  Badge,
  Button,
  IconButton,
  Menu,
  MenuItem,
} from "@mui/material";
import ShoppingCartIcon from "@mui/icons-material/ShoppingCart";
import SearchIcon from "@mui/icons-material/Search";
import { useLocation, useNavigate } from "react-router-dom";
import Auth from "../../pages/Auth/Auth";
import { useDispatch, useSelector } from "react-redux";
import { logout } from "../../../State/Authentication/Action";
import { pink } from "@mui/material/colors";
import { useTheme } from "@mui/material/styles";


const Navbar = () => {
  const navigate = useNavigate();
  const location = useLocation();
  const { auth, cart } = useSelector((store) => store);
  const dispatch = useDispatch();

  const [anchorEl, setAnchorEl] = React.useState(null);
  const open = Boolean(anchorEl);
  const handleOpenMenu = (event) => {
    setAnchorEl(event.currentTarget);
  };
  const handleCloseMenu = () => {
    setAnchorEl(null);
  };

  const navigateToCart = () => {
    navigate("/cart");
  };

  const navigateToProfile = (e) => {
    auth.user?.role === "ROLE_ADMIN" 
    || auth.user?.role === "ROLE_RESTAURANT_OWNER"
      ? navigate("/admin/restaurant")
      : navigate("/my-profile");
  };

  const handleCloseAuthModel = () => {
    navigate("/");
  };
  const navigateToHome = () => {
    navigate("/");
  };

  // useEffect(()=>{
  //   if(auth.user?.fullName){
  //     // handleCloseAuthModel()
  //   }

  // },[auth.user])

  const handleLogout = () => {
    dispatch(logout());
    handleCloseMenu();
  };
  const theme = useTheme();


  return (
    <div
      className="px-5 z-50 py-3 lg:px-20 flex justify-between items-center"
      style={{ backgroundColor: theme.palette.primary.main }}
    >
      {/* Logo Section */}
      <div className="flex items-center space-x-4">
        <div
          onClick={navigateToHome}
          className="lg:mr-10 cursor-pointer flex items-center space-x-4"
        >
          <li className="logo font-semibold text-white text-2xl">
            Hot Byte
          </li>
        </div>
      </div>

      {/* Right Icons */}
      <div className="flex items-center space-x-2 lg:space-x-6">
        {/* Search */}
        <IconButton onClick={() => navigate("/search")}>
          <SearchIcon sx={{ fontSize: "1.5rem", color: theme.palette.text.primary }} />
        </IconButton>

        {/* User Section */}
        {auth.user?.fullName ? (
          <span
            id="demo-positioned-button"
            aria-controls={open ? "demo-positioned-menu" : undefined}
            aria-haspopup="true"
            aria-expanded={open ? "true" : undefined}
            onClick={
              auth.user?.role === "ROLE_ADMIN"
                ? handleOpenMenu
                : navigateToProfile
            }
            className="font-semibold cursor-pointer"
          >
            <Avatar
              sx={{
                bgcolor: theme.palette.background.paper,
                color: theme.palette.primary.main,
              }}
            >
              {auth.user.fullName[0].toUpperCase()}
            </Avatar>
          </span>
        ) : (
          <IconButton onClick={() => navigate("/account/login")}>
            <PersonIcon sx={{ fontSize: "2rem", color: theme.palette.text.primary }} />
          </IconButton>
        )}

        {/* Menu */}
        <Menu
          id="basic-menu"
          anchorEl={anchorEl}
          open={open}
          onClose={handleCloseMenu}
          MenuListProps={{
            "aria-labelledby": "basic-button",
          }}
        >
          <MenuItem
            onClick={() =>
              auth.user?.role === "ROLE_ADMIN"
                ? navigate("/admin")
                : navigate("/super-admin")
            }
          >
            Profile
          </MenuItem>
          <MenuItem onClick={handleLogout}>Logout</MenuItem>
        </Menu>

        {/* Cart */}
        <IconButton onClick={navigateToCart}>
          <Badge
            color="secondary"
            badgeContent={cart.cartItems.length}
          >
            <ShoppingCartIcon sx={{ fontSize: "2rem", color: theme.palette.text.primary }} />
          </Badge>
        </IconButton>
      </div>

      {/* Auth Modal */}
      <Auth handleClose={handleCloseAuthModel} />
    </div>
  );
};

export default Navbar;
