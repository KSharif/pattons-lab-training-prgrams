import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*  ***************************** Exception, that means exceptional errors.
*  Actually exceptions are used for handling errors
* in programs that occurs during the program execution.
*  During the program execution if any error occurs and
* you want to print your own message or the system message about the error
* then you write the part of the program
* which generate the error in the try{} block and catch the errors using catch() block.
* Exception turns the direction of normal flow of the program control and send to the related catch() block.
*  Error that occurs during the program execution generate a specific
* object which has the information about the errors occurred in the program.
*
*
*
*  you will see that how the exception handling can be done in java program.
*  This example reads two integer numbers for the variables a and b.
* If you enter any other character except number ( 0 - 9 )
*  then the error is caught by NumberFormatException object.
*  After that ex.getMessage() prints the information about the error occurring causes.
*
* */





public class Program9 {
    public static void  main(String[] args) throws Exception {
        System.out.println("Enter something: ");
        try{
            int a,b;
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(in.readLine());
            b = Integer.parseInt(in.readLine());
        }
        catch(NumberFormatException ex){
            System.out.println(ex.getMessage()
                    + " is not a numeric value.");
            System.exit(0);
        }
    }
}