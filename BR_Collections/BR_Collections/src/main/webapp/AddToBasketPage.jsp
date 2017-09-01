<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
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

<div class="container">
<div class="jumbotron">
<h3>Basket</h3>
<button type="button" class="btn btn-primary">Continue Shopping</button>
</div>
</div>

<div class="container">
<table class="table table-striped">
<tbody>

<tr>
<td>Product Type</td>
<td> Mobile</td>
</tr>

<tr>
<td>Name</td>
<td> iphone-7</td>
</tr>

<tr>
<td>Discription</td>
<td> screen-6.5inch, camera-20px,4GB-Ram,2days battery backup</td>
</tr>

<tr>
<td>Supplier</td>
<td> Apple Company</td>
</tr>

<tr>
<td>Price</td>
<td> 70000</td>
</tr>
</tbody>
</table>
<button type="button" class="btn btn-default col-sm-offset-1">AddToBasket</button>
<br/>
</div>



 <footer class="container" style="border-top:1px solid #eee">
<br/>
   @niit-Gadgetsworld-2018; Last Updated: <%= new java.util.Date() %>

</footer>

</body>


</body>
</html>