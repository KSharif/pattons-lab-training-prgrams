public class Program11 {

    public static void  main(String[] args) throws Exception {

        int r,sum=0,temp;
      //  int sum=temp;
        int n=555;
        temp = n;

        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum){
            System.out.println("palindrome NUmber ");

        }
            else{
                System.out.println("not palindrone");
        }

    }
}
