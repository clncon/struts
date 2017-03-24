<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri= "/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'testConverter.jsp' starting page</title>
  </head>
  
  <body>
      <s:form action="ConverterAction_testPersonConverter.action">
                                     用户名和密码<s:textfield name="person"></s:textfield>
            <s:submit></s:submit>
      </s:form>
  </body>
</html>
