class AgeLimitException extends RuntimeException{
     AgeLimitException(){
        System.out.println("Age should be greater than 15");
    }

}
 
 
class PersonAge{
    public static void main(String[] args)  {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter person's age :");
        int age = scan.nextInt();
        if(age <= 15){
 
            throw new AgeLimitException();
             
        }
        System.out.println("Valid age");
        }
    }
