<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>My JSP 'ui.jsp' starting page</title>
  </head>
  
  <body>
        <s:form action="ModelDriverAction_testModelDriver.action">
            <s:textfield name="username"></s:textfield>
            <s:password name="password"></s:password>
            <s:textfield name="phone"></s:textfield>
            <s:submit value="提交"></s:submit>
        </s:form>
         
  </body>
</html>
