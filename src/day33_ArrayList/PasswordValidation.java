package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Password#7";
        boolean atleast8Chars = password.length()>=8;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigits = false;


        for(char each: password.toCharArray()){

            if(Character.isUpperCase(each)){
                hasUpperCase=true;
            }
            else if(Character.isLowerCase(each)){
                hasLowerCase=true;
            }
           else  if(Character.isDigit(each)){
                hasDigits=true;
            }else {

               hasSpecialChar=true;
            }
        }

        boolean isValid = atleast8Chars&&hasDigits&&hasLowerCase&&hasSpecialChar&&hasUpperCase;

        System.out.println(isValid);
    }
}
