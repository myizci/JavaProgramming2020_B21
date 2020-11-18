package day30_ReturnMethods;

public class WarmUp {



    public static void withoutDuplicates(String str){

        String result="";
//        for(String each: str.split("")){
//
//            if(!result.contains(each)){
//                result+=each;
//
//            }
//od
//        }



        for(int i=0; i<=str.length()-1; i++){

            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);


    }


    public static void formattedFullName(String first, String last){



        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();


        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String result = first + " "+ last;
        System.out.println(result);


    }



}
