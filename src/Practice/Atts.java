package Practice;

public class Atts {
    public String name, color;
    public int amount;

    public void setInfo(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }


    public String toString() {
        return "name: "+ name+" color: "+ color+" amount: "+amount;
    }
}
