<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'interceptor_privilege.jsp' starting page</title>
  </head>
  
  <body>
       <s:form action="InterceptorAction_SaveUser.action">
             <s:textfield name="username"/>
             <s:submit value="提交"></s:submit>
       </s:form>
       
        <s:property/>
  </body>
</html>
