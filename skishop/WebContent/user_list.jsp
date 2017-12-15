<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>用户列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctx }/style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="${ctx }/js/jquery.js"></script>
<script src="${ctx }/js/public.js"></script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="user"></i><em>用户列表</em></span>
    <span class="modular fr"><a href="${ctx }/add_user.jsp" class="pt-link-btn">+添加新用户</a></span>
  </div>
  <div class="operate">
   <form>
    <input type="text" class="textBox length-long" placeholder="输入用户昵称、姓名、手机号码..."/>
    <input type="button" value="查询" class="tdBtn"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
     <th>编号</th>
     <th>用户名称</th>
     <th>密码</th>
     <th>邮件地址</th>
     <th>用户地址</th>
   </tr>
    <c:forEach items="${aulist }" var="u">
   <tr>
    <td>
     <input type="checkbox"/>
     <span class="middle">${u.userid }</span>
    </td>
    <td class="center">${u.name }</td>
    <td class="center">${u.password }</td>
    <td class="center">${u.email }</td>
    <td class="center">${u.address }</td>
    <td class="center">
     <a href="${ctx }/edit_user.html" class="inline-block" title="编辑"><img src="images/icon_edit.gif"/></a>
     <a href="${ctx }/deletusers?userid=${u.userid }"class="inline-block" title="删除"><img src="images/icon_drop.gif"/></a>
    </td>
   </tr>
   </c:forEach>
  </table>
  <!-- BatchOperation -->
  <div style="overflow:hidden;">
      <!-- Operation -->
	  <div class="BatchOperation fl">
	   <input type="checkbox" id="del"/>
	   <label for="del" class="btnStyle middle">全选</label>
	   <input type="button" value="批量删除" class="btnStyle"/>
	  </div>
	  <!-- turn page -->
	  <div class="turnPage center fr">
	   <a>第一页</a>
	   <a>1</a>
	   <a>最后一页</a>
	  </div>
  </div>
 </div>
</body>
</html>