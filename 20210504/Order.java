package com.lnu.exer1;

public class Order {
	
	//属性
	private int orderId;
	private String orderName;
	
	//构造器
	public Order(int orderId,String orderName) {
		this.orderId = orderId;
		this.orderName = orderName;
	}
	
	//getter、setter方法
	public int getOrderId() {
		return orderId; 
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderId(String orderName) {
		this.orderName = orderName;
	}
	
	@Override
	public boolean equals(Object obj) { //Object obj = new Order(); 多态
		if(this == obj) { //这里的== 判断的是地址是否相同
			return true;
		}
		
		if(obj instanceof Order) {
			Order order = (Order)obj; //向下转型
			return this.orderId == order.orderId && this.orderName.equals(order.orderName);
		}
		return false;
	}
}
