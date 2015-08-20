package enumeration;

enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(8), Cortland(15);
	private int price;
	Apple(int p){
		price=p;
	}
	int getPrice(){
		return price;
	}
}

public class Enumeration {
	public static void main(String args[]) {
		Apple ap;
		System.out.println("Price of WineSap is");
		System.out.println(Apple.Winesap.getPrice()+"cents.\n");
		Apple allapples[] = Apple.values();
		System.out.println("Price of all Apples");
		for (Apple value : Apple.values()) {
			System.out.println(value+" costs "+value.getPrice()+" cents.\n");
		}
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
	}
}
