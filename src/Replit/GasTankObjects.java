package Replit;

public class GasTankObjects {
    public static void main(String[] args) {
        GasTank g1 = new GasTank(15);
        g1.addGas(3);
        System.out.println(g1.getGasLevel());
        System.out.println(g1.fillUp());
        g1.addGas(23);
        System.out.println(g1.getGasLevel());
        g1.useGas(34);
        System.out.println(g1.getGasLevel());

    }
}
