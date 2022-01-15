import java.util.Scanner;

public class Program4 {

    public static void  main(String[] args) throws Exception {

        Scanner Scannner = new Scanner(System.in);
        double userInput;
        System.out.println("enter the exam number:");
        userInput = Scannner.nextDouble();


        if (userInput <= 100) {
            //System.out.println(userInput);
            System.out.println(" The exam  number must be between 1 to 100:\n" + userInput);

        } else {
            System.out.println(" otherwise, number invalid");
        }
        double grade;
        grade=userInput/10;
        if(grade< 6){
            System.out.println("fail");
        }
        else if (grade<6 && grade <7){
            System.out.println("below average");
        }
        else if (grade<7 && grade <8){
            System.out.println("average");
        }
        else if (grade<8 && grade <9){
            System.out.println("Nice job ");
        }
        else if (grade<9 && grade<10){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Invalid ");
        }




    }
}