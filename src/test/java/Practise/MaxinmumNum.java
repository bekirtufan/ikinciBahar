package Practise;

public class MaxinmumNum {
    public static void main(String[] args) {

    int[] num = {2,3,1,9,5,6};
        findMin(num);
        findMax(num);
    }


    public static void findMax(int [] num){

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
           if (max < num[i]){
               max=num[i];
           }
        }
        System.out.println("max = " + max);

    }

    public static void findMin(int[] num){

        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] <min){
                min =num[i];
            }
        }
        System.out.println("min = " + min);


    }

}
