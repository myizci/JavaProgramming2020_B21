package day43_Inheritance.Restaurant;

public class LocalRestaurants {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Hakan");

        Server[] servers = {
        new Server ("A",15,'M',8,"Server1","11"),
        new Server ("B",16,'F',9,"Server2","12"),
        new Server ("C",17,'M',10,"Server3","13"),
        new Server ("D",18,'F',7,"Server4","14"),
        new Server ("E",19,'M',8,"Server5","15")
    };

restaurant.hireServer(new Server ("A",15,'M',8,"Server1","11"));


    }
}
