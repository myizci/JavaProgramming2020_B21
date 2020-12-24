package Office_Hours.Practice_12_09_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetClass {

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();
        Carpet carpet5 = new Carpet();

        carpet1.customizeOrder(5, 7, 14, true);
        carpet2.customizeOrder(8, 10, 16, true);
        carpet3.customizeOrder(6, 9, 12, false);
        carpet4.customizeOrder(12, 12, 11, false);
        carpet5.customizeOrder(10, 10, 17, true);
        ArrayList<Carpet> carpets = new ArrayList<>(Arrays.asList(carpet1, carpet2, carpet3, carpet4, carpet5));
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        persianCarpets.addAll(carpets);
        regularCarpets.addAll(carpets);
        persianCarpets.removeIf(p -> !p.isPersian);
        regularCarpets.removeIf(p -> p.isPersian);



    }
}
