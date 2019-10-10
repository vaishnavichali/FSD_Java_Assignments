class Factorial{
	public static void main(String[] args) {
		long fact=1;
		int input;
		System.out.println("Enter a number :");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		input=scan.nextInt();
		for(int i=1;i<=input;i++) 
		{
             fact=fact*i;
		}
		System.out.println("Factorial of "+input+" is "+fact);
	}
}