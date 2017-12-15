<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>产品列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctx }/style/adminStyle.css" rel="stylesheet" type="text/css" />
<script src="${ctx }/js/jquery.js"></script>
<script src="${ctx }/js/public.js"></script>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i></i><em>产品列表</em></span>
    <span class="modular fr"><a href="${ctx }/edit_product.jsp" class="pt-link-btn">+添加商品</a></span>
  </div>
  <div class="operate">
   <form>
    <select class="inline-select">
     <option>A店铺</option>
     <option>B店铺</option>
    </select>
    <input type="text" class="textBox length-long" placeholder="输入产品名称..."/>
    <input type="button" value="查询" class="tdBtn"/>
   </form>
  </div>
  <table class="list-style Interlaced">
   <tr>
    <th>ID编号</th>
    <th>产品</th>
    <th>名称</th>
    <th>市场价</th>
    <th>会员价</th>
    <th>库存</th>
    <th>精品</th>
    <th>新品</th>
    <th>热销</th>
    <th>操作</th>
   </tr>
   <c:forEach items="${alist }" var="a">
   <tr>
    <td>
     <span>
     <input type="checkbox"  class="middle children-checkbox"/>
     <i>${a.id }</i>
     </span>
    </td>
    <td class="center pic-area"><img src="${ctx }/${a.img1 }" class="thumbnail"/></td>
    <td class="td-name">
      <span class="ellipsis td-name block">${a.name }</span>
    </td>
    <td class="center">
     <span>
      <i>￥</i>
      <em>${a.price }</em>
     </span>
    </td>
    <td class="center">
     <span>
      <i>￥</i>				
      <em>${a.discountprice }</em>
     </span>
    </td>
    <td class="center">
     <span>
      <em>${a.description }</em>
      <i>件</i>
     </span>
    </td>
    <td class="center"><img src="images/yes.gif"/></td>
    <td class="center"><img src="images/no.gif"/></td>
    <td class="center"><img src="images/yes.gif"/></td>
    <td class="center">
     <a href="single.jsp" title="查看" target="_blank"><img src="images/icon_view.gif"/></a>
     <a href="edit_product.html" title="编辑"><img src="images/icon_edit.gif"/></a>
     <a href="${ctx }/deletproducts?productid=${a.id}" title="删除"><img src="images/icon_drop.gif"/></a>
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