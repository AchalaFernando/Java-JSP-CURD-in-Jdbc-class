<%-- 
    Document   : delete
    Created on : 16-Feb-2023, 11:04:13
    Author     : Avian Tech Zone


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Delete</h1>
        
        
    </body>
</html>
--%>

<%@page import="java.sql.*" %>
<%@page import="main.util.Jdbc" %>

<% 
        String id = request.getParameter("id");
        
//        Connection con;
//        PreparedStatement pst;
//        ResultSet rs;
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
         //con = new jdbc().ConnectionGet();
         
       Connection con = new Jdbc().getConnection();     
        
       PreparedStatement pst = con.prepareStatement("delete from records where id="+id); 
        
     
       
        pst.executeUpdate();
        
//   int i =pst.executeUpdate(query);
//    if(i=1){ 
//    System.out.println("Data Deleted!");  //u d c
//    } 

       %> 
        
       <script>
           alert("Record Deleted");
       </script>
       <%
          response.sendRedirect("index.jsp"); 
       %>
    