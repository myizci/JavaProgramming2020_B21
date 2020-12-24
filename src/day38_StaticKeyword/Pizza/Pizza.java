package day38_StaticKeyword.Pizza;

import java.util.Scanner;

public class Pizza {

    public String size;

    public double tip,cheeseTopping, pepperoniTopping;

    public static double cheese = 1.0, pepperoni = 1.5;

    public Scanner scan = new Scanner(System.in);

    public void setInfo(String size, int cheeseTopping, int pepperoniTopping, double tip) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        this.tip = tip;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseTopping= $" + cheeseTopping +
                ", pepperoniTopping= $" + pepperoniTopping +
                ", you have tipped = $" + tip +
                '}';
    }

public double calcCost(){
        double pizzaCost=0;

    if(size.equals("small")){
        pizzaCost =10;
    }else if(size.equals("medium")){
        pizzaCost =12;
    }else {
        pizzaCost =14;
    }
    pizzaCost+=cheeseTopping+pepperoniTopping*1.5+tip;

        return pizzaCost;
}
    public void sizePizza() {

int pizzaSize = 0;

        do {
           System.out.println("What size pizza would you like?");
           System.out.println("\n\t Small size: enter 1");
           System.out.println("\n\t Medium size: enter 2");
           System.out.println("\n\t Large size: enter 3");

           pizzaSize = scan.nextInt();
           scan.nextLine();

           if (pizzaSize > 0 && pizzaSize < 4) {

               if (pizzaSize == 1) {
                   size = "small";
                   System.out.println("Small pizza is $10");


               } else if (pizzaSize == 2) {
                   size = "medium";
                   System.out.println("Medium pizza is $12");
               } else {
                   size = "large";
                   System.out.println("Large pizza is $14");
               }
           }
       }while(pizzaSize<1||pizzaSize>3); // do"ask me what I want " while " I give the wrong answer


    }

    public  void cheeseTopping(){
      String YesOrNo="";


        do{
            System.out.println("Would you like to have a cheese topping?");
             YesOrNo = scan.nextLine();

            if(YesOrNo.equalsIgnoreCase("yes")){
                cheeseTopping =1;
            }else{
                cheeseTopping=0;
            }
        } while(!(YesOrNo.equalsIgnoreCase("yes")||YesOrNo.equalsIgnoreCase("no")));


    }

    public  void pepperoniTopping(){
        String YesOrNo="";


        do{
            System.out.println("Would you like to have a  pepperoni topping?");
            YesOrNo = scan.nextLine();

            if(YesOrNo.equalsIgnoreCase("yes")){
                pepperoniTopping =1.5;
            }else{
                pepperoniTopping=0;
            }
        } while(!(YesOrNo.equalsIgnoreCase("yes")||YesOrNo.equalsIgnoreCase("no")));


    }

    public void tipAmount(){


        System.out.println("Please enter your tip");
        tip = scan.nextDouble();

    }

    public void customizeOrder(){
       sizePizza(); // sets "size"
        cheeseTopping(); // if they want ct or not
        pepperoniTopping();
        tipAmount();
        double pizzaCost =0;

        if(size.equals("small")){
            pizzaCost =10;
        }else if(size.equals("medium")){
            pizzaCost =12;
        }else {
            pizzaCost =14;
        }
        pizzaCost+=cheeseTopping+pepperoniTopping+tip;

        System.out.println("Your pizza costs $"+pizzaCost);



    }    /*
    create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    tips
            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the total cost  as double
                    toString(): get the full information and total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping

     */
}
