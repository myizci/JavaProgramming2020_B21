package Replit;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "07:15:55AM";
        timeConversion(time);

    }

    public static void timeConversion(String s) {
        String[] arr = s.split(":");
        //System.out.println(Arrays.toString(arr));


        String[] arr2 = new String[4];
        arr2[0] = arr[0];
        arr2[1] = arr[1];
        arr2[2] = arr[2].substring(0,2);
        arr2[3] = arr[2].substring(2);


        String result = "";

        if (arr2[3].equals("AM")) {

            if ((arr2[0] + arr2[1] + arr2[2]).equals("120000")) {
                result = "00:00:00";
            } else {
                result = arr2[0] + ":" + arr2[1] + ":" + arr2[2];
            }
        } else {
           //System.out.println(Arrays.toString(arr2));
          //  System.out.println(arr2[0]);
            switch (arr2[0]) {

                case "01": case"1":
                    result = "13" + ":" + arr2[1] + ":" + arr2[2];
                    break;
                case "02": case"2":
                    result = "14" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "03": case "3":
                    result = "15" + ":" + arr2[1] + ":" + arr2[2];
                    break;
                case "04": case "4":
                    result = "16" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "05": case "5":
                    result = "17" + ":" + arr2[1] + ":" + arr2[2];
                    break;
                case "06": case "6":
                    result = "18" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "07": case "7":
                    result = "19" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "08": case "8":
                    result = "20" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "09": case "9":
                    result = "21" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "10":
                    result = "22" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "11":
                    result = "23" + ":" + arr2[1] + ":" + arr2[2];
                    break;

                case "12":
                    result = "12" + ":" + arr2[1] + ":" + arr2[2];
                    break;


            }

        }
        System.out.println(result);
    }
}
