import java.io.*;

class WordReplace
{
	public static void main(String[] args) throws IOException {

		File file = new File("File1.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the word to be replaced :");
		String oldWord = scan.nextLine();
		System.out.println("Enter the word that should replace "+oldWord+" :");
		String newWord = scan.nextLine();
		
		String oldText="";
        String line;
		while(( line=reader.readLine() )!=null)
		{
			oldText = oldText+line+System.lineSeparator();
		}
		reader.close();
		System.out.println(oldText);
        
        String newText = oldText.replaceAll(oldWord , newWord);
		System.out.println(newText);

		FileWriter writer = new FileWriter(file);
		writer.write(newText, 0 ,newText.length());
        writer.flush();
        writer.close();

	}
}