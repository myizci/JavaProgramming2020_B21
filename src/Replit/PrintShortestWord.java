package Replit;

public class PrintShortestWord {
    public static void main(String[] args) {
        String[] str ={"java", "cable", "red", "vivid", "remedy", "grace"};

    int min=str[0].length();

    for(String each:str){
        if(each.length()<min){
           min =each.length();
        }
    }

    for(String each:str){
        if(each.length()==min){
            System.out.println(each);
        }
    }



    }
}
