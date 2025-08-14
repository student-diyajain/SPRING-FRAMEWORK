<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Error - Number Format Exception</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            color: #333;
            text-align: center;
            padding-top: 100px;
        }
        .error-container {
            display: inline-block;
            background-color: #fff;
            padding: 30px 50px;
            border-radius: 10px;
            box-shadow: 0px 4px 15px rgba(0,0,0,0.1);
            border: 2px solid #ffc107;
        }
        .error-title {
            font-size: 32px;
            color: #ffc107;
            margin-bottom: 10px;
        }
        .error-message {
            font-size: 18px;
            color: #555;
        }
        .home-link {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: #fff;
            background-color: #007bff;
            padding: 10px 20px;
            border-radius: 5px;
        }
        .home-link:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <div class="error-title">🔢 Number Format Exception</div>
        <div class="error-message">
            An invalid number format was detected while processing your request.<br>
            Please enter a valid numeric value and try again.
        </div>
        
    </div>
</body>
</html>
