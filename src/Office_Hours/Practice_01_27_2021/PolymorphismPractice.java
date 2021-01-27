package Office_Hours.Practice_01_27_2021;

import day45_Exceptions.PhoneTask.*;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Phone phone = new Iphone("12",1000);


        Phone[] phones ={
                new Iphone("12 pro", 1100),
                new Samsung("S20", "South Korea",1000),
                new Nokia("N95", 200),
                new HuaWei("meta 40", "PRC",100),
                new HuaWei("meta 40", "PRC",100),
                new Iphone("11 pro", 1100),
                new Iphone("12 pro", 1100),
                new Iphone("12 pro", 1100),
                new HuaWei("meta 40", "PRC",100),
                new Samsung("S20", "South Korea",1000),
                new Samsung("S20", "South Korea",1000),
                new Nokia("N95", 200),
                new Nokia("N95", 200),
                new Iphone("12 pro", 1100),
                new Samsung("S20", "South Korea",1000),
                new Nokia("N95", 200),
                new Nokia("N95", 200),
                new Nokia("N95", 200),
                new Nokia("N95", 200),
                new Iphone("11 pro", 1100),
                new Iphone("12 pro", 1100),
                new Iphone("12 pro", 1100)

        };


        int countIphone=0;
        int countNokia=0;
        int countSamsung=0;
        int countHuawei=0;

        for(Phone each:phones){
            if(each instanceof Iphone){
                countIphone++;
            }else if(each instanceof Nokia){
                countNokia++;

            }else if(each instanceof Samsung){
                countSamsung++;

            }else{
                countHuawei++;
            }





        }


    }

}
