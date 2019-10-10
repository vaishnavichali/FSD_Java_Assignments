class DecimalToBinary{
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		String binary="";
		while(input>0)
		{
			binary=binary+(input%2);
			input=input/2;
		}
		System.out.print("The binary equivalent of "+input+" is ");
		for(int i=binary.length()-1; i>=0; i--)
		System.out.print(binary.charAt(i));
	}
}