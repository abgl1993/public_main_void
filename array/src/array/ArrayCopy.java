package array;

public class ArrayCopy {
	public static void main(String args[]){
		int[] num;
		num=new int[5];
		num[1]=5;
		int[] arr;
		arr=new int[5];
	    System.arraycopy(num, 0, arr, 0,num.length);
	    num=null;
	    for(int data:arr){
	    	System.out.println(data);
	    }
	    	
	}
                 
}
