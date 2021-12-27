package class04;
import java.io.*;
public class class04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		char data[]=new char[128];
		FileReader fr=new FileReader("C:\\Users\\耀賢\\eclipse-workspace\\Java14\\src\\class04\\donkey.txt");
		
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("字元數:"+num);//(a)
		System.out.println(str);
		
		fr.close();
	}

}
//(b)不一樣，因為它把換行字元算進去了