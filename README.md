# ShopSphere - Full-Stack E-Commerce Platform

## 📌 Overview
ShopSphere is a robust full-stack e-commerce platform designed to provide a seamless shopping experience. Built with **React.js**, **Spring Boot**, and **Material UI**, it supports secure authentication, product management, order processing, and payment integration.

## 🛠 Tech Stack
- **Frontend:** React.js, Material UI, Redux Toolkit
- **Backend:** Spring Boot, Spring Security, JWT, Hibernate
- **Database:** MySQL (Structured Data), MongoDB (Chat History)
- **Payment Gateway:** Razorpay, Stripe
- **Security:** JWT Authentication, Spring Security, Role-Based Access Control (RBAC)
- **Other Tools:** Postman, GitHub, Docker, AWS (for future deployment)

## 🚀 Features
### User Module
- User authentication using JWT and Spring Security
- Role-based access control (Buyer, Seller, Admin)
- Profile management (update user details, change password)

### Product Module
- Sellers can add, edit, and delete products (after admin approval)
- Buyers can browse, search, and filter products
- Category-wise product listing

### Order & Cart Module
- Add/remove items to/from cart
- Place orders with multiple items
- Order status tracking
- Email notifications for order updates

### Payment Module
- Secure transactions with Razorpay and Stripe
- Order confirmation only after successful payment
- Refund handling

### Admin Module
- Approve/reject seller requests
- Manage users, products, and orders
- View sales analytics

## 🏗 Architecture
ShopSphere follows a **Monolithic Architecture** structured as:
- **Controller Layer** (Handles API requests)
- **Service Layer** (Business logic implementation)
- **Repository Layer** (Database operations)

### 🛠 Transition to Microservices (Planned)
- **User Service**: Handles authentication & user management
- **Product Service**: Manages products & categories
- **Order Service**: Handles cart, orders & transactions
- **Payment Service**: Integrates with payment gateways

Each service will have its own database and communicate via REST APIs or gRPC.

## 🗂 Database Design
- **User Table** (id, name, email, role, password, created_at)
- **Product Table** (id, name, description, price, stock, seller_id, category_id)
- **Order Table** (id, user_id, total_amount, status, created_at)
- **Payment Table** (id, order_id, payment_status, transaction_id)

## 🔗 UML Diagram
```
            +------------+        +------------+       +------------+
            |  Frontend  | -----> |  Backend   | -----> |  Database  |
            +------------+        +------------+       +------------+
                  |                     |                     |
          React.js, Redux           Spring Boot          MySQL, MongoDB
```

## 🔧 Installation & Setup
### Backend (Spring Boot)
```sh
cd backend
mvn clean install
mvn spring-boot:run
```

### Frontend (React.js)
```sh
cd frontend
npm install
npm start
```

## 🔌 API Endpoints (Examples)
### User Authentication
- `POST /api/auth/register` → Register a new user
- `POST /api/auth/login` → Authenticate & get JWT token

### Products
- `GET /api/products` → Get all products
- `POST /api/products` → Add new product (Seller)

### Orders
- `POST /api/orders` → Place an order
- `GET /api/orders/{id}` → Get order details

### Payments
- `POST /api/payments` → Process payment

## 🔒 Security Measures
- JWT authentication with Spring Security
- Role-based access control (RBAC)
- Password hashing using Bcrypt
- API request validation

## 🚀 Future Enhancements
- Implement microservices architecture
- Deploy on AWS with Kubernetes
- Introduce AI-powered recommendations

## 📝 Author
- **Saurabh Shirbhate**  
- [LinkedIn](https://linkedin.com/in/saurabhshirbhate)  
- [GitHub](https://github.com/SSaurabhShirbhate)

## 📜 License
This project is open-source under the MIT License.
