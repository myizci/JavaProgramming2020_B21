package Office_Hours.Practice_11_11_202;

public class ArraysPractice2 {
    public static void main(String[] args) {
        String[] word = {"Anna","Level","Lol","Donald","Biden","Aamir","Agalar","Engin","Meryem"};


        int count =0;


        for(String each: word){

            char firstChar = each.toLowerCase().charAt(0);
            char lastchar = each.toLowerCase().charAt(each.length()-1);

            if(firstChar==lastchar){

                count++;
            }
        }

        System.out.println(count);
        }
    }