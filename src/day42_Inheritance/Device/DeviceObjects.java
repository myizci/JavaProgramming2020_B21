package day42_Inheritance.Device;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv = new TV("Sony", "XYZ", 1200);

        System.out.println(tv);
        tv.channelDown();
        tv.channelUp();
        tv.turnOn();
        tv.turnOff();

        Phone phone = new Phone("iPhone","10RX",200);

        phone.call(8144412699l);
        phone.text(8144412699l);
        phone.turnOff();
        phone.turnOn();


    }
}
