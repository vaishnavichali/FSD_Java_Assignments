import java.io.*;

class FileInfoDisplay
{
	   static String getFileExtension(File file) 
	    {
           String fileName = file.getName();
           if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
           return fileName.substring(fileName.lastIndexOf(".")+1);
           else return "";
        }
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter file name : ");
		String myFileName = scan.nextLine();
	    File file = new File(myFileName);

		System.out.println(  "Does the file exist? : "+( ( file.exists() ) ? "Yes":"No") );
		System.out.println(  "Is the file readable: : "+( ( file.canRead() ) ? "Yes":"No") );
		System.out.println(  "Is the file writable: : "+( ( file.canWrite() ) ? "Yes":"No") );
		System.out.println(  "File extention : "+FileInfoDisplay.getFileExtension(file));
		System.out.println(  "File extention : "+FileInfoDisplay.getFileExtension(file));
		System.out.println(  "Length of file : "+file.length()+" bytes");

	}
}