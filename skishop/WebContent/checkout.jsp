<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<title>购物车</title>
<link href="${ctx }/css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="${ctx }/css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<link href='${ctx }/http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="${ctx }/tasp.css" />
<link href="${ctx }/orderconfirm.css" rel="stylesheet" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="${ctx }/js/jquery.min.js"></script>
<style>
#page{width:auto;}
#comm-header-inner,#content{width:950px;margin:auto;}
#logo{padding-top:26px;padding-bottom:12px;}
#header .wrap-box{margin-top:-67px;}
#logo .logo{position:relative;overflow:hidden;display:inline-block;width:140px;height:35px;font-size:35px;line-height:35px;color:#f40;}
#logo .logo .i{position:absolute;width:140px;height:35px;top:0;left:0;background:url(http://a.tbcdn.cn/tbsp/img/header/logo.png);}
</style>
<script type="text/javascript">
        $(document).ready(function() {
            $(".dropdown img.flag").addClass("flagvisibility");

            $(".dropdown dt a").click(function() {
                $(".dropdown dd ul").toggle();
            });
                        
            $(".dropdown dd ul li a").click(function() {
                var text = $(this).html();
                $(".dropdown dt a span").html(text);
                $(".dropdown dd ul").hide();
                $("#result").html("Selected value is: " + getSelectedValue("sample"));
            });
                        
            function getSelectedValue(id) {
                return $("#" + id).find("dt a span.value").html();
            }

            $(document).bind('click', function(e) {
                var $clicked = $(e.target);
                if (! $clicked.parents().hasClass("dropdown"))
                    $(".dropdown dd ul").hide();
            });
            $("#flagSwitcher").click(function() {
                $(".dropdown img.flag").toggleClass("flagvisibility");
            });
        });
</script>
 </head>
<body data-spm="1">
	<div class="header">
		<div class="container">
			<div class="row">
			  <div class="col-md-12">
				 <div class="header-left">
					 <div class="logo">
						<a href="index.jsp"><img src="images/logo.png" alt=""/></a>
					 </div>
					 <div class="menu">
						  <a class="toggleMenu" href="index.jsp"><img src="images/nav.png" alt="" /></a>
						    <ul class="nav" id="nav">
						    	<li><a href="shop.html">商店</a></li>
								<li><a href="experiance.html">经验交流</a></li>
								<li><a href="contact.html">联系我们</a></li>								
								<div class="clear"></div>
							</ul>
							<script type="text/javascript" src="js/responsive-nav.js"></script>
				    </div>							
	    		    <div class="clear"></div>
	    	    </div>
	            <div class="header_right">
	    		  <!-- start search-->
				   <div class="search-box">
							<div id="sb-search" class="sb-search">
								<form>
									<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
									<input class="sb-search-submit" type="submit" value="">
									<span class="sb-icon-search"> </span>
								</form>
							</div>
						</div>
						<!----search-scripts---->
						<script src="js/classie.js"></script>
						<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
				    <ul class="icon1 sub-icon1 profile_img">
					 <li><a class="active-icon c1" href="#"> </a>
						<ul class="sub-icon1 list">
						  <div class="product_control_buttons">
						  	<a href="#"><img src="${ctx }/images/edit.png" alt=""/></a>
						  		<a href="#"><img src="${ctx }/images/close_edit.png" alt=""/></a>
						  </div>
						   <div class="clear"></div>
						  <li class="list_img"><img src="${ctx }/images/1.jpg" alt=""/></li>
						  <li class="list_desc"><h4><a href="#">商品</a></h4><span class="actual">1 x
                          $12.00</span></li>
						  <div class="login_buttons">
							 <div class="check_button"><a href="${ctx }/checkout.jsp">去购物车结算</a></div>
							 <div class="login_button"><a href="${ctx }/login.jsp">登录</a></div>
							 <div class="clear"></div>
						  </div>
						  <div class="clear"></div>
						</ul>
					 </li>
				   </ul>
		        <div class="clear"></div>
	       </div>
	      </div>
		 </div>
	    </div>
	  </div>
     <div class="showCart">
      <div class="shop_top">
		<div class="container">
			<div id="page">
			<div id="content" class="grid-c">
			 <c:if test="${cart!=null }">
			  <table cellspacing="0" cellpadding="0" class="order-table" id="J_OrderTable" summary="统一下单订单信息区域">
			 <thead>
			 <tr>
			 <th class="s-title">店铺宝贝<hr/></th>
			 <th class="s-price">单价(元)<hr/></th>
			 <th class="s-amount">数量<hr/></th>
			 <th class="s-agio">优惠方式(元)<hr/></th>
			 <th class="s-total">小计(元)<hr/></th>
			 <th class="s-total"><a href="${ctx}/showcart/clear">清空购物车</a><hr/></th>
			 </tr>
			 </thead>
			<tbody data-spm="3" class="J_Shop" data-tbcbid="0" data-outorderid="47285539868"  data-isb2c="false" data-postMode="2" data-sellerid="1704508670">
			<tr class="first"><td colspan="5"></td></tr>
			<tr class="shop blue-line">
			 <td colspan="3">
			 </td>
			 <td colspan="2" class="promo">
			 <div>
			   <ul class="scrolling-promo-hint J_ScrollingPromoHint">
			   </ul>
			   </div>
			 </td>
			</tr>
			<c:forEach items="${cartlist }" var="d" varStatus="v">
			 <tr class="item" data-lineid="19614514619:31175333266:35612993875" data-pointRate="0">
			 <td class="s-title">
			   <a href="single.jsp" target="_blank" title="${v.count}" class="J_MakePoint" data-point-url="http://log.mmstat.com/buy.1.5">
			     <img src="${d.product.img1 }" class="itempic"><span class="title J_MakePoint" data-point-url="http://log.mmstat.com/buy.1.5">${d.product.name } </span></a>
			   <div class="props">
			   <span>${d.product.description }</span>
			   </div>
			     </td>
			 <td class="s-price">
			  <span class='price '>
			 <em class="style-normal-small-black J_ItemPrice"  >${d.product.price }元</em>
			  </span>
			</td>
			 <td class="s-amount" data-point-url="">
			         <input type="hidden" class="J_Quantity" value="1" name="19614514619_31175333266_35612993875_quantity"/>${d.count }
			 </td>
			 <td class="s-agio">
			       <div class="J_Promotion promotion" data-point-url="">${d.product.discountprice }元</div>
			   </td>
			 <td class="s-total">
			   <span class='price '>
			 <em class="style-normal-bold-red J_ItemTotal">${d.product.discountprice *d.count}元</em>
			  </span>
			    <input id="furniture_service_list_b_47285539868" type="hidden" name="furniture_service_list_b_47285539868"/>
			 </td>
			<td><a href="${ctx}/showcart/delete?productId=${d.product.id }">删除</a></td>
			</tr>		
				</c:forEach>
			</table></c:if>
			</div>
			</div>
			<div class="button"><a href="order.jsp">去结算</a></div>			
	     </div>
	   </div>
	  </div>
	  <div class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>商品</h4>
							<li><a href="#">男士</a></li>
							<li><a href="#">女士</a></li>
							<li><a href="#">青年</a></li>
						</ul>
					</div>
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>关于</h4>
							<li><a href="#">就业和实习</a></li>		
							<li><a href="#">团队</a></li>
							<li><a href="#">请求/下载目录
