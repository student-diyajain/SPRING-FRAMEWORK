<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!doctype html>
<html lang="ar" dir="rtl">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.rtl.min.css" integrity="sha384-Xbg45MqvDIk1e563NLpGEulpX6AvL404DP+/iCgW9eFa2BqztiwTexswJo2jLMue" crossorigin="anonymous">

    <title>Search Engine</title>
    <link 
     rel="stylesheet" 
     href="<c:url value="/resources/css/style.css"></c:url>" />

</head>
<body>
<div class="container">

    <div class="card mx-auto mt-5 bg-secondary" style="width:50%;">
    
        <div class="card-body py-5">
        <h3 class="text-center text-white">Search Engine</h3>
        
            <form class="mt-3" action="searchData" method="post">
            
              <div class="form-group">
              <input   style=" text-align: left;" placeholder="Search" type="text" name="message"   class="form-control">
              </div>
              <br>
              <div class="container text-center">
              <button class="btn btn-outline-primary">Search</button>
              </div>
              
            </form>
            
        </div>
        
    </div>
    
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>