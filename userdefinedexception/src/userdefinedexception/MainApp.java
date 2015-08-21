package userdefinedexception;

class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You need to be eligible to register to vote";
	}
}
class Vote{
	public void register(int age) throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You have successfully registered to vote");
	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vote vote=new Vote();
     try {
		vote.register(16);
	} catch (IllegalAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
