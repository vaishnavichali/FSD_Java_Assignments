class RecursiveAndNonRecursiveFibonacci{

      static int num1=1, num2=1, num3;
     static void fibonacci(int count)
     {    
    if(count>0){    
         num3 = num1 + num2;    
         num1 = num2;    
         num2 = num3;    
         System.out.print(num3+" ");   
         fibonacci(count-1);    
     }    
 }    

	public static void main(String[] args) {
		int a=1, b=1, c;
        java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		System.out.println("Printing fibonacci series without using recursion:");
        System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2; i<num; i++)
		{
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

		System.out.println("\nPrinting fibonacci series using recursion:");
		System.out.print(num1+" ");
		System.out.print(num2+" "); 
        RecursiveAndNonRecursiveFibonacci.fibonacci(num-2);

	}
}