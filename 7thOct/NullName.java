class NullNameException extends RuntimeException{
    String nameNull(){
        return "Name cannot be empty";
    }

}
 
 
class EmployeeName{
    public static void main(String[] args)  {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter first name :");
        String firstName = scan.next();
        if(firstName.length() == 0){
 
            throw new NullNameException();
             
        }

        System.out.println("Enter last name :");
        String lastName = scan.next();
        if(lastName.length() == 0){
 
            throw new NullNameException();
             
        }
    }
}