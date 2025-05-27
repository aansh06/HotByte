import { createTheme } from "@mui/material";

const darkTheme = createTheme({
  // palette: {
  //   mode: "dark", // This sets the theme to dark mode
  //   primary: {
  //     main: "#e91e63", // Customize the primary color to your preference
  //   },
  //   secondary: {
  //     main: "#5A20CB", // Customize the secondary color to your preference
  //   },
  //   black: {
  //     main: "#242B2E",
  //   },
  //   background: {
  //     main: "#000000",
  //     default: "#0D0D0D",
  //     paper: "#0D0D0D",
  //   },
  //   textColor: {
  //     main: "#111111",
palette: {
    mode: "dark",
    primary: {
      main: "#FF6F61", // Coral
      contrastText: "#FFFFFF",
    },
    secondary: {
      main: "#FFD700", // Golden
      contrastText: "#000000",
    },
    black: {
      main: "#242B2E",
    },
    background: {
      default: "#121212",
      paper: "#1E1E1E",
    },
    error: {
      main: "#FF4C4C",
    },
    warning: {
      main: "#FFA500",
    },
    info: {
      main: "#29B6F6",
    },
    success: {
      main: "#66BB6A",
    },
    text: {
      primary: "#F5F5F5",
      secondary: "#CCCCCC",
      disabled: "#888888",
    },
    divider: "#333333",
  },

  typography: {
    fontFamily: `"Poppins", "Roboto", "Helvetica", "Arial", sans-serif`,
    button: {
      textTransform: "none",
      fontWeight: 500,
    },
  },

  shape: {
    borderRadius: 12,
  },

  components: {
    MuiPaper: {
      styleOverrides: {
        root: {
          backgroundImage: "none",
        },
      },
    },
    MuiButton: {
      styleOverrides: {
        root: {
          borderRadius: 8,
        },
      },
    },
  },
});
export default darkTheme;
