
<%@page import="com.application.model.Home"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="layouts/header.jsp" />
<body class="">
	<!-- Side bar -->
	<jsp:include page="layouts/sideBar.jsp" />
	<div class="main-panel">
		<!-- Navbar -->
		<jsp:include page="layouts/navbar.jsp" />
		<!-- End Navbar -->
		<div class="content">
			<%
				List<Home> populated = (List<Home>) request.getAttribute("populated");
			%>

			<div class="table-responsive">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Serial No.</th>
							<th></th>
							<th>Header</th>
							<th>Header_img</th>
							<th>End Header</th>
							<th>End Detail</th>
						</tr>
					</thead>

					<tbody id="home">
						<%
							String checkBox = "";
							for (Home home : populated) {
								//out.println(checkBox);
								checkBox = "checkbox_" + home.getHome_id();
						%>


						<tr>
							<th scope="row"><%=home.getHome_id()%></th>
							<td><input type="checkbox" onclick="checkBoxClick(this)"
								value="<%=home.getHome_id()%>" /></td>
							<td><%=home.getHeader()%></td>
							<td><img src='<c:url value ="<%=home.getHeader_img()%>" />'
								class="img-thumbnail" style="width: 100px; heigth: 50px;"
								alt="image not found" /></td>
							<td><%=home.getEnd_header()%></td>
							<td><%=home.getEnd_detail()%></td>

						</tr>
						<%
							}
						%>

					</tbody>
				</table>
				<script type="text/javascript">
					function checkBoxClick(checkboxVar) {

						//console.log(checkboxVar['value']);
						var check = checkboxVar['checked'];

						//console.log(check);

						if (check == true) {

							$.ajax({
								type : "POST",
								url : "selectedHome/" + checkboxVar['value']

							}).done(function() {

							}).fail(function() {
								console.log("ajax ERROR");
							});

							//console.log("Hello Wolrd");

						} else {
							if (check == false) {

								$.ajax(
										{
											type : "POST",
											url : "unselectedHome"

										}).done(function() {

								}).fail(function() {
									console.log("ajax ERROR");
								});

							}
						}

					}
				</script>

			</div>
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
	<%-- 
	<script src='<c:url value ="admin/js/plugins/chartist.min.js"/>'></script>
	<!--  Notifications Plugin    --> --%>
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