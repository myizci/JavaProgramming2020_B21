package day29_Methods;

public class Practice3 {
    public static void main(String[] args) {

        int oldness=19;
        String ctz ="UK";

        Boolean condition = true;
String firstname = "Daniel";
        eligibleToVote(firstname,ctz,oldness,condition);

    }

    public static void eligibleToVote(String name,String citizenship, int age, boolean isalive){
        if(citizenship.equalsIgnoreCase("USA")){
            if(isalive){
                if(age>=18){
                    System.out.println(name+" can vote");
                }else {
                    System.err.println(name +" has to be 18 or more");
                }
            }else {
                System.out.println(name+" has to be alive");

            }


        }else {

            System.out.println(name +" has to be a US citizen");
        }

    }
}
