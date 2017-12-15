package com.skishop.ui.cart.service;

import java.util.HashMap;
import java.util.Map;

import com.skishop.entity.CartItem;
import com.skishop.entity.Product;

public class Cart {
	
	public Map<Integer, CartItem> container=new HashMap<Integer, CartItem>();

    public void addCart(Product pro){
		if(container.containsKey(pro.getId())){
			CartItem ci=container.get(pro.getId());
			ci.setCount(ci.getCount()+1);
		}else{
			CartItem ci=new CartItem();
			ci.setProduct(pro);
			ci.setCount(1);
			container.put(pro.getId(), ci);
		}
	}	
	public void deleteCart(int id){
		container.remove(id);
	}
	public void editCart(int id,int count){
		CartItem ci = container.get(id);
		if(count>0){
		ci.setCount(count);
		container.put(id, ci);
		}else{
			this.deleteCart(id);
		}
	}
	public void clearCart(){
		container.clear();
	}
}



/*public void addCart(CartItem cartItem)  
{  
    //判断物品是否已在购物项  
     
     * *如果存在 
     *     *数量增加 
     *     *总计=总计+购物项小计 
     *  *如果不存在 
     *     *向map中添加购物项 
     *     *总计=总计+购物项小计 
       
    //获得商品id  
    Integer pid = cartItem.getProduct().getPid();  
    //判断购物车中是否已存在改购物项  
    if(map.containsKey(pid))  
    {  
        //存在  
        CartItem _cartItem = map.get(pid); //获得购物车中原来的购物项  
        _cartItem.setCount(_cartItem.getCount()+cartItem.getCount());  
    }else  
    {  
        //不存在  
        map.put(pid, cartItem);  
    }  
    //设置总计的值  
    total +=cartItem.getSubtotal();  
      
} */


