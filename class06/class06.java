package class06;
import java.io.*;
public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			char data[]=new char[128];
			FileReader fr=new FileReader("C:\\Users\\Ä£½å\\eclipse-workspace\\Java14\\src\\class06\\train.txt");
			
			int num=fr.read(data);
			String str=new String(data,0,num);
			System.out.println("¦r¤¸¼Æ:"+num);
			System.out.println(str);
			
			fr.close();
		}
		catch(IOException e)
		{
		}
	}

}
