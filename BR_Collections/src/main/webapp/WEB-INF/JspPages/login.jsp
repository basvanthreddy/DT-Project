<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to login page</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
<div class="container-fluid">
<ul class="nav navbar-nav">
<li><a href="#">home</span></a></li>
<li><a href="#">basket</span></a></li>
</ul>
</div>
</nav>

<div class="container jumbotron" style="margin-top:-20px;">
<h3>Login</h3>
<button type="button" class="btn btn-primary">Continue Shopping</button>
</div>


<div class="container">
  <div class="page-header">
    <h4>Please Login</h4>      
  </div>

username<br/>
<input type= "text" name="username"><br/>
password<br/>
<input type="password" name="password"><br/><br/>
<div class="jumbotorn">
	<button type="button" class="btn btn-info btn-sm">Login</button> 
    </div>     
   
</div>
<br/>
	
	
	
	

 <footer class="container" style="border-top:1px solid #eee">
<br/>
   @niit-Gadgetsworld-2018; Last Updated: <%= new java.util.Date() %>

</footer>


</body>
</html>