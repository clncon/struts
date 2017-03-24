<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'token.jsp' starting page</title>
  </head>
  
  <body>
      <s:form action="tokenAction_token">
          <s:token></s:token>
                                用户名:<s:textfield name="username"></s:textfield><br/>
                                  密码:<s:password name="password"></s:password><br/>
             <s:submit value="提交"></s:submit>
      </s:form>
  </body>
</html>
