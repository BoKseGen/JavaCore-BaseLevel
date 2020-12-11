public class HomeWork1 {

    /* Created by Ksenia Bondar 11.12.2020 */

    /* Method for 1st task */
    public static float countExpression(int a, int b, int c, int d) {

        return a * (b + ((float)c / d));

    }
    
    public static void main(String[] args){

        int a = 16;
        int b = 30;
        int c = 1100;
        int d = 45;

        System.out.println(countExpression(a, b, c, d));

    }
}
