package Practice.GroupWork;

public class Replit115 {
    public static void main(String[] args) {

String[] words ={"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        System.out.println(longest(words));

// calculate the length of the longest element
        // find it and return(print) it

    }

    public static String longest(String[] words) {
        String longestString = ""; //answer

        int max = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > max) {
                max = words[i].length();
            }// we have found the lenght of the longest element

        }


        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==max){
               longestString = words[i];
            }

        }
        return longestString;
    }
}