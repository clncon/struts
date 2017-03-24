<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'token.jsp' starting page</title>
  </head>
  
  <body>
         <!-- 
            multipart/form-data:将数据以二进制式的上传
          -->
      <s:form action="UploadAction_upload.action" enctype="multipart/form-data">
                                   文件名:<s:file name="resource"></s:file>
            <s:submit></s:submit>
      </s:form>
      
        <s:form action="UploadAction_download.action" ectype="multipart/form-data">
           <s:submit value="download"></s:submit>
        </s:form>
  </body>
</html>
