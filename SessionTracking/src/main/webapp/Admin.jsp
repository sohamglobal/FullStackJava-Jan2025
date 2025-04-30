<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Admin Dashboard - Showroom</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
    }
    .sidebar {
      min-height: 100vh;
      background-color: #343a40;
      color: white;
    }
    .sidebar a {
      color: #ccc;
      display: block;
      padding: 12px 20px;
      text-decoration: none;
    }
    .sidebar a:hover {
      background-color: #495057;
      color: white;
    }
    .content-area {
      padding: 2rem;
    }
  </style>
</head>
<body>
<%
if(session.getAttribute("userid")!=null)
{
%>
  <!-- Navbar -->
  <nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
      <span class="navbar-brand mb-0 h1">Showroom Admin Dashboard</span>
      <a href="Logout.jsp" class="btn btn-outline-light">Logout</a>
    </div>
  </nav>

  <div class="container-fluid">
    <div class="row">
      <!-- Sidebar -->
      <div class="col-md-3 col-lg-2 sidebar">
        <h5 class="mt-4 ms-3">Product Management</h5>
        <a href="#">Add New Product</a>
        <a href="#">View Products</a>
        <a href="#">Update Product</a>
        <a href="#">Delete Product</a>
        <a href="#">Product Categories</a>
        <a href="#">Stock Status</a>
      </div>

      <!-- Main Content -->
      <div class="col-md-9 col-lg-10 content-area">
        <h2>Welcome, <%=session.getAttribute("userid")%></h2>
        <%=session.getId()%>
        <br>
        <p>Use the side menu to manage showroom products, inventory, and categories.</p>

        <div class="row mt-4">
          <div class="col-md-4">
            <div class="card shadow">
              <div class="card-body">
                <h5 class="card-title">Total Products</h5>
                <p class="card-text">345</p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card shadow">
              <div class="card-body">
                <h5 class="card-title">Low Stock Alerts</h5>
                <p class="card-text">12 items</p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card shadow">
              <div class="card-body">
                <h5 class="card-title">Categories</h5>
                <p class="card-text">8</p>
              </div>
            </div>
          </div>
        </div>

      </div>
    </div>
  </div>
  
  <%
}
else
{
	%>
	<h2>Invalid Session...</h2>
	<a href="index.html">Login Now</a>
	
	<%
}
  %>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
