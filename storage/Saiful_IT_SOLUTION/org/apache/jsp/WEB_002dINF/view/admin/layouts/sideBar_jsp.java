/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2018-12-20 15:22:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sideBar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div class=\"wrapper \">\r\n");
      out.write("\t<div class=\"sidebar\" data-color=\"purple\" data-background-color=\"white\"\r\n");
      out.write("\t\tdata-image=\"#\">\r\n");
      out.write("\t\t<!--\r\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"purple | azure | green | orange | danger\"\r\n");
      out.write("\r\n");
      out.write("        Tip 2: you can also add an image using data-image tag\r\n");
      out.write("    -->\r\n");
      out.write("\t\t<!-- \t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<a href=\"http://www.creative-tim.com\" class=\"simple-text logo-normal\">\r\n");
      out.write("\t\t\t\tCreative Tim </a>\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t<div class=\"sidebar-wrapper\">\r\n");
      out.write("\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"project\"> Project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"projectForm\">Upload Project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"admin\">Admin</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"projectTool\">Tools</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"project\"> Project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"project\"> Project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"project\"> Project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"project\"> Project</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"project\"> Project</a></li>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tvar Location = location.href;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar patt = new RegExp(\"admin\");\r\n");
      out.write("\t\t\t\t\tif (patt.test(Location) == true) {\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='index'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write(\"<li class='nav-item active '><a class='nav-link' href='admin'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='homeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents List</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='rank'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>rank</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t.write(\"<li class='nav-item '><a class='nav-link' href='engineer'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Engineer</p></a></li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar patt = new RegExp(\"uploadHomeContents\");\r\n");
      out.write("\t\t\t\t\t\tif (patt.test(Location) == true) {\r\n");
      out.write("\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='index'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home</p></a></li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='admin'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item active '><a class='nav-link' href='uploadHomeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='homeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents List</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='rank'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>rank</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item '><a class='nav-link' href='engineer'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Engineer</p></a></li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tvar patt = new RegExp(\"homeContents\");\r\n");
      out.write("\t\t\t\t\t\t\tif (patt.test(Location) == true) {\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='index'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='admin'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item active '><a class='nav-link' href='homeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents List</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='rank'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>rank</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item '><a class='nav-link' href='engineer'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Engineer</p></a></li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar patt = new RegExp(\"rank\");\r\n");
      out.write("\t\t\t\t\t\t\t\tif (patt.test(Location) == true) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='index'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='admin'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='homeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents List</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item active'><a class='nav-link' href='rank'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>rank</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item '><a class='nav-link' href='engineer'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Engineer</p></a></li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar patt = new RegExp(\"engineer\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (patt.test(Location) == true) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='index'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='admin'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class='material-icons'>dashboard</i> <p>Dashboard</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='uploadHomeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item'><a class='nav-link' href='homeContents'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Home Contents List</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item '><a class='nav-link' href='rank'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>rank</p></a></li>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.write(\"<li class='nav-item active'><a class='nav-link' href='engineer'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<i class=''></i> <p>Engineer</p></a></li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
