package Replit;

public class GasTank {

    public double amount =0;
    public double capacity;

    public GasTank(double capacity ){
        this.capacity = capacity;
    }

    public void addGas(double gas){

        if(amount+gas>capacity){
            amount = capacity;
        }else amount+=gas;
    }

    public void useGas(double gas){

        if(amount-gas<0){
            amount = 0;
        }else amount-=gas;
    }


    public boolean isEmpty(){

        return (amount<0.1);
    }


    public boolean isFull(){

        return(amount>capacity-0.1);
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double temp = amount;
        amount = capacity;
        return capacity-temp;


    }






}
