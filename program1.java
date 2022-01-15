import java.util.Scanner;



    /*
     * pattons labs programming exercise
     * @uthor : kazi sharif
     *
     * */


import java.util.Scanner;

public class program1 {
        public static void  main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            String firstName;
            String lastName;
            String address;
            double phoneNumber;
            int age;


            System.out.println("Enter your first name: ");
            firstName=scanner.nextLine();

            System.out.println("Enter your last name: ");
            lastName=scanner.nextLine();

            System.out.println("Enter your address: ");
            address=scanner.nextLine();


            System.out.println("Enter your phone number: ");
            phoneNumber=scanner.nextDouble();


            System.out.println("Enter your age: ");

            age=scanner.nextInt();











      //      System.out.println("Enter your first name: ");
            System.out.println("**********Person Information details**********");
            System.out.println("Person first name:   "+firstName);
            System.out.println("Person last name:    "+lastName);
            System.out.println("Person address:      "+address);
            System.out.println("Person age:          "+age);

            System.out.println("Person phone number  "+phoneNumber);











        }
    }


