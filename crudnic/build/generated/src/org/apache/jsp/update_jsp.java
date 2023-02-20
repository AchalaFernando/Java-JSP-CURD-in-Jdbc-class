package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import main.util.Jdbc;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    if(request.getParameter("submit")!= null)
    {
        String id = request.getParameter("id");
        String name = request.getParameter("fname");
        String nic = request.getParameter("nic");
        String mobile = request.getParameter("mobile");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
        pst = con.prepareStatement("update records set fname =?, nic=?, mobile=? where id=?"); 
        pst.setString(1, name);
        pst.setString(2, nic);
        pst.setString(3, mobile);
        pst.setString(4, id);
        pst.executeUpdate();
        

      out.write(" \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"Record Updated\");\n");
      out.write("</script>\n");
   
}




      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap-->\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Bootstrap-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <h1>User Update</h1>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                    <form class=\"\" method=\"POST\" action=\"\">\n");
      out.write("                        <!-- Update code -->\n");
      out.write("                        ");

//                            Connection con;
//                            PreparedStatement pst;
//                            ResultSet rs;
//        
//                            Class.forName("com.mysql.jdbc.Driver");
//                            con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
                             //con = new jdbc().ConnectionGet();
                             String requestId=request.getParameter("id");
                             
                             
                          Connection con = new Jdbc().getConnection();
                        
                            
                        
                            String query = "select * from records where id="+requestId;
                                           Statement st = con.createStatement();
                                       
                                          ResultSet  rs = st.executeQuery(query);
                                            
                                                if (rs.next())
                                                {
                                                    String id = rs.getString("id");
                                                    String fname = rs.getString("fname");
                                                    String nic = rs.getString("nic");
                                                    String mobile = rs.getString("mobile");
                        
                        
                        
                        
                        

                        
      out.write("\n");
      out.write("                        <!-- Update code -->\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4\"> \n");
      out.write("                                <label class=\"form-label\">Name</label>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-8\"> \n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Name\"  value=\"");
      out.print(fname);
      out.write("\" name=\"fname\" id=\"fname\" required>\n");
      out.write("                            </div>   \n");
      out.write("                        </div> \n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4\"> \n");
      out.write("                                <label class=\"form-label\">National Id Card</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8\"> \n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"NIC\" value=\"");
      out.print(nic);
      out.write("\" name=\"nic\" id=\"nic\" required>      \n");
      out.write("\n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4\"> \n");
      out.write("                                <label class=\"form-label\">Mobile</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8\"> \n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Mobile\" value=\"");
      out.print(mobile);
      out.write("\" name=\"mobile\" id=\"mobile\" required> \n");
      out.write("\n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");
 
             }
                        
      out.write("  \n");
      out.write("\n");
      out.write("                        <div class=\"row mb-3\">\n");
      out.write("                            <div class=\"col-md-4 mt-3\"> \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 mt-3\"> \n");
      out.write("                                <input type=\"submit\" id=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-success mr-3\">\n");
      out.write("                                <input type=\"reset\" id=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-primary\">\n");
      out.write("\n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-success\"> Back To Main Page</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
