public class HomeWork1 {

    /* Created by Ksenia Bondar 11.12.2020 */

    /* Method for 1st task */
    public static float countExpression(int a, int b, int c, int d) {

        if (d != 0)
            return a * (b + ((float)c / d));
        else {
            System.out.println("А на 0 делить-то нельзя...\n" +
                    "Поменяйте значение d с 0 на любое другое.\n" +
                    " А пока вместо ответа выведем Вам -1.0");
            return -1;
        }

    }

    public static void main(String[] args){

        int a = 16;
        int b = 30;
        int c = 1100;
        int d = 45;
        System.out.println(countExpression(a, b, c, d));

        a = 16;
        b = 30;
        c = 1100;
        d = 0;
        System.out.println(countExpression(a, b, c, d));

    }
}
