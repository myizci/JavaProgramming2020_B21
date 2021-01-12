package day45_Exceptions.PhoneTask;

public class HuaWei extends Phone{
    public HuaWei( String model, String country, double price) {
        super("HuaWei", model, country, price);
    }

    public void spy(){
        System.out.println(brand +" "+model+ " is spying on you");
    }
}
