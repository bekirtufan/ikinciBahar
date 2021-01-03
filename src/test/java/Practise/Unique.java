package Practise;

//Write a return  method that can find the unique characters from the String
//
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
public class Unique {
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));

    }


    public static String unique(String str) {

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            String firstLetter = str.substring(0, 1).toLowerCase();
            String rest = str.substring(1).toLowerCase();

            if (rest.contains(firstLetter)) {
                str = rest.replaceAll(firstLetter, "");
            }

        }

        return str;
    }


    public static String unique2(String str) {

        String nonDup = "";


            for (int i = 0; i < str.length(); i++) {
                if (!nonDup.contains(str.charAt(i) + "")) {
                    nonDup += str.charAt(i);
                }

            }

        return nonDup;

    }

}






