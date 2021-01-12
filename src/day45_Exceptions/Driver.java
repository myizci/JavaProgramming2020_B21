package day45_Exceptions;

public class Driver {
    public static void main(String[] args) {


        String browserName = "Chrome";

        switch(browserName.toLowerCase()){

            case "chrome":

                System.out.println("chrome is selected");
                break;

            case "firefox":
                System.out.println("firefox is selected");
                break;

            case "safari":
                System.out.println("safari is selected");
                break;

            case "opera":
                System.out.println("opera is selected");
                break;

            default:
            throw new RuntimeException("No such browser named "+ browserName);

        }
        System.out.println("==================================================");

        throw new ClassCastException("Invalid Class");



    }
}
