package Replit;

public class PrintUniqueWords {
    public static void main(String[] args) {
String[] words1 = {"java", "code", "python", "code", "rust", "code", "rust"};
printUniqueWords(words1);
    }

    public static void printUniqueWords(String[] words){

        for(int i=0; i< words.length; i++){

            int count =0;

            for(int j=0; j< words.length; j++){

                if(words[i].equals(words[j])){
                    count++;
                }
            }

            if(count==1){
                System.out.println(words[i]);
            }
        }
    }
}
