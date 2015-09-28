package com.sapient.stock;

public class SellStock implements Order {

	Stock buyStock;

	public SellStock(Stock buyStock) {
		this.buyStock = buyStock;
	}

	public void execute() {
		buyStock.sell();
	}
}
