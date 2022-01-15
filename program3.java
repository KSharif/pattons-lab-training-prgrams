
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class program3 {
    public static void  main(String[] args) throws Exception {

        Scanner Scanner = new Scanner(System.in);

        int firstNumber;
        System.out.println("enter the first number:");
        firstNumber=Scanner.nextInt();

        int secondNumber;
        System.out.println("enter the second number");
        secondNumber=Scanner.nextInt();


        char option;
        double result;
       System.out.println("Choose a option From A to D:" );
       option=Scanner.next().charAt(0);

        switch (option){
            case 'A' :
                result= firstNumber+ secondNumber;
                System.out.println("addition: "+result);
                break;

            case 'B':
                result= firstNumber-secondNumber;
                System.out.println("Subtraction"+result);
                break;
            case 'C':
                result= firstNumber*secondNumber;
                System.out.println("multiply"+result);
                break;

            case 'd':
                result=firstNumber/secondNumber;
                System.out.println("Division"+result);
        }



      Scanner.close();





    }
}
