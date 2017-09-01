<!DOCTYPE html>
<html lang="en">
<head>
  <title>MyLandingPage</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
 
<nav class="container-fluid navbar navbar-inverse">

<div class="navbar-header">		
<a class="navbar-brand" href="#">MyCollections</a>
</div>
<ul class="nav navbar-nav navbar-right" >
<li><a href="RegisterationPage.jsp"><span class="glyphicon glyphicon-user"></span>Sign-Up</a></li>
<li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
    </ul>
</nav>


<div class="container jumbotron" style="margin-top:-20px;">
<h3>My-Gadgets!!</h3>
<h4>Welcome to the world of gadgets!</h4>
</div>


<div class="container-fluid">
<div class="page-header">
<h4>Products</h4>
</div>
<p><b>The list of the most popular gadgets and its price.</b></p>
<table class="table table-bordered">
	<thead>
	<tr class="info">
	<th>Names</th>
	<th> price</th>
	</tr>
	</thead>
	
	<tbody>
	<tr class="warning">
	<td>iphone-7</td>
	<td>65000</td>
	</tr>
	
	<tr class="warning">
	<td>samsung-S8</td>
	<td>50000</td>
	</tr>
	
	<tr class="warning">
	<td>ipod-3</td>
	<td>5000</td>
	</tr>
	
	<tr class="warning">
	<td>imac</td>
	<td>165000</td>
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
