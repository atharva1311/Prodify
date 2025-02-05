<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Update Page</title>
</head>
<body>
    <jsp:include page="navbar.jsp"></jsp:include>

    <section class="vh-100 bg-image" style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
        <div class="mask d-flex align-items-center h-100 gradient-custom-3">
            <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                        <div class="card" style="border-radius: 15px;">
                            <div class="card-body p-5">
                                <h2 class="text-uppercase text-center mb-5">Update Product Details</h2>

                                <!-- Display any error or success message -->
                                <c:if test="${not empty message}">
                                    <div class="alert alert-success">${message}</div>
                                </c:if>
                                <c:if test="${not empty error}">
                                    <div class="alert alert-danger">${error}</div>
                                </c:if>

                                <!-- Form to Update Product -->
                                <form action="/product/update" method="post">
                                    <input type="hidden" name="_csrf" value="${_csrf.token}" />

                                    <div class="form-outline mb-4">
                                        <input type="number" name="pid" id="form3Example1cg" class="form-control form-control-lg" placeholder="Product Id *" value="${p.pid}" readonly />
                                    </div>
                                    <div class="form-outline mb-4">
                                        <input type="text" name="name" id="form3Example1cg" class="form-control form-control-lg" placeholder="Product Name *" value="${p.name}" required />
                                    </div>
                                    <div class="form-outline mb-4">
                                        <input type="number" name="price" id="form3Example1cg" class="form-control form-control-lg" placeholder="Price *" value="${p.price}" required min="1" />
                                    </div>
                                    <div class="form-outline mb-4">
                                        <input type="number" name="quantity" id="form3Example1cg" class="form-control form-control-lg" placeholder="Quantity *" value="${p.quantity}" required min="1" />
                                    </div>
                                    <div class="form-outline mb-4">
                                        <input type="text" name="category" id="form3Example1cg" class="form-control form-control-lg" placeholder="Category *" value="${p.category}" required />
                                    </div>

                                    <div class="d-flex justify-content-center">
                                        <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Update</button>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>
