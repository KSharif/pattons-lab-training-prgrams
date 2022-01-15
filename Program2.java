
import java.util.Scanner;

public class Program2 {

    public static void  main(String[] args) throws Exception {

        Scanner Scannner = new Scanner(System.in);
        double userInput;
        System.out.println("enter the number:");
        userInput = Scannner.nextDouble();


        if(userInput<=100){
            //System.out.println(userInput);
            System.out.println(" The number is between 1 to 100:\n"+ userInput);

        }
        else
        {
            System.out.println(" number invalid");
        }
    double num = userInput;
        double temp;
        boolean isPrime=true;
        Scannner.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");





    }
}
