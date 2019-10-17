import java.io.*;

class CopyDataThread implements Runnable
{    
	File sourceFile;
    File targetFile;

	CopyDataThread(File sourceFile, File targetFile)
	{
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
	}

    public void run()
    {
    	
          try
          {
    	     FileReader reader = new FileReader(sourceFile);
	         char []source = new char[50];
	         int sizeOfSource = reader.read(source);
    	     FileWriter writer = new FileWriter(targetFile);
             int count=0;
 
		     for(int i=0; i<sizeOfSource ;i++)
		     {
		     	writer.write(source[i]);
		     	count++;
		     	try
		     	{
		     		if(count==10)
		     	    {
		     		count=0;
		     		System.out.println("10 characters copied");
		     		Thread.sleep(5000);
		     	    }
		     	}
		     	catch(InterruptedException ie)
		     	{
		     		ie.printStackTrace();
		     	}
		     }
		     writer.flush();
		     reader.close();
		     writer.close();
             
          }
          catch(IOException ioe)
          {
          	ioe.printStackTrace();
          }
    }
}

class FilesWithMultiThreading extends Thread
{
   public static void main(String[] args) {
   	
   	File sourceFile = new File("source.txt");
    File targetFile = new File("target.txt");
   	Thread t = new Thread( new CopyDataThread(sourceFile, targetFile) );
   	t.start();
   }
}