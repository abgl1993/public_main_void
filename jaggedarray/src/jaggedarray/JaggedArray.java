package jaggedarray;

public class JaggedArray {
	static int value;
	static {
		value = 20;
	}

	public static void main(String args[]) {
		int[][] num;
	
		num = new int[5][];
		System.out.println("begin");
		num[0] = new int[3];

		num[1] = new int[4];
		num[2] = new int[2];
		num[3] = new int[3];
		num[4] = new int[3];
		System.out.println(JaggedArray.value);
	}

}
