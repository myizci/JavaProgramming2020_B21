package day33_ArrayList;

public class WrapperClassPractice {
    public static void main(String[] args) {

        String str = "a1b2c3";
        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.valueOf("" + each);
            }
        }
        System.out.println("sum= " + sum);

        System.out.println("=========================");

        String password = "Password#7";
        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChar = "";

        for(char each : password.toCharArray()){

            if(Character.isUpperCase(each)){ //verifies if the char is Uppercase
                upperLetters+=each;
            }else if(Character.isLowerCase(each)){ //verifies if the char is Lowercase
                lowerLetters+=each;
            }else if(Character.isDigit(each)){ // verifies if thr char is a digit
                digits+=each;
            }else{ // special char case
                specialChar+=each;
            }

        }


        System.out.println("upperLetters = " + upperLetters);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("specialChar = " + specialChar);
        System.out.println("digits = " + digits);

        boolean isValid = (password.length()>=8)&&(upperLetters.length()>0)&&(lowerLetters.length()>0)
                &&(specialChar.length()>0)&&(digits.length()>0);

        System.out.println(isValid);
    }
}
