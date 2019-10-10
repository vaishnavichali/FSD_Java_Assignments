class PassOrFail{
	public static void main(String[] args) {
		int num1, num2, num3;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		num1 = scan.nextInt(); 
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		int sum = num1+num2+num3;

        if(num1>=40)
        {
        	if(num2>=40)
        	{
        		if(num3>=40)
        		{
        			if(sum>=125)
        			{
        				System.out.println("PASSING");
        			}
        			else
        			{
        				System.out.println("FAILING");
        			}
        		}
        		else
        		{
        			System.out.println("FAILING");
        		}
        	}
        	else
        	{
        		System.out.println("FAILING");
        	}
        }
        else
        {
        	System.out.println("FAILING");
        }


		/*if(num1>=40 && num2>=40 && num3>=40 && sum>=125)
		{
			System.out.println("PASSING");
		}
		else
		{
			System.out.println("FAILING");
		}*/
	}
}