package varargument;

class Statistics {
	public float average(int... nums){//Variable Length parameter
		int sum=0;
		for(int x:nums){
			sum+=x;
		}
		return ((float)sum)/nums.length;
	}
}
public class VarArgument{
	public static void main(String args[]){
		Statistics stats=new Statistics();
		float avg=stats.average(2,3,4,5);
		System.out.println(avg);
	}
}