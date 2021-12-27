package class05;
import java.io.*;
public class class05 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		char data[]=new char[128];
		FileReader fr=new FileReader("C:\\Users\\耀賢\\eclipse-workspace\\Java14\\src\\class05\\donkey.txt");
		fr.skip(9);
		
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("字元數:"+num);
		System.out.println(str);
		
		fr.close();
	}

}
