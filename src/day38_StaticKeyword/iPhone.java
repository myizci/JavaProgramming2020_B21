package day38_StaticKeyword;

public class iPhone {

    public String model,color;
    public double price;
    public int storage;

    public static String brand="Apple", OS = "IOS", madeIn ="China";

    public void call(long phoneNumber){

        System.out.println("Iphone "+model + " is calling "+ phoneNumber);
    }

    public static void getInfo(){

        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + OS);
        System.out.println("Made in: " + madeIn);
    }

    public String toString(){
       return "Brand: "+brand +", Model: "+ model+"' Color: "+color+", Price: "+ price+ ", Operating System: "+OS;
    }

}
