<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Basket</title>
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
<li><a href="#">Home</a></li>
<li><a href="#">Basket</a></li>
<li><a href="#">View Profile></a></li>
<li><a href="#">Logout></a></li>
</ul>
</div>
</nav>

<div class="container jumbotron" style="margin-top:-20px;">
<h3>Basket</h3>
<button type="button" class="btn btn-primary">Continue Shopping</button>
</div>
 
 <div class="container">
 <p><strong>Your Basket Contains Best Item(s)!!</strong></p>
 <table class="table table-default">
<thead>
<tr>
<th>Names</th>
</thead>

<tbody>
<tr class="warning">
<td>iphone-7</td>
<td><button type ="button" class="btn btn-default" style="full-right">remove</button></td>
</tr>

<tr class="warning">
<td>samsung-S8</td>
<td><button type ="button" class="btn btn-default">remove</button></td>
</tr>

<tr class="warning">
<td>MI-4</td>
<td><button type ="button" class="btn btn-default">remove</button></td>
</tr>
</tbody>

</table>
 </div>
 
<footer class="container" style="border-top:1px solid #eee">
<br/>
   @niit-Gadgetsworld-2018; Last Updated: <%= new java.util.Date() %>

</footer>

</body>
</html>