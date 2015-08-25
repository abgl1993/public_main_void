package systemproperties;

import java.util.Enumeration;
import java.util.Properties;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Properties sys=System.getProperties();
        Enumeration<Object> keys=sys.keys();
        String key;
         while(keys.hasMoreElements()){
        	 key=(String)keys.nextElement();
        	 System.out.println(key+" : "+sys.getProperty(key));
         }
	}

}
