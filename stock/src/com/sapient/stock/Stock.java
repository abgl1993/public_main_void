package com.sapient.stock;

public class Stock {
String stockType="ABC";
int quantity=10;
public void buy()
{
	System.out.println("Bought StockType "+stockType+" and Quantity"+quantity);
}
public void sell(){
	System.out.println("Sold StockType "+stockType+" and Quantity"+quantity);
}
}
