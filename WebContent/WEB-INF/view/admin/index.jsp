
<jsp:include page="layouts/header.jsp" />
<body class="">
	<!-- Side bar -->
	<jsp:include page="layouts/sideBar.jsp" />
	<div class="main-panel">
		<!-- Navbar -->
		<jsp:include page="layouts/navbar.jsp" />
		<!-- End Navbar -->
		<div class="content">
			<h1>Hello World</h1>
		</div>
		<!--  footer -->
		<jsp:include page="layouts/footer.jsp" />
	</div>
	</div>
	<!--   Core JS Files   -->
	<script src='<c:url value="admin/js/core/jquery.min.js"/>'
		type="text/javascript"></script>
	<script src='<c:url value = "admin/js/core/popper.min.js"/>'
		type="text/javascript"></script>
	<script
		src='<c:url value= "admin/js/core/bootstrap-material-design.min.js"/>'
		type="text/javascript"></script>
	<script
		src='<c:url value = "admin/js/plugins/perfect-scrollbar.jquery.min.js"/>'></script>
	<!--  Google Maps Plugin    -->
	<script
		src='<c:url value = "https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"/>'></script>
	<!-- Chartist JS -->
	<script src='<c:url value ="admin/js/plugins/chartist.min.js"/>'></script>
	<!--  Notifications Plugin    -->
	<script src='<c:url value = "admin/js/plugins/bootstrap-notify.js"/>'></script>
	<!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
	<script
		src='<c:url value = "admin/js/material-dashboard.min.js?v=2.1.0"/>'
		type="text/javascript"></script>
	<!-- Material Dashboard DEMO methods, don't include it in your project! -->
	<script src='<c:url value ="admin/demo/demo.js"/>'></script>
	<script>
		$(document).ready(function() {
			// Javascript method's body can be found in assets/js/demos.js
			md.initDashboardPageCharts();

		});
	</script>
</body>

</html>