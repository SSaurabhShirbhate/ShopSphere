# ShopSphere

## Overview

ShopSphere is a full-stack e-commerce platform that enables users to browse products, manage carts, place orders, and make secure payments using Razorpay and Stripe. The platform supports customer, seller, and admin roles with distinct functionalities, ensuring a smooth shopping experience.

## Features

### Customer Features

- **User Authentication** (JWT-based secure authentication)
- **Product Browsing & Filtering** (Search, Filter, Sort, Pagination)
- **Cart Management** (Add, Update, Remove Items)
- **Order Management** (Place Orders, Cancel Orders, View Order History)
- **Payment Integration** (Razorpay for Indian users, Stripe for international users)
- **Wishlist** (Save favorite products for later)
- **Reviews & Ratings** (Rate products and leave feedback)

### Seller Features

- **Seller Dashboard** (Earnings graph, sales reports)
- **Product Management** (Add, Update, Remove Products)
- **Order Handling** (Manage incoming orders, update order status)
- **Transaction Tracking** (Monitor payments and earnings)

### Admin Features

- **Admin Dashboard** (Monitor overall platform activity)
- **User & Seller Management** (Approve sellers, manage accounts)
- **Coupon Management** (Create, edit, delete coupons)
- **Home Page Management** (Update banners, featured products)
- **Promotions & Deals** (Create special offers and discounts)

## Tech Stack

### Frontend

- React.js
- TypeScript
- Redux Toolkit
- Tailwind CSS
- Material UI
- Axios

### Backend

- Spring Boot
- Spring Security (JWT authentication)
- MySQL (for structured data)
- MongoDB (for chat history)
- WebSockets (for real-time chat and notifications)

### Payment Integration

- **Razorpay** (For Indian users)
- **Stripe** (For international users)

## Installation & Setup

### Prerequisites

- Node.js & npm
- Java 17+
- MySQL & MongoDB

### Clone Repository

```sh
  git clone https://github.com/yourusername/ShopSphere.git
  cd ShopSphere
```

### Backend Setup

```sh
  cd backend
  mvn clean install
  mvn spring-boot:run
```

### Frontend Setup

```sh
  cd frontend
  npm install
  npm start
```

## Environment Variables

Create a `.env` file in both frontend and backend directories and configure the following variables:

### Backend (.env)

```sh
JWT_SECRET=your_jwt_secret
STRIPE_SECRET_KEY=your_stripe_key
RAZORPAY_API_KEY=your_razorpay_key
RAZORPAY_API_SECRET=your_razorpay_secret
DATABASE_URL=jdbc:mysql://localhost:3306/shopsphere
```

### Frontend (.env)

```sh
REACT_APP_API_URL=http://localhost:8080
REACT_APP_STRIPE_PUBLIC_KEY=your_stripe_public_key
```

## API Documentation

The API follows RESTful principles and uses JWT authentication. Detailed API documentation can be found in the `docs` directory or accessed via Postman collection.

## Security Measures

- **JWT-based authentication** for secure login
- **Role-based access control** to prevent unauthorized access
- **Data encryption** for sensitive user data
- **Secure payment processing** using Razorpay & Stripe

## Challenges & Solutions

- **Ensuring secure authentication**: Implemented JWT and Spring Security.
- **Handling payment failures**: Implemented retry mechanisms and webhook listeners.
- **Scalability concerns**: Optimized queries and used Redis caching for frequently accessed data.

## Future Improvements

- Implementing AI-powered product recommendations.
- Adding multilingual and multi-currency support.
- Enhancing analytics and reporting for sellers and admins.

## Contributing

Contributions are welcome! Please create an issue or submit a pull request for improvements.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For queries or collaborations, reach out at [your.email@example.com](mailto:saurabhshirbhate.96@gmail.com).

