public class HomeWork3 {

    /* Created by Ksenia Bondar 11.12.2020 */

    /* Method for 3rd task */
    public static void isPositive(int num){
        if (num >= 0) {
            System.out.println("Число " + num + " положительное");
        } else
        {
            System.out.println("Число " + num + " отрицательное");
        }
    }

    public static void main(String[] args) {

        isPositive(5);
        isPositive(0);
        isPositive(-100);

    }
}