</a></li>
						</ul>
					</div>
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>客户支持</h4>
							<li><a href="#">联系我们</a></li>
							<li><a href="#">订单跟踪</a></li>
							<li><a href="#">保修</a></li>
						</ul>
					</div>
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>通讯</h4>
							<div class="footer_search">
				    		   <form>
				    			<input type="text" value="输入您的电子邮件" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter your email';}">
				    			<input type="submit" value="Go">
				    		   </form>
					        </div>
							<ul class="social">	
							  <li class="facebook"><a href="#"><span> </span></a></li>
							  <li class="twitter"><a href="#"><span> </span></a></li>
							  <li class="instagram"><a href="#"><span> </span></a></li>	
							  <li class="pinterest"><a href="#"><span> </span></a></li>	
							  <li class="youtube"><a href="#"><span> </span></a></li>										  				
						    </ul>
		   				</ul>
					</div>
				</div>
				<div class="row footer_bottom">
				    <div class="copy">
			           <p>版权 &copy; 2014.公司保留所有权利.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		            </div>
					  <dl id="sample" class="dropdown">
				        <dt><a href="#"><span>更改地区</span></a></dt>
				        <dd>
				            <ul>
				                <li><a href="#">澳大利亚<img class="flag" src="images/as.png" alt="" /><span class="value">AS</span></a></li>
				                <li><a href="#">斯里兰卡<img class="flag" src="images/srl.png" alt="" /><span class="value">SL</span></a></li>
				                <li><a href="#">新西兰<img class="flag" src="images/nz.png" alt="" /><span class="value">NZ</span></a></li>
				                <li><a href="#">巴基斯坦<img class="flag" src="images/pk.png" alt="" /><span class="value">Pk</span></a></li>
				                <li><a href="#">联合国<img class="flag" src="images/uk.png" alt="" /><span class="value">UK</span></a></li>
				                <li><a href="#">美国<img class="flag" src="images/us.png" alt="" /><span class="value">US</span></a></li>
				            </ul>
				         </dd>
	   				  </dl>
   				</div>
			</div>
		</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>