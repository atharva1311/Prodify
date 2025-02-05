<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/displaypage.css"> <!-- Link to the custom CSS -->
</head>
<body>
    <jsp:include page="navbar.jsp"></jsp:include>
    <br>
    
    <!-- Display messages -->
    <c:if test="${not empty message}">
        <div class="alert alert-success">${message}</div>
    </c:if>
    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>

    <h1>All Products Data</h1>
    <div class="container table-responsive py-5">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th scope="col">Pid</th>
                    <th scope="col">Product Name</th>
                    <th scope="col">Price</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Category</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${products}">
                    <tr>
                        <th scope="row">${p.pid}</th>
                        <td>${p.name}</td>
                        <td>${p.price}</td>
                        <td>${p.quantity}</td>
                        <td>${p.category}</td>
                        <td>
                            <a href="/product/view?pid=${p.pid}" class="btn btn-warning">UPDATE</a> 
                            &nbsp; 
                            <a href="/product/delete?pid=${p.pid}" class="btn btn-danger">DELETE</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
