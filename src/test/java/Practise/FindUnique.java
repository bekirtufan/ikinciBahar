package Practise;

public class FindUnique {

    public static void main(String[] args) {

        System.out.println("findUnique(\"AAAABBBC\") = " + findUnique("AACCDDBB"));


    }
    public static String findUnique(String str){


        char [] arr = str.toCharArray();

        String unique = "";

        for (int i =0 ; i <= str.length()-1 ; i++){

            int count = 0;

            for(int j =0; j< str.length(); j++){

                if (arr[i] == arr[j]) {
                    count++;

                }
                }

                if (count==1) {
                    unique+=arr[i];
                }





        }


        return unique;
    }

}
