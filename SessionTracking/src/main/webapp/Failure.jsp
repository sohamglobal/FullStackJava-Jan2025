<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Authentication Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #4a0808, #173590);
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            text-align: center;
            background: rgba(0, 0, 0, 0.5);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
        }
        h1 {
            font-size: 3rem;
            margin-bottom: 20px;
        }
        p {
            font-size: 1.2rem;
            margin-bottom: 30px;
        }
        a {
            text-decoration: none;
            color: #ffdddd;
            background: #ff4444;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 1rem;
            transition: background 0.3s ease;
        }
        a:hover {
            background: #ff2222;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Authentication Failed</h1>
        <p>Sorry, we couldn't verify your credentials. Please try again.</p>
        <a href="index.html">Go Back to Login</a>
    </div>
</body>
</html>