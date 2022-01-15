public class Program12 {
  /*
    public static void  main(String[] args)  {
// duplicate the elements in a list

      int [] array = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
      System.out.println("Duplicate the elements finding in a array");

      for (int i =0; i<array.length; i++){
          for(int j =i+1; j<array.length;i++){
                if(array[i]==array[j])
                    System.out.println(array[j]);

          }
      }

//  C:\Users\Kazi\IdeaProjects\practiceprogrammingPattons


    }
*/

    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
