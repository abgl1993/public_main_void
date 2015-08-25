package com.tostringoverriding;

class MyDate {
	private int day;
	private int month;
	private int year;
	private String date;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.date = day + "-" + month + "-" + "year";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return date;
	}

	public MyDate addDays(int day) {
		this.day += day;
		this.date = this.day + "-" + month + "-" + "year";
		return this;
	}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate my_birth = new MyDate(22, 7, 1964);
		System.out.println(my_birth.toString());
		MyDate the_next_week = my_birth.addDays(7);
		System.out.println(the_next_week);
	}

}
