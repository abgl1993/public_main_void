package com.sapient.stock;

public class StockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock abcStock = new Stock();
		BuyStock buyStock=new BuyStock(abcStock);
		SellStock sellStock=new SellStock(abcStock);
		Broker broker=new Broker();
		broker.takeOrder(buyStock);
		broker.placeOrder();
		broker.takeOrder(sellStock);
		broker.placeOrder();
	}

}
