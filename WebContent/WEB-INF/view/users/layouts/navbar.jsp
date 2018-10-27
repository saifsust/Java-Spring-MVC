
<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">SP<i class="fa fa-circle"></i>T
			</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">

				<!-- Java Script implementation of Menu -->
				<script type="text/javascript">
					var Location = location.href;
					var patt = new RegExp("index");
					if (patt.test(Location) == true) {

						document
								.write('<li class ="active"><a href="index">HOME</a></li>');
						document.write('<li><a href="about">ABOUT</a></li>');
						document
								.write('<li><a href="services">SERVICE</a></li>');
						document.write('<li><a href="works">WORKS</a></li>');
						document.write('<li><a href="admin">ADMIN</a></li>');

					} else {
						patt = new RegExp("about");
						if (patt.test(Location) == true) {
							document.write('<li><a href="index">HOME</a></li>');
							document
									.write('<li  class ="active"><a href="about">ABOUT</a></li>');
							document
									.write('<li><a href="services">SERVICE</a></li>');
							document
									.write('<li><a href="works">WORKS</a></li>');
							document
									.write('<li><a href="admin">ADMIN</a></li>');
						} else {
							patt = new RegExp("services");
							if (patt.test(Location) == true) {
								document
										.write('<li><a href="index">HOME</a></li>');
								document
										.write('<li><a href="about">ABOUT</a></li>');
								document
										.write('<li class ="active"><a href="services">SERVICE</a></li>');
								document
										.write('<li><a href="works">WORKS</a></li>');
								document
										.write('<li><a href="admin">ADMIN</a></li>');

							} else {
								patt = new RegExp("works");
								if (patt.test(Location) == true) {
									document
											.write('<li><a href="index">HOME</a></li>');
									document
											.write('<li><a href="about">ABOUT</a></li>');
									document
											.write('<li><a href="services">SERVICE</a></li>');
									document
											.write('<li class ="active"><a href="works">WORKS</a></li>');
									document
											.write('<li><a href="admin">ADMIN</a></li>');

								} else {

									patt = new RegExp("admin");
									if (patt.test(Location) == true) {
										document
												.write('<li><a href="index">HOME</a></li>');
										document
												.write('<li><a href="about">ABOUT</a></li>');
										document
												.write('<li><a href="services">SERVICE</a></li>');
										document
												.write('<li><a href="works">WORKS</a></li>');
										document
												.write('<li class ="active"><a href="admin">ADMIN</a></li>');

									} else {
										document
												.write('<li class ="active" ><a href="index">HOME</a></li>');
										document
												.write('<li><a href="about">ABOUT</a></li>');
										document
												.write('<li><a href="services">SERVICE</a></li>');
										document
												.write('<li ><a href="works">WORKS</a></li>');
										document
												.write('<li><a href="admin">ADMIN</a></li>');

									}
								}

							}

						}

					}

					function click() {

					}
				</script>
				<li><a data-toggle="modal" data-target="#myModal"
					href="#myModal"><i class="fa fa-envelope-o"></i></a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</div>
<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

