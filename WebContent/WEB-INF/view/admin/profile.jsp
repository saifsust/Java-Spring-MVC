
<%@page import="com.application.model.Rank"%>
<%@page import="java.util.List"%>
<jsp:include page="layouts/header.jsp" />
<body class="">
	<!-- Side bar -->
	<jsp:include page="layouts/sideBar.jsp" />
	<div class="main-panel">
		<!-- Navbar -->
		<jsp:include page="layouts/navbar.jsp" />
		<!-- End Navbar -->
		<div class="content">
			<form method="post" action="uploadEngineer" modelAttribute="engineer"
				enctype="multipart/form-data">
				<!-- First Name -->
				<div class="form-group">
					<input type="text" name="first_name" class="form-control"
						placeholder="First Name" />
				</div>
				<!--  Last Name -->
				<div class="form-group">
					<input type="text" name="last_name" class="form-control"
						placeholder="Last Name" />
				</div>
				<!-- Picture -->

				<input type="file" name="engineer_img" />

				<!--  About Your Self -->
				<div class="form-group">
					<textarea rows="10" cols="50" name="about_your_self"
						placeholder="About Your Self"></textarea>
				</div>
				<!-- user Id -->
				<div class="form-group">
					<input type="text" name="user_id" class="form-control"
						placeholder="user id" />
				</div>
				<!-- user password -->
				<div class="form-group">
					<input type="password" name="password" class="form-control"
						placeholder="password" />
				</div>
				<!--  Mail-->
				<div class="form-group">
					<input type="email" name="mail" class="form-control"
						placeholder="Mail" />
				</div>

				<!--  Selection-->
				<div class="form-group">
					<select name="rank_id">
						<%
							List<Rank> ranks = (List<Rank>) request.getAttribute("ranks");
							for (Rank rank : ranks) {
						%>
						<option value="<%=rank.getRank_id()%>"><%=rank.getRank()%>
						</option>
						<%
							}
						%>

					</select>
				</div>

				<!-- -Submit -->
				<input type="submit" name="submit" class="btn primary-btn" />
			</form>


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