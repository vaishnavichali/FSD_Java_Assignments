class PrimeNumbers{ 
    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner( System.in );
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
 
        System.out.println("Prime number between 1 - " + num);
 
        for (int i = 2; i <= num; i++)
        {
            boolean flag = true;
            for (int j=2; j <= i/2; j++)
            {
                if ( i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
 
            if ( flag == true )
                System.out.print(i+" ");
        }
    }
}