<%@ page language="java" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
		body
		{
			SCROLLBAR-ARROW-COLOR: #ffffff;  SCROLLBAR-BASE-COLOR: #dee3f7;
		}
    </style>
  </head>
  
<frameset rows="103,*,43" frameborder=0 border="0" framespacing="0">
  <frame src="forwardAction_forward.action?method=top" name="top" scrolling="NO" noresize>
  <frameset cols="159,*" frameborder="0" border="0" framespacing="0">
		<frame src="forwardAction_forward.action?method=left" name="left" noresize scrolling="YES">
		<frame src="forwardAction_forward.action?method=right" name="right">
  </frameset>
  <frame src="forwardAction_forward.action?method=bottom" name="bottom" scrolling="NO"  noresize>
</frameset>
</html>