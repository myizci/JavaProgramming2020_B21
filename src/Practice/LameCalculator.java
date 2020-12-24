package Practice;

public class LameCalculator {

    public double num1, num2;

    public void setInfo(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double plus(double num1, double num2) {

        return num1 + num2;
    }

    public double minus(double num1, double num2) {

        return num1 - num2;
    }

    public double multiply(double num1, double num2) {

        return num1 * num2;
    }


    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("invalid value");
            return -1;
        }
    }


}