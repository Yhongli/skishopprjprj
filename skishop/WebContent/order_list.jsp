<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>订单列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctx }/style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="${ctx }/js/jquery.js"></script>
<script src="${ctx }/js/public.js"></script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="order"></i><em>订单列表</em></span>
  </div>
  <div class="operate">
   <form>
    <img src="images/icon_search.gif"/>
    <input type="text" class="textBox length-long" placeholder="输入订单编号或收件人姓名..."/>
    <select class="inline-select">
     <option>未付款</option>
     <option>已付款</option>
    </select>
    <input type="button" value="查询" class="tdBtn"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
    <th>订单编号</th>
    <th>收件人</th>
    <th>订单金额</th>
    <th>订单状态</th>
    <th>操作</th>
   </tr>
   <c:forEach items="${aolist }" var="o">
   <tr>
    <td>
     <input type="checkbox"/>
     <a href="order_detail.html">${o.id }</a>
    </td>
    <td width="450">
     <span class="block">${user.name }</span>
     <address>${user.address }</address>
    </td>
    <td class="center">
     <span><i>￥</i><b>${product.discountprice }</b></span>
    </td>
    <td class="center">
     <span>未付款</span>
    </td>
    <td class="center">
     <a href="${ctx }/order_detail.html" class="inline-block" title="查看订单"><img src="images/icon_view.gif"/></a>
     <a href="${ctx }/processorder?orderid=${o.id }" class="inline-block" title="删除订单"><img src="images/icon_trash.gif"/></a>
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
	   <input type="button" value="打印订单" class="btnStyle"/>
	   <input type="button" value="配货" class="btnStyle"/>
	   <input type="button" value="删除订单" class="btnStyle"/>
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