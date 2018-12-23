<%@page import="com.application.views.ProjectToolView"%>
<%@page import="com.application.views.RankView"%>
<%@page import="com.application.model.ProjectTool"%>
<%@page import="com.application.model.Rank"%>
<%@page import="java.util.*"%>
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
				int check = (int) request.getAttribute("check");
				switch (check) {
					case 1 :
						out.println(request.getAttribute("ranks"));
						out.println(request.getAttribute("rankForm"));
						break;
					case 2 :

						out.println(request.getAttribute("tools")+"\n");
						out.println(request.getAttribute("projectToolForm")+"\n");
						break;

					case 3 :
						out.println(request.getAttribute("projects"));
						break;
					case 4 :
						out.println(request.getAttribute("project_form"));
						//out.println(request.getAttribute(""));
						break;
					case 5 :
						out.println(request.getAttribute("profileForm"));
						break;

					case 6 :
						// service content form
						out.println(request.getAttribute("form"));
						break;

				}
			%>
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