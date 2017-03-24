<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'debug.jsp' starting page</title>
  </head>
  <body>
       <s:debug></s:debug>
       
        显示数据：
         <!-- 
    		s:property如果不写value属性，则输出对象栈的栈顶元素
    	 -->
      <s:property/><br/>
        <!-- 
    		把一个person对象放入到栈顶
    	 -->
      <s:property value="id"/><br/>
      <s:property value="name"/><br/>
         <!-- 
    		ActionContext.getContext().put("aaaa", "aaaa");
    	 -->
	输出map栈中的数据:
	<s:property value="#bbb" />
	<br /> 输出request域中的bb_request:
	<s:property value="#request.bb_request" />
	<br /> 输出application域中的cc_application:
	<s:property value="#application.cc_application" />
	<br /> 输出session域中的dd_session:
	<s:property value="#session.dd_session" />
	<br /> 输出request域中的person对象:
	<s:property value="#request.person.name" />
	表单中的数据:<s:property value="#parameters.a"/>
	利用attr属性从各个域中查找key为a_app的值:<s:property value="#attr.a_app"/>
	<br/>
  </body>
</html>
