<%--
  Created by IntelliJ IDEA.
  User: Maeen Uddin
  Date: 8/1/2023
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.demo.utils.TestUtils" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This is maeen uddin mollah</h1>
<h2><%= makeSmaller("maeen") %>
</h2>
<h3><%= TestUtils.makeToUpperCase("maeen") %></h3>
</body>
</html>

<%!
    public String makeSmaller(String st) {
        return st.toUpperCase();
    }
%>
