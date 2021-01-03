package Practise;

import java.util.Arrays;

public class isSameLetters {
    //find second most frequent character in a string


    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";


        System.out.println("isSame(str1,str2) = " + isSame(str1, str2));

    }


    public static boolean isSame(String str1, String str2) {

        boolean result = false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        Arrays.equals(ch1,ch2);


        for (int i = 0; i < ch1.length; i++) {

            if (ch1.length != ch2.length) {
                System.out.println("Strings length are not same");
                System.exit(0);
            } else result = ch1[i] == ch2[i] ;

            }

        return result;

    }


}


//        for (int i = 0; i <ch1.length  ; i++) {
//
//            for (int j = 0; j <ch2.length ; j++) {
//
//                if (ch1[i]!=ch2[j]){
//                    System.out.println("Characters are not same");
//                   // result = false;
//                    break;
//                }else {
//                   // System.out.println("both strings are same");
//                   // result = true;
//                    break;
//                }
//            }
//        }
//
//        return Arrays.equals(ch1, ch2);
//    }



