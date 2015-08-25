package com.objectcomparison;

class Data {
	private int firstNumber;
	private int secondNumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Data) {
			Data data = (Data) obj;

			if ((this.firstNumber == data.firstNumber)
					&& (this.secondNumber == data.secondNumber))
				return true;

		}
		return false;
	}

}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		Data d2 = new Data();
		d1.setFirstNumber(2);
		d1.setSecondNumber(4);
		d2.setFirstNumber(2);
		d2.setSecondNumber(4);
		System.out.println(d1.equals(d2));
	}

}
