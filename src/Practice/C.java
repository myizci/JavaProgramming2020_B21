package Practice;

interface Atts {
    public int num =25;
    static void read() {

    }
}

abstract class B implements Atts{
    private void read(){
        System.out.println("a");
    }
}

public class  C extends B{

}