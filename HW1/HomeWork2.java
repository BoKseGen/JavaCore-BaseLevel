public class HomeWork2 {

    /* Created by Ksenia Bondar 11.12.2020 */

    /* Method for 2nd task */
    public static boolean checkSum(byte num1, byte num2) {

        if ((num1 + num2 >= 10) && (num1 + num2 <= 20)) return true;

        return false;

        /* в этом методе вместо кода выше написать только эту строку
        но мы таким не пользовались на уроке, поэтому закомментировала

        return (num1 + num2 >= 10) && (num1 + num2 <= 20);

         */
    }
    public static void main(String[] args){

        byte num1 = 11;
        byte num2 = 30;
        System.out.println(checkSum(num1, num2)); //11 + 30 false

        num1 = 11;
        num2 = 2;
        System.out.println(checkSum(num1, num2)); //11 + 2 true

    }
}
