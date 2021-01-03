package Practise;

public class OddEven {

    public static void main(String[] args) {
        oddEven(50);
        oddEven(25);
    }

    //Write  a method which can identifies given number is even or odd
    public static void oddEven(int num){
        if (num%2==0){
            System.out.println(num+" is even number");
        }
        if (num%2!=0){
            System.out.println(num+" is odd number");
        }


    }



}
