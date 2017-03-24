<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'iterator.jsp' starting page</title>
    <style type="text/css">
  		.odd{
  			background-color:red;
  		}
  		.even{
  			background-color:blue;
  		}
  </style>
  </head>
  
  <body>
     <s:debug></s:debug>
      <table border="1">
         <tr>
            <th>pid</th>
            <th>name</th>
            <th>行号为偶数</th>
           <th>行号为奇数</th>
         </tr> 
            <!-- 
						s:iterator是迭代标签,迭代的是集合(Collection)、数组,Map
						  value 指向valueStack中要遍历的集合
						说明:当前正在迭代的元素在栈顶
						          如果value不写，则默认迭代栈顶的元素
						   var属性的值表示正在遍历的对象,但是该值在map栈中
						   status是IteratorStatus这个对象，该对象对正在遍历的那一行进行描述
					 -->
           <s:iterator value="#personList" var="p" status="st">
             <tr class='<s:property value="#st.even ? 'even':'odd'"/>'>
                <td>
                  <s:property value="#p.id"/>
                </td>
                <td>
                  <s:property value="#p.name"/>
                </td>
                 <td>
                   <s:property value="#st.even"/>
                 </td>
                  <td>
                    <s:property value="#st.odd"/>
                  </td>
                </tr>
           </s:iterator>
           
             <!-- 
                Map<String,Person>
              -->
            <s:iterator value="#personMap">
              <s:property value="key"/>
              <s:property value="value.name"/>
              
            </s:iterator>
             <!-- 
                Array
              -->
            <s:iterator value="#Array">
                <s:property value="name"/>
            </s:iterator>
             <!-- 
                 Set
              -->
            <s:iterator value="#Set">
                <s:property value="name"/>
            </s:iterator>
             <!-- 
                  List<Map<String,Person>>
              -->
            <s:iterator value="#ListMap">
               <s:iterator>
                    <s:property value="key"/>
                    <s:property value="value.name"/>
               </s:iterator>
            </s:iterator>
             <!-- 
                 Map<String,List<Person>>
              -->
            <s:iterator value="#MapList">
                    <s:property value="key"/>
               <s:iterator value="value">
                    <s:property value="name"/>
               </s:iterator>
            </s:iterator>
             <!-- 
                 List<Map<String,List<Person>>>
              -->
            <s:iterator value="#ListMapList">
              
                  <s:iterator>
                      <s:property value="key"/>
                      <s:iterator value="value">
                         <s:property value="id"/>
                         <s:property value="name"/>
                      </s:iterator>
               </s:iterator>
            </s:iterator>
     </table>
  </body>
</html>
