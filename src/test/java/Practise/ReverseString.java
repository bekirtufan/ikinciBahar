package Practise;

public class ReverseString {
    public static void main(String[] args) {
       // System.out.println("reverseIt(\"mayaaa\") = " + reverseIt("mayaaa"));
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("how many numbers you wanna enter");
//        int size = scan.nextInt();
//
//
//        System.out.println("Enter the letters");
//         char lettersArray[] = new char[size];
//         for (int i = size-1 ; i >= 0 ; i++){
//             String letters = scan.next();
//             System.out.println();
//             lettersArray[i]=letters.charAt(0);
//         }


        int [] numArray = {1,2,34,23422352,131,0,324,-1};
        findMin(numArray);



    }

    public static String reverseIt(String str){

        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i)+"";
        }

        return reversed;
    }





public static void findMin(int [] num){

       int min= num[0];

    for (int i = 0; i < num.length; i++) {

        if (num[i] <min){
            min=num[i];
        }


    }
    System.out.println("min = " + min);


}




}
