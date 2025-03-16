# 🛒 ShopSphere - Full-Stack E-Commerce Platform

ShopSphere is a full-stack e-commerce platform that provides users with a seamless online shopping experience. It features secure authentication, role-based access control (RBAC), product management, order processing, and real-time chat for customer support. The platform is built with modern technologies for scalability and maintainability.

---

## 🚀 Tech Stack

- **Frontend:** React.js, Material UI, Tailwind CSS  
- **Backend:** Java, Spring Boot, Spring Security  
- **Database:** MySQL (structured data), MongoDB (chat history)  
- **Authentication:** JWT, Bcrypt, RBAC  
- **Payment Integration:** Razorpay, Stripe  
- **Deployment:** Docker, AWS  
- **Real-time Features:** WebSockets (chat)  

---

## 🎯 Features

✅ User authentication with **JWT & Spring Security**  
✅ **Role-based access control (RBAC)** (Admin, Buyer, Seller)  
✅ **Product management** (list, edit, delete)  
✅ **Order processing system** with secure payments  
✅ **Shopping cart and checkout functionality**  
✅ **Real-time chat** for buyer-seller interaction  
✅ **Admin dashboard** for managing users, products, and orders  
✅ **Responsive UI** with Material UI and Tailwind CSS  

---

## 🏗️ Architecture

The application follows the **Controller-Service-Repository** design pattern.

```plaintext
Frontend (React.js) -----> Backend (Spring Boot)
   |                         |
   |                         |
Material UI            Spring Security
   |                         |
   |                         |
Browser <-----> API Gateway <-----> Microservices (Future)
```

### 🛠️ Backend Modules:
- **User Service**: Handles authentication, user roles, and profile management.
- **Product Service**: Manages product listings and details.
- **Order Service**: Handles cart, orders, and payments.
- **Chat Service**: Manages real-time messaging between buyers and sellers.

---

## 📊 UML Diagram

```plaintext
                   +---------------------+
                   |      User            |
                   |---------------------|
                   | userId               |
                   | name                 |
                   | email                |
                   | password             |
                   | role (BUYER/SELLER)  |
                   +---------------------+
                              |
                              |
      +-------------------------------------------+
      |                                           |
+-----------------+                      +----------------+
|     Product     |                      |     Order      |
|----------------|                      |----------------|
| productId      |                      | orderId        |
| name          |                      | userId         |
| price         |                      | totalAmount    |
| sellerId      |                      | paymentStatus  |
+-----------------+                      +----------------+
                     |
                     |
               +----------------+
               |  Payment       |
               |----------------|
               | paymentId      |
               | orderId        |
               | amount         |
               | status         |
               +----------------+
```

---

## 💾 Database Design

- **Users Table (MySQL)**  
  - Stores user details with roles (BUYER/SELLER)  
- **Products Table (MySQL)**  
  - Stores product listings from sellers  
- **Orders Table (MySQL)**  
  - Stores orders and payment status  
- **Chats (MongoDB)**  
  - Stores real-time chat messages for negotiations  

---

## 🔧 Setup Instructions

1. Clone the repository:
   ```sh
   git clone https://github.com/SSaurabhShirbhate/ShopSphere.git
   cd ShopSphere
   ```

2. Install frontend dependencies:
   ```sh
   cd frontend
   npm install
   npm start
   ```

3. Set up the backend:
   ```sh
   cd backend
   mvn clean install
   mvn spring-boot:run
   ```

4. Configure **MySQL** and **MongoDB** in `application.properties`.

5. Visit `http://localhost:3000` for the frontend.

---

## 📌 Future Improvements

- Convert to **microservices architecture**  
- Implement **AI-powered recommendations**  
- Add **GraphQL** support for efficient queries  
- Deploy with **Kubernetes**  

---

## 👨‍💻 Connect with Me

🔗 **LinkedIn:** [linkedin.com/in/saurabhshirbhate](https://linkedin.com/in/saurabhshirbhate)  
📂 **GitHub:** [github.com/SSaurabhShirbhate](https://github.com/SSaurabhShirbhate)  

---

### ⭐ Don't forget to star this repo if you found it useful! ⭐
