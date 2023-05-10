<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Car Wash</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div id="header">
		<div>
			<div class="logo">
				<a href="index.jsp">Car Wash</a>
			</div>
			<ul id="navigation">
				<li class="active">
					<a href="index.jsp">Home</a>
				</li>
				<li>
					<a href="features.jsp">Features</a>
				</li>
				<li>
					<a href="news.jsp">News</a>
				</li>
				<li>
					<a href="about.jsp">About</a>
				</li>
				<li>
					<a href="contact.jsp">Contact</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="adbox">
		<div class="clearfix">
			<img src="images/building.png" alt="Img" height="342" width="368">
			<div>
				<h1>Need a car wash?</h1>
				<h2>That's what we're here for.</h2>
				<p>
					Sit back, relax, and coast into luxury. Whether it's a convertible or the family car, we'll treat your vehicle with the care and attention to detail it deserves..
				</p>
			</div>
		</div>
	</div>
	<div id="contents">
		<div id="tagline" class="clearfix">
			<h1>Car Wash Membership Form</h1>
			<div>
				<p>
					<form method="get" action="ProjectServlet">
						First Name: <br/>
						<input type ="text" name="firstname"><br/><br/>
						Last Name: <br/>
						<input type ="text" name="lastname"><br/><br/>
						Phone Number: <br/>
						<input type ="text" name="phone"><br/><br/>
						E-mail Address: <br/>
						<input type ="text" name="email"><br/><br/>
						Car Make: <br/>
						<input type ="text" name="make"><br/><br/>
						Car Model: <br/>
						<input type ="text" name="model"><br/><br/>
						Model Year: <br/>
						<input type ="text" name="year"><br/><br/>
						License Plate Number: <br/>
						<input type ="text" name="plate"><br/><br/>
						<input type="submit" value="Submit">
					
					</form>
				</p>
			</div>
			<div>
				<p>
					Our car wash offers a variety of safe, gentle interior services to help your ride stay sparkling, inside and out.
				</p>
				<p>
					Our first-class interior and exterior surfaces deep clean every inch of your car. Pull up to our service bays after your wash and let us do the rest.
				</p>
				<p>
					Treat yourself to that clean car feeling every day. Our Unlimited packages will keep your ride shined, spotless, and showroom ready all month long.
				</p>
				<p>
						<form action="customerslist.jsp" method="GET">
						<input type="submit" value="Customers List "/>
						</form>
				</p>
				
			</div>
		</div>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div id="connect">
				<a href="http://freewebsitetemplates.com/go/facebook/" target="_blank" class="facebook"></a><a href="http://freewebsitetemplates.com/go/googleplus/" target="_blank" class="googleplus"></a><a href="http://freewebsitetemplates.com/go/twitter/" target="_blank" class="twitter"></a><a href="http://www.freewebsitetemplates.com/misc/contact/" target="_blank" class="tumbler"></a>
			</div>
			<p>
				© 2023 Zerotype. All Rights Reserved.
			</p>
		</div>
	</div>
</body>
</html>