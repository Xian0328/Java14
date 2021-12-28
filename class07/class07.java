package class07;
import java.io.*;
public class class07 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count=0;
		String str;
		FileReader fr=new FileReader("C:\\Users\\耀賢\\eclipse-workspace\\Java14\\src\\class07\\donkey.txt");
		BufferedReader bfr=new BufferedReader(fr);
		while((str=bfr.readLine())!=null)
		{
			if(count==1)
				bfr.skip(14);
			System.out.println(str);
			count++;
		}
		fr.close();
	}

}
