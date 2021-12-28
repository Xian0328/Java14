
import java.io.*;
public class class09 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader f1=new FileReader("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class08\\aaa.txt");
		FileReader f2=new FileReader("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class08\\bbb.txt");
		FileReader f3=new FileReader("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class08\\ccc.txt");
		BufferedReader b1=new BufferedReader(f1);
		BufferedReader b2=new BufferedReader(f2);
		BufferedReader b3=new BufferedReader(f3);
		String str;
		
		System.out.println("aaa.txt");
		while((str=b1.readLine())!=null)
			System.out.println(str);
		System.out.println("\nbbb.txt");
		while((str=b2.readLine())!=null)
			System.out.println(str);
		System.out.println("\nccc.txt");
		while((str=b3.readLine())!=null)
			System.out.println(str);
		f1.close();
		f2.close();
		f3.close();
	}

}
