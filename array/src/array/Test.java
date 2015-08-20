package array;
class Point{
	public int i,j;
	public Point(int var1,int var2){
		i=var1;
		j=var2;
	}
}
 class Demo {
	public Point[] create(){
		Point[] p;
		p=new Point[10];
			for(int i=0;i<10;i++){
				p[i]=new Point(i,i+1);
		 }
		return p;
			
	}
    public void display(Point[] data){
    	for(Point value:data){
    		System.out.println(value.i);
    		System.out.println(value.j);
    	}
    }
}
 public class Test{
	 public static void main(String [] args){
		 Demo d=new Demo();
		 Point[] obj=d.create();
		 d.display(obj);
	 }
 }
