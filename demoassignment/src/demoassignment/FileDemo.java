package demoassignment;

import java.io.File;

public class FileDemo {
	static void p(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File f1=new File("D:/sapient.txt");
 p("File Name "+f1.getName());
 p("path:"+f1.getPath());
 p("Abs path:"+f1.getAbsolutePath());
 p("Parent: "+f1.getParent());
 p(f1.exists()?"exist":"does not exist");
 p(f1.canWrite()?"is writeable":"is not writedable");
 p(f1.canRead()?"is readable":"is not readable");
 p("is"+(f1.isDirectory()?"":"not"+"a directory"));
 p(f1.isFile()?"is normal file":"might be a named pipe");
 p(f1.isAbsolute()?"is absolute":"is not absolute");
 p("file last modified:"+f1.lastModified());
 p("file size: "+f1.length()+"Bytes");
	}

}
