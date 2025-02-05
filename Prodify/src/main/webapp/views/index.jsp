<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Product Management</title>
    <link rel="stylesheet" href="css/styles.css"> <!-- Link to custom CSS -->
</head>
<body>
    <!-- Include the Navbar -->
    <jsp:include page="navbar.jsp"></jsp:include>

    <!-- Hero Section -->
    <header class="hero-section">
        <div class="hero-content">
            <h1>Welcome to Product Management System</h1>
            <p>Effortlessly manage your products with powerful tools.</p>
            <a href="/product/add" class="btn">Get Started</a> <!-- Updated link -->
        </div>
    </header>
</body>
</html>
