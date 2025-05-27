
#  HotByte — Online Food Ordering System

HotByte is a modern full-stack web application developed for a popular restaurant chain to revolutionize the online food ordering experience. This project offers an intuitive, responsive, and feature-rich platform that enables customers to browse menus, place orders, track them in real-time, and receive updates — all in a seamless and efficient manner.

---

## 📌 Problem Statement

As the online food ordering trend surged, the restaurant chain aimed to enhance customer experience by building a scalable and user-friendly digital platform. **HotByte** was developed to bridge this gap by enabling:

- Easy menu navigation across categories
- Fast and secure user registration and login
- Smooth order placement and real-time order tracking
- Efficient restaurant-side management for orders and menus

---

## 🎯 Features

### 👤 User Features
- **User Registration and Login**
  - Secure authentication using JWT (JSON Web Tokens)
  - Role-based access control

- **Menu Browsing**
  - Categorized menu (Breakfast, Lunch, Dinner,  Desserts, Pizza, Burger, etc.)
  - Detailed view with item description, pricing, and images

- **Cart and Order Management**
  - Add, update, and remove items from the cart
  - Place orders with a user-friendly interface
  - Real-time email notifications for order confirmation and status updates

- **Order Tracking**
  - View order status: Confirmed, Dispatched, Delivered
  - Track estimated delivery times

### 🛠️ Restaurant/Admin Features
- **Menu Management**
  - Add, edit, or remove menu items
  - Set availability and pricing (including discounts)

- **Order Management**
  - View and manage incoming orders
  - Update order statuses (e.g., Preparing, Out for delivery, Delivered)

---

## 🧰 Tech Stack

| Layer        | Technology            |
|--------------|------------------------|
| Frontend     | React.js               |
| Backend      | Java, Spring Boot      |
| Database     | SQL (MySQL/PostgreSQL) |
| Auth         | JSON Web Tokens (JWT)  |
| Notifications| Email Service (e.g., SMTP) |

---



---

## 🚀 Getting Started

### Prerequisites

- Node.js
- Java 17+
- Maven
- MySQL or PostgreSQL

### Backend Setup

```bash
cd backend-springboot
# Configure database in application.properties
mvn spring-boot:run
````

### Frontend Setup

```bash
cd frontend-react
npm install
npm start
```

---


## 📄 License

This project is licensed under the MIT License.

---

