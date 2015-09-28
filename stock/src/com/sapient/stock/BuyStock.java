package com.sapient.stock;

public class BuyStock implements Order {
	Stock buyStock;
	public BuyStock(Stock buyStock){
		this.buyStock=buyStock;
	}
    
	public void execute(){
     buyStock.buy();   	   
     }
}
