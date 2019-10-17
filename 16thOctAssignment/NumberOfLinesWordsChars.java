import java.io.*;

class NumberOfLinesWordsChars 
{
	public static void main(String[] args) throws IOException {
		
	File myFile = new File("File1.txt");
	FileReader fr = new FileReader(myFile);
	char []arr = new char[50];
	int size = fr.read(arr);
	System.out.println("Number of charaters : "+size);
	int lineCount=0, wordCount=0;
	for(char ch : arr)
	{
       if(ch=='\n')
       {
       	lineCount++;
       wordCount++;
   }

       if(ch==' ')
       	wordCount++;
	}
	System.out.println("Number of words : "+(wordCount+1));
	System.out.println("Number of lines : "+(lineCount+1));


}
}