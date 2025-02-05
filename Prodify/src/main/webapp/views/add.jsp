<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" 
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <link rel="stylesheet" href="css/addpage.css">
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
                            <h2 class="text-uppercase text-center mb-5">Add Product Details</h2>

                            <!-- Display error or success message -->
                            <c:if test="${not empty error}">
                                <div class="alert alert-danger">${error}</div>
                            </c:if>
                            <c:if test="${not empty message}">
                                <div class="alert alert-success">${message}</div>
                            </c:if>

                            <!-- Form to Add Product -->
                            <form action="/product/insert" method="post">
                                <input type="hidden" name="_csrf" value="${_csrf.token}" />
                                
                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example1cg">Product Name</label>
                                    <input type="text" name="name" id="form3Example1cg" class="form-control form-control-lg" required />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example1cg">Product Price</label>
                                    <input type="number" name="price" id="form3Example1cg" class="form-control form-control-lg" required min="1" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example1cg">Product Quantity</label>
                                    <input type="number" name="quantity" id="form3Example1cg" class="form-control form-control-lg" required min="1" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example1cg">Product Category</label>
                                    <input type="text" name="category" id="form3Example1cg" class="form-control form-control-lg" required />
                                </div>

                                <div class="d-flex justify-content-center">
                                    <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Save</button>
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
