package Replit;

public class Carpet {

    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

    public Carpet()
    {
        width =300;
        length =300;
        unitPrice=0;
        totalPrice=200;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice =(isPersian)? length*width*unitPrice+200:length*width*unitPrice;
    }




}
