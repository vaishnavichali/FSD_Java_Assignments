class NullNameException extends RuntimeException{
     NullNameException(){
        System.out.println("Name cannot be empty");
    }

}
 
 
class EmployeeName{
    public static void main(String[] args)  {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter first name :");
        String firstName = scan.nextLine();
        if(firstName.length() == 0){
 
            throw new NullNameException();
             
        }

        System.out.println("Enter last name :");
        String lastName = scan.nextLine();
        if(lastName.length() == 0){
 
            throw new NullNameException();
             
        }
        System.out.println("First name : "+firstName);
        System.out.println("Last name : "+lastName);

    }
}