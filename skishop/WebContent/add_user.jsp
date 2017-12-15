<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>添加新用户</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="add_user"></i><em>添加新用户</em></span>
  </div>
  <form action="addusers">
  <table class="list-style">
   <tr>
    <td style="width:15%;text-align:right;">用户昵称：</td>
    <td><input type="text" name="username" class="textBox length-middle"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">用户邮箱：</td>
    <td><input type="text" name="email" class="textBox length-middle"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">设置密码：</td>
    <td><input type="password" name="password" class="textBox length-middle"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">用户地址：</td>
    <td><input type="text" name="address" class="textBox length-middle"/></td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" class="tdBtn" value="添加新用户"/></td>
   </tr>
  </table>
  </form>
 </div>
</body>
</html>