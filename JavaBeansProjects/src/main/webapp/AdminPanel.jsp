<%@page import="com.sohamglobal.services.Authenticator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Admin Panel - Personal Finance Tracker</title>
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
  />
  <style>
    body {
      background: #f1f3f6;
    }
    .card {
      border: none;
      border-radius: 16px;
      color: white;
    }
    .card-title {
      font-size: 1.2rem;
    }
    .card-icon {
      font-size: 2rem;
      opacity: 0.8;
    }
  </style>
  <!-- Icons CDN -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<body>
  <div class="container py-4">
  
  
  
    <h2 class="text-center mb-4">Admin Panel - Personal Finance Tracker</h2>

    <div class="row g-4">
      <div class="col-md-4">
        <div class="card bg-primary shadow p-3">
          <div class="d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Total Balance</h5>
              <p class="card-text fs-5">$12,450</p>
            </div>
            <i class="bi bi-wallet2 card-icon"></i>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card bg-danger shadow p-3">
          <div class="d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Expenses</h5>
              <p class="card-text fs-5">$2,300</p>
            </div>
            <i class="bi bi-arrow-down-circle-fill card-icon"></i>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card bg-success shadow p-3">
          <div class="d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Incomes</h5>
              <p class="card-text fs-5">$3,800</p>
            </div>
            <i class="bi bi-arrow-up-circle-fill card-icon"></i>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card bg-warning shadow p-3">
          <div class="d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Budgets</h5>
              <p class="card-text fs-6">3 Active</p>
            </div>
            <i class="bi bi-bar-chart-steps card-icon"></i>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card bg-info shadow p-3">
          <div class="d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Reports</h5>
              <p class="card-text fs-6">Monthly, Annual</p>
            </div>
            <i class="bi bi-file-earmark-bar-graph card-icon"></i>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card bg-secondary shadow p-3">
          <div class="d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Settings</h5>
              <p class="card-text fs-6">Manage Users</p>
            </div>
            <i class="bi bi-gear-fill card-icon"></i>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
