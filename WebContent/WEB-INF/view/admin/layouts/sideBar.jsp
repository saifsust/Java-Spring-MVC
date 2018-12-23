<div class="wrapper ">
	<div class="sidebar" data-color="purple" data-background-color="white"
		data-image="#">
		<!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

        Tip 2: you can also add an image using data-image tag
    -->
		<!-- 		<div class="logo">
			<a href="http://www.creative-tim.com" class="simple-text logo-normal">
				Creative Tim </a>
		</div> -->
		<div class="sidebar-wrapper">
			<ul class="nav">
				<li><a href="project"> Projects</a></li>
				<li><a href="projectForm">Upload Project</a></li>
				<li><a href="admin">Admin</a></li>
				<li><a href="projectTool">Tools</a></li>
				<li><a href="serviceContentList">Service Content List</a></li>
				<li><a href="index">Home</a></li>
				<li><a href="project"> Project</a></li>
				<li><a href="project"> Project</a></li>
				<script type="text/javascript">
					var Location = location.href;

					var patt = new RegExp("admin");
					if (patt.test(Location) == true) {
						document
								.write("<li class='nav-item'><a class='nav-link' href='index'>"
										+ "<i class=''></i> <p>Home</p></a></li>");
						document
								.write("<li class='nav-item active '><a class='nav-link' href='admin'>"
										+ "<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>");
						document
								.write("<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>"
										+ "<i class=''></i> <p>Home Contents</p></a></li>");
						document
								.write("<li class='nav-item'><a class='nav-link' href='homeContents'>"
										+ "<i class=''></i> <p>Home Contents List</p></a></li>");
						document
								.write("<li class='nav-item'><a class='nav-link' href='rank'>"
										+ "<i class=''></i> <p>rank</p></a></li>");
						document
								.write("<li class='nav-item '><a class='nav-link' href='engineer'>"
										+ "<i class=''></i> <p>Engineer</p></a></li>");

					} else {

						var patt = new RegExp("uploadHomeContents");
						if (patt.test(Location) == true) {
							document
									.write("<li class='nav-item'><a class='nav-link' href='index'>"
											+ "<i class=''></i> <p>Home</p></a></li>");

							document
									.write("<li class='nav-item'><a class='nav-link' href='admin'>"
											+ "<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>");
							document
									.write("<li class='nav-item active '><a class='nav-link' href='uploadHomeContents'>"
											+ "<i class=''></i> <p>Home Contents</p></a></li>");
							document
									.write("<li class='nav-item'><a class='nav-link' href='homeContents'>"
											+ "<i class=''></i> <p>Home Contents List</p></a></li>");
							document
									.write("<li class='nav-item'><a class='nav-link' href='rank'>"
											+ "<i class=''></i> <p>rank</p></a></li>");
							document
									.write("<li class='nav-item '><a class='nav-link' href='engineer'>"
											+ "<i class=''></i> <p>Engineer</p></a></li>");

						} else {
							var patt = new RegExp("homeContents");
							if (patt.test(Location) == true) {
								document
										.write("<li class='nav-item'><a class='nav-link' href='index'>"
												+ "<i class=''></i> <p>Home</p></a></li>");
								document
										.write("<li class='nav-item'><a class='nav-link' href='admin'>"
												+ "<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>");
								document
										.write("<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>"
												+ "<i class=''></i> <p>Home Contents</p></a></li>");
								document
										.write("<li class='nav-item active '><a class='nav-link' href='homeContents'>"
												+ "<i class=''></i> <p>Home Contents List</p></a></li>");
								document
										.write("<li class='nav-item'><a class='nav-link' href='rank'>"
												+ "<i class=''></i> <p>rank</p></a></li>");
								document
										.write("<li class='nav-item '><a class='nav-link' href='engineer'>"
												+ "<i class=''></i> <p>Engineer</p></a></li>");

							} else {
								var patt = new RegExp("rank");
								if (patt.test(Location) == true) {
									document
											.write("<li class='nav-item'><a class='nav-link' href='index'>"
													+ "<i class=''></i> <p>Home</p></a></li>");
									document
											.write("<li class='nav-item'><a class='nav-link' href='admin'>"
													+ "<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>");
									document
											.write("<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>"
													+ "<i class=''></i> <p>Home Contents</p></a></li>");
									document
											.write("<li class='nav-item'><a class='nav-link' href='homeContents'>"
													+ "<i class=''></i> <p>Home Contents List</p></a></li>");
									document
											.write("<li class='nav-item active'><a class='nav-link' href='rank'>"
													+ "<i class=''></i> <p>rank</p></a></li>");
									document
											.write("<li class='nav-item '><a class='nav-link' href='engineer'>"
													+ "<i class=''></i> <p>Engineer</p></a></li>");

								} else {
									var patt = new RegExp("engineer");
									if (patt.test(Location) == true) {
										document
												.write("<li class='nav-item'><a class='nav-link' href='index'>"
														+ "<i class=''></i> <p>Home</p></a></li>");
										document
												.write("<li class='nav-item'><a class='nav-link' href='admin'>"
														+ "<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>");
										document
												.write("<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>"
														+ "<i class=''></i> <p>Home Contents</p></a></li>");
										document
												.write("<li class='nav-item'><a class='nav-link' href='homeContents'>"
														+ "<i class=''></i> <p>Home Contents List</p></a></li>");
										document
												.write("<li class='nav-item '><a class='nav-link' href='rank'>"
														+ "<i class=''></i> <p>rank</p></a></li>");
										document
												.write("<li class='nav-item active'><a class='nav-link' href='engineer'>"
														+ "<i class=''></i> <p>Engineer</p></a></li>");

									} else {

									}

								}

							}

						}
					}
				</script>

			</ul>
		</div>
	</div>