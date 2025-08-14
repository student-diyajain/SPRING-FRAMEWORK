<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Complex Form</title>
     <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.rtl.min.css" integrity="sha384-Xbg45MqvDIk1e563NLpGEulpX6AvL404DP+/iCgW9eFa2BqztiwTexswJo2jLMue" crossorigin="anonymous">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }
        .container {
            max-width: 400px;
            background: white;
            padding: 20px;
            margin: auto;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        input, select, textarea {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            margin-top: 3px;
        }
        .gender {
            display: flex;
            gap: 10px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
        }
        button:hover {
            background-color: #0056b3;
        }
        
        
        
        
    </style>
</head>
<body>
    <div class="container">
        <h2>Complex Form</h2>
          <div class="alert alert-danger" role="alert">
        <form:errors path="user.*"/>
        </div>
        <form action="handleForm" method="post">
            <!-- Name -->
            <div class="form-group">
                <label for="name">Your name</label>
                <input type="text" name="name" placeholder="Enter Name" required>
                <small>We'll never share your name with anyone else.</small>
            </div>

            <!-- ID -->
            <div class="form-group">
                <label for="id">Your id</label>
                <input type="text" name="id" placeholder="Enter ID" required>
            </div>

            <!-- DOB -->
            <div class="form-group">
                <label for="dob">Your DOB</label>
                <input type="text" name="dob" placeholder="dd/mm/yyyy" required>
            </div>

            <!-- Courses -->
            <div class="form-group">
                <label for="courses">Select Courses</label>
                <select name="courses" multiple size="4">
                    <option>Java</option>
                    <option>Python</option>
                    <option>C++</option>
                    <option>Django</option>
                </select>
            </div>

            <!-- Gender -->
            <div class="form-group">
                <label>Select Gender</label>
                <div class="gender">
                    <label><input type="radio" name="gender" value="Male"> Male</label>
                    <label><input type="radio" name="gender" value="Female"> Female</label>
                </div>
            </div>

            <!-- Type -->
            <div class="form-group">
                <label for="type">Select Type</label>
                <select name="type">
                    <option>Normal Student</option>
                    <option>Scholarship Student</option>
                </select>
            </div>

            <!-- Address -->
            <div class="form-group">
            <label >Your Address</label>
                <input type="text" name="address.street" placeholder="Enter Street!" required>
                <input type="text" name="address.city" placeholder="Enter City!" required>
            </div>

            <!-- Submit -->
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
