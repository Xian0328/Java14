package class08;
import java.io.*;
public class class08 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader f1=new FileReader("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class08\\aaa.txt");
		FileReader f2=new FileReader("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class08\\bbb.txt");
		FileWriter f3=new FileWriter("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class08\\ccc.txt");
		BufferedReader b1=new BufferedReader(f1);
		BufferedReader b2=new BufferedReader(f2);
		BufferedWriter b3=new BufferedWriter(f3);
		String str;
		
		while((str=b1.readLine())!=null)
		{
			b3.write(str);
			b3.newLine();
		}
		while((str=b2.readLine())!=null)
		{
			b3.write(str);
			b3.newLine();
		}
		b3.flush();
		f3.close();
		f1.close();
		f2.close();
	}

}
