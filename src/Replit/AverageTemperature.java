package Replit;

public class AverageTemperature {
    public static void main(String[] args) {
        int k = 0;
        double total = 0;
        double avgTemp = 0;

        double[] temps={80, 88, 88, 84, 82, 78, 60, 68};
        for(double each: temps){

            total+=each;
        }
        avgTemp=total/temps.length;
        System.out.println(avgTemp);
    }
}

