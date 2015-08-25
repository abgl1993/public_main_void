package fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int size;
		InputStream f=new FileInputStream("D:/workspace/fileinputstreamdemo/src/fileinputstreamdemo/FileInputStreamDemo.java");
		System.out.println("Total available Bytes: "+(size=f.available()));
		int n=size/40;
		System.out.println("First "+ n +" bytes of the file one read() at a time");
        for(int i=0;i<n;i++){
        	System.out.println(f.read());
        }
        System.out.println("\nstill available:"+ f.available());
        System.out.println("Reading the next "+ n +" with one reade(b[]");
        byte[] b=new byte[n];
        if(f.read(b)!=n){
        	System.err.println("Couldnt read "+ n +" bytes.");
        }
        System.out.println(new String(b,0,n));
        System.out.println("\nStill Available: "+(size = f.available()));
        System.out.println("Skipping half of the remaining bytes with skip");
        f.skip(size/2);
        System.out.println("Still Available: "+f.available());
        System.out.println("Reading "+n/2 +" into the end of array" );
        if(f.read(b, n/2, n/2)!=n/2){
        	System.err.println("Couldnt read "+n/2+" bytes.");
        }
        System.out.println(new String(b,0,b.length));
        System.out.println("\nStill available: "+f.available());
        f.close();
        
	}

}
