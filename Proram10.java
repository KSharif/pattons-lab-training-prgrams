import java.util.Scanner;

public class Proram10 {
    public static void  main(String[] args) throws Exception {
        System.out.println("enter your word");
        Scanner scanner= new Scanner(System.in);

        String str= scanner.nextLine();

                String nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println(str); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);



    }
}
