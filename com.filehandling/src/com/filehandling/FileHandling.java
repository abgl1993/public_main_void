package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling  {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
      try(FileInputStream in =new FileInputStream("C:/Users/abaghe/Desktop/sapin.txt");
    		  FileOutputStream out=new FileOutputStream("C:/Users/abaghe/Desktop/sapout.txt")
    		  ){
    	  int c;
    	 
			while((c=in.read())!=-1)
				
					out.write(c);
			
		} 
	}

}
