package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {
    public static void main(String[] args) {
        char n = 'w';

        System.out.println(Character.isDigit(n));
        System.out.println(Character.isLetter(n));

        String str = "a1b2c3b4c5d_+~`! =?/6T@w$y%o^p%";

        String digits="";
        String letters="";
        String specialChar = "";

        for(char each : str.toCharArray()){

            if(Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else {
                specialChar+=each;
            }
        }
        System.out.println(digits+ " "+ letters+ " "+ specialChar);

        /*
        Password validation

        1. 8 characters at least
        2. there must be a digit
        3. there must be a letter ,one upper case, one lower case
        4. there must be a special character
        5.

         */

    }
}
