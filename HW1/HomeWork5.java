public class HomeWork5 {

    /* Created by Ksenia Bondar 11.12.2020 */

    /* Method for 5th task */
    public static void isLeap(int year){

        if (year % 4 != 0){
            System.out.println(year + " год не является високосным");
        } else {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " год не является високосным");
            } else {
                System.out.println(year + " год является високосным");
            }
        }

    }

    public static void main(String[] args) {

        int year = 2020;
        isLeap(year);

        year = 1900;
        isLeap(year);

        year = 1600;
        isLeap(year);

        year = 1300;
        isLeap(year);

        year = 2019;
        isLeap(year);

        year = 1812;
        isLeap(year);

    }

}
