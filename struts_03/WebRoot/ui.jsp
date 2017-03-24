<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>My JSP 'ui.jsp' starting page</title>
  </head>
  
  <body>
         <!-- 
  			list为集合的所在地
  			listKey 为option中的value
  			listValue 为option标签的内容
  			headerKey  表示第一个option的value
  			heanderValue 表示第一个option标签中的内容
  		 -->
  		<s:if test="#personList!=null">
       <s:select list="#personList" listKey="pid" listValue="name" headerKey="aa" headerValue="ddd"></s:select>
        <s:checkboxlist list="#personList" listKey="pid" listValue="name" name="check" label="name"></s:checkboxlist>
        </s:if>
         <!-- 
                                               数据的回显
          -->
            <!-- 第一种方式 -->
         <%--   <s:textfield name="name" value="%{#person.name}"></s:textfield> --%>
            <!-- 第二种方式 -->
             <s:textarea name="pid" ></s:textarea>
              <s:textfield name="aa"></s:textfield>
  </body>
</html>
