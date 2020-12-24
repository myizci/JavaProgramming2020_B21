package Replit;

public class TestArea {


    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setId(101);
        b1.setAuthor("omer toksoz");
        b1.setTitle("and this magnificent and or lake");
        b1.setPages(14);

        System.out.println(b1);


    }
//    public static void main(String[] args) {
//        System.out.println(capitalize("omEr tokSoz"));
//        String title1 = "this magnificent";
//       setTitle(title1);
//        System.out.println(title1);
//    }
//
//    public static String capitalize(String word) {
//        String result = "";
//
//        if (word.isEmpty()) {
//            return "";
//        } else {
//            String[] words = word.split(" ");
//            for (int i = 0; i < words.length; i++) {
//
//                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
//
//
//            }
//            for (String each : words) {
//                result += each + " ";
//            }
//            return result.trim();
//        }
//
//    }
//
//
//    public static void setTitle(String title) {
//        String temp="";
//        String[] titles = title.split(" ");
//        int l = titles.length;
//
//        if (title.isEmpty()) {
//            title = "";
//        } else if (l == 1) {
//            title =capitalize(title);
//        } else {
//            for (int i = 0; i < l; i++) {
//
//                if (isTitleWord(titles[i])) {
//                  temp+= capitalize(titles[i]+" ");
//                }else{
//                    temp+=titles[i]+" ";
//
//                }
//            }
//            temp=temp.trim();
//
//        }
//
//        title=temp;
//    }
//
//
//    public static Boolean isTitleWord(String word) {
//
//        switch (word) {
//            case "a":
//            case "an":
//            case "the":
//            case "and":
//            case "but":
//            case "for":
//            case "nor":
//            case "or":
//            case "so":
//            case "yet":
//            case "at":
//            case "by":
//            case "in":
//            case "into":
//            case "near":
//            case "of":
//            case "on":
//            case "to":
//            case "than":
//            case "via":
//                return false;
//
//            default:
//                return true;
//
//        }
//
//        //return null;
//
//    }


}