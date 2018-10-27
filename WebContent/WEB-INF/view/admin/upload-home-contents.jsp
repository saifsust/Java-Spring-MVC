<!-- Header  -->
<jsp:include page="layouts/header.jsp" />

<body class="">
	<jsp:include page="layouts/sideBar.jsp" />
	<div class="main-panel">
		<!-- Navbar -->
		<jsp:include page="layouts/navbar.jsp" />
		<!-- End Navbar -->
		<div class="content">
			<div class="container-fluid">

				<form method="post" modelAttribute="home" 
					action="uploadHomeContents" enctype="multipart/form-data">
					<div class="form-group">
						<input type="text" name="header" class="form-control"
							placeholder="Header" />
					</div>

					<div class="form-control">
						<input type="file" name="headerImg" placeholder="file" />
					</div>
					<div class="form-group">
						<input type="text" name="end_header" class="form-control"
							placeholder="End Header" />
					</div>
					<div class="form-group">
					<textarea rows="10%" cols="50%" placeholder="Detail" name="end_detail" ></textarea>
					</div>
					<input type="submit" name="submit" class="btn primary-btn" />
				</form>

			</div>
		</div>
		<footer class="footer">
			<div class="container-fluid">
				<nav class="float-left">
					<ul>
						<li><a href="https://www.creative-tim.com"> Creative Tim
						</a></li>
						<li><a href="https://creative-tim.com/presentation">
								About Us </a></li>
						<li><a href="http://blog.creative-tim.com"> Blog </a></li>
						<li><a href="https://www.creative-tim.com/license">
								Licenses </a></li>
					</ul>
				</nav>
				<div class="copyright float-right">
					&copy;
					<script>
						document.write(new Date().getFullYear())
					</script>
					, made with <i class="material-icons">favorite</i> by <a
						href="https://www.creative-tim.com" target="_blank">Creative
						Tim</a> for a better web.
				</div>
			</div>
		</footer>
	</div>
	</div>
	<!--   Core JS Files   -->
	<script src="assets/js/core/jquery.min.js" type="text/javascript"></script>
	<script src="assets/js/core/popper.min.js" type="text/javascript"></script>
	<script src="assets/js/core/bootstrap-material-design.min.js"
		type="text/javascript"></script>
	<script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
	<!--  Google Maps Plugin    -->
	<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
	<!-- Chartist JS -->
	<script src="assets/js/plugins/chartist.min.js"></script>
	<!--  Notifications Plugin    -->
	<script src="assets/js/plugins/bootstrap-notify.js"></script>
	<!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
	<script src="assets/js/material-dashboard.min.js?v=2.1.0"
		type="text/javascript"></script>
	<!-- Material Dashboard DEMO methods, don't include it in your project! -->
	<script src="assets/demo/demo.js"></script>
</body>

</html>