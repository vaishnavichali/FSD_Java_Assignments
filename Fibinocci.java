class Fibinocci
{
   public static void main(String[] args) {

   	int a=1, b=1;
   	int c = a+b;
   	System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    while(c<89)
    {
       a=b;
       b=c;
       c=a+b;
       System.out.println(c);
    }
   
   }
}
