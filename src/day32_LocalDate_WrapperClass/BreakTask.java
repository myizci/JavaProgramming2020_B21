package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class BreakTask {
    public static void main(String[] args) {

        HappyBirthDay(1977, 11, 23);
    }

    public static void HappyBirthDay(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        if (month2 == month && day == day2) {
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.out.println("Today is not your birthday");
/*


        public static void HappyBirthDay(LocalDate DofB){
            LocalDate today = LocalDate.now();
            if(today.isEqual(DofB)){
                System.out.println("Today is your birthday!!!");
                System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
                System.out.println("  \t \t  \t \t *  *                                       *  * ");
                System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
                System.out.println("  \t \t  \t \t *  *                                       *  * ");
                System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
                System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
                return;
            }
    }

 */
    }
}