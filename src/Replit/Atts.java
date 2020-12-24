package Replit;

public class Atts{

        public String name, color;
        public int amount;

        public Atts(String name, String color, int amount) {
            this.name = name;
            this.color = color;
            this.amount = amount;
        }


        public String asString() {
            return "name: " + name + " color: " + color + " amount: " + amount;
        }

}