package Replit;

public class LameCalculator {

  public int num1,num2;  // we have to initialize the variable

    public void setInfo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    } // to initialize the variable

    public int plus(int num1,int num2){

        return num1+num2;
    }

    public int minus(int num1,int num2){

        return num1-num2;
    }

    public int multiply(int num1,int num2){

        return num1*num2;
    }

    public int divide(int num1,int num2){  //what if num2 is zero???? it does not work
          return num1/num2;

    }


}
