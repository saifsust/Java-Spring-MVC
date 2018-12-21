<%@page import="java.awt.Image"%>
<%@page import="com.application.businessLogic.ImageFactory"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Header Contents -->
<jsp:include page="layouts/header.jsp" />

<body>
	<jsp:include page="layouts/navbar.jsp" />
	<!-- -->

	<%= request.getAttribute("header") %>

	<!-- 	<div style="background: url(http://localhost:8080/Saiful_IT_SOLUTION//storage//home//2f84fbe_header-bg.jpg) no-repeat center top;"
		id="headerwrap">
		<div class="container">
			<div class="row centered">
				<div class="col-lg-8 col-lg-offset-2">
					<h1>
						It Doesn't Take a Rocket <b>Scientist</b>
					</h1>
					<h2>It Takes a Designer</h2>
				</div>
			</div>
			row
		</div>
		container
	</div> -->
	<!-- headerwrap -->


	<div class="container w">
		<div class="row centered">
			<br> <br>
			<div class="col-lg-4">
				<i class="fa fa-heart"></i>
				<h4>DESIGN</h4>
				<p>There are many variations of passages of Lorem Ipsum
					available, but the majority have suffered alteration in some form,
					by injected humour, or randomised words which don't look even
					believable.</p>
			</div>
			<!-- col-lg-4 -->

			<div class="col-lg-4">
				<i class="fa fa-laptop"></i>
				<h4>BOOTSTRAP</h4>
				<p>There are many variations of passages of Lorem Ipsum
					available, but the majority have suffered alteration in some form,
					by injected humour, or randomised words which don't look even
					believable.</p>
			</div>
			<!-- col-lg-4 -->

			<div class="col-lg-4">
				<i class="fa fa-trophy"></i>
				<h4>SUPPORT</h4>
				<p>There are many variations of passages of Lorem Ipsum
					available, but the majority have suffered alteration in some form,
					by injected humour, or randomised words which don't look even
					believable.</p>
			</div>
			<!-- col-lg-4 -->
		</div>
		<!-- row -->
		<br> <br>
	</div>
	<!-- container -->


	<!-- PORTFOLIO SECTION -->
	<div id="dg">
		<div class="container">
			<div class="row centered">
				<h4>LATEST WORKS</h4>
				<br>
				<div class="col-lg-4">
					<div class="tilt">
						<a href="#"><img src='<c:url value ="user/img/p01.png"/>'
							alt=""></a>
					</div>
				</div>

				<div class="col-lg-4">
					<div class="tilt">
						<a href="#"><img src='<c:url value ="user/img/p03.png"/>'
							alt=""></a>
					</div>
				</div>

				<div class="col-lg-4">
					<div class="tilt">
						<a href="#"><img src='<c:url value ="user/img/p02.png"/>'
							alt=""></a>
					</div>
				</div>
			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<!-- DG -->


	<!-- FEATURE SECTION -->
	<div class="container wb">
		<div class="row centered">
			<br> <br>
			<div class="col-lg-8 col-lg-offset-2">
				<h4>WE CREATE FIRST CLASS DESIGN</h4>
				<p>By being true to the brand we represent, we elevate the
					audiences’ relationship to it. Like becomes love becomes a
					passion. Passion becomes advocacy. And we see the brand blossom
					from within, creating a whole story the audience embraces. That’s
					when the brand can truly flex its muscles.</p>
				<p>
					<br /> <br />
				</p>
			</div>
			<div class="col-lg-2"></div>
			<div class="col-lg-10 col-lg-offset-1">
				<img class="img-responsive"
					src='<c:url value ="user/img/munter.png"/>' alt="">
			</div>
		</div>
		<!-- row -->
	</div>
	<!-- container -->


	<div id="lg">
		<div class="container">
			<div class="row centered">
				<h4>OUR AWESOME CLIENTS</h4>
				<div class="col-lg-2 col-lg-offset-1">
					<img src='<c:url value ="user/img/c01.gif"/>' alt="">
				</div>
				<div class="col-lg-2">
					<img src='<c:url value ="user/img/c02.gif"/>' alt="">
				</div>
				<div class="col-lg-2">
					<img src='<c:url value ="user/img/c03.gif"/>' alt="">
				</div>
				<div class="col-lg-2">
					<img src='<c:url value ="user/img/c04.gif"/>' alt="">
				</div>
				<div class="col-lg-2">
					<img src='<c:url value ="user/img/c05.gif"/>' alt="">
				</div>
			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<!-- dg -->


	<div id="r">
		<div class="container">
			<div class="row centered">
				<div class="col-lg-8 col-lg-offset-2">
					<h4>WE ARE STORYTELLERS. BRANDS ARE OUR SUBJECTS. DESIGN IS
						OUR VOICE.</h4>
					<p>We believe ideas come from everyone, everywhere. At
						BlackTie, everyone within our agency walls is a designer in their
						own right. And there are a few principles we believe—and we
						believe everyone should believe—about our design craft. These
						truths drive us, motivate us, and ultimately help us redefine the
						power of design.</p>
				</div>
			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<! -- r wrap -->


	<!-- FOOTER -->
	<div id="f">
		<div class="container">
			<div class="row centered">
				<a href="#"><i class="fa fa-twitter"></i></a><a href="#"><i
					class="fa fa-facebook"></i></a><a href="#"><i
					class="fa fa-dribbble"></i></a>

			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<!-- Footer -->


	<!-- MODAL FOR CONTACT -->
	<!-- Modal -->
	<jsp:include page="layouts/model.jsp" />
	<!-- /.modal -->



	<script src='<c:url value ="user/js/bootstrap.min.js"/>'></script>
</body>
</html>
