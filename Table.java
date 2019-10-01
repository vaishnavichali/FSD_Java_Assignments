class Table{
	public static void main(String[] args) {
		int input, limit;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a number :");
		input = scan.nextInt();
		System.out.println("Enter the limit :");
		limit = scan.nextInt();
		for(int i=1; i<=limit; i++)
		{
			System.out.println(input+" * "+i+" = "+(i*input));
		}

	}
}