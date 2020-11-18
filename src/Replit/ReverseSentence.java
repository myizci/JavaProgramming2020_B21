package Replit;

public class ReverseSentence {
    public static void main(String[] args) {
       String sentence = "Java is fun";
        String reversed="";

        String[] mySentence= sentence.split(" ");
        //System.out.println(Arrays.toString(mySentence));

        String[] mySentence2= new String[mySentence.length];

        for(int i=0; i< mySentence.length; i++){

            mySentence2[i]=mySentence[mySentence.length-1-i];
        }

       // System.out.println(Arrays.toString(mySentence2));

        for(int i=0; i< mySentence2.length; i++){

            reversed+=mySentence2[i]+" ";
        }
       reversed=reversed.trim();


    }
}
