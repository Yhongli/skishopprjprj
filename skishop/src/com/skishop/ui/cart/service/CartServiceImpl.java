package com.skishop.ui.cart.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skishop.entity.Product;
import com.skishop.ui.cart.dao.CartDaoImpl;

@Service
@Transactional(readOnly=true)
public class CartServiceImpl {

	@Resource
	private CartDaoImpl cartDaoImpl;
	
	public Cart add(int id,Cart c){
		Product p = this.cartDaoImpl.findById(id);
		if(c==null){
			c = new Cart();
		}
		c.addCart(p);
		return c;
	}

}

/*	//将购物项添加到购物车：执行的方法  
public String addCart()  
{  
    //封装一个CartItem对象  
    CartItem cartItem = new CartItem();  
    //设置数量  
    cartItem.setCount(count);  
    //根据pid进行查询商品  
    Product product = ProductServiceImpl.findBypid(cartid);  
    //设置商品：  
    cartItem.setProduct(product);  
    //将购物项添加到购物车  
    //购物车应该存在session中  
    Cart cart = getCart();  
    cart.addCart(cartItem);  
      
    return "addCart";  
} 
*/


//使用Cookies写数据库
	/*    //往购物车中添加商品  
    HttpCookie hc = null;  
    if (Request.Cookies["ShoppingCart"] == null)  
    {  
        //如果Cookies中不存在ShoppingCart，则创建  
        hc = new HttpCookie("ShoppingCart", null);      
    }  
    else  
    {  
        //如果Cookies中存在ShoppingCart，则取出  
        hc= Request.Cookies["ShoppingCart"];  
         
    }  
    bool flag=true;//标记在购物车中是否存在本次选择的物品  

    //在购物车的Cookies中查找是否存在这次要选择的物品  
    foreach (string item in hc.Values)  
    {  
        if (item == id)  
        {  
            flag = false;  
            break;  
        }  
    }  
    if (flag)  
    {  
        //如果选择的内容在购物车中没有，则创建一个新的子键  
        hc.Values.Add(id, id + "|" + name + "|" + price + "|" + 1 + "|");        
    }  
    else  
    {  
        //如果选择的内容在购物车中没，则删除原来的，添加一个新的  
        int num = int.Parse(hc.Values[id].Split(new char[] { '|' })[3]) + 1;  
        hc.Values.Remove(id);  
        hc.Values.Add(id,id + "|" + name + "|" + price + "|" + num + "|");  
    }  
    hc.Expires = DateTime.Now.AddDays(1);  
    Response.Cookies.Add(hc);  
    Response.Redirect("ShoppingCart.aspx");  
} */

