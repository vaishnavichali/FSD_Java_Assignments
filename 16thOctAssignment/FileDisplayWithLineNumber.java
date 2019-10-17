import java.io.*;
class FileDisplayWithLineNumber 
{
	public static void main(String[] args) throws IOException {
		
	File myFile = new File("File1.txt");
	BufferedReader br = new BufferedReader(new FileReader(myFile));
	String str;
	int count=1;
	while((str=br.readLine())!=null)
	{
		System.out.println(count+" "+str);
		count++;
	}

   }
}