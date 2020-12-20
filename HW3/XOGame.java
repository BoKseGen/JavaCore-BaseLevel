import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XOGame {

    /* Created by Ksenia Bondar 17.12.2020 */

    public static final char HUMAN_DOT = 'X'; //player 1 - human
    public static final char PC_DOT = 'O'; //player 2 — computer
    public static final char EMPTY_DOT = '_';
    public static final int DOT_TO_WIN = 3; //сколько подряд элементов должно идти для победы. для 5x5 надо поменять значение на 4

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static char[][] map; //поле
    public static int mapSizeX;
    public static int mapSizeY;

    //проинициализировали нашу карту
    public static void initMap(){
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeX][mapSizeY];

        for(int i = 0; i < mapSizeY; ++i){
            for(int j = 0; j < mapSizeX; ++j){
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    //вывод карты на экран
    public static void printMap(){
        for(int y = 0; y < mapSizeY; ++y){
            for(int x = 0; x < mapSizeX; ++x){
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    //описание хода человека
    public static void humanTurn(){
        int x, y; //coordinates

        do {
            System.out.println("Введите координаты: ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));

        map[y][x] = HUMAN_DOT;
    }

    //компьютера
    public static void aiTurn(){
        int x, y; //coordinates

        do {
            x = RANDOM.nextInt(mapSizeX);
            y = RANDOM.nextInt(mapSizeY);
        } while (!isEmptyCell(y, x));

        map[y][x] = PC_DOT;
    }

    public static boolean isValidCell(int y, int x){
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int y, int x){
        return map[y][x] == EMPTY_DOT;
    }

    public static boolean isMapFull(){
        for(int y = 0; y < mapSizeY; ++y){
            for(int x = 0; x < mapSizeX; ++x)
                if(map[y][x] == EMPTY_DOT) return false;
        }
        return true;
    }

    public static boolean checkWin(char inboxChar){
//        в лоб для 3х3
//        if (map[0][0] == inboxChar && map[0][1] == inboxChar && map[0][2] == inboxChar) return true;
//        if (map[1][0] == inboxChar && map[1][1] == inboxChar && map[1][2] == inboxChar) return true;
//        if (map[2][0] == inboxChar && map[2][1] == inboxChar && map[2][2] == inboxChar) return true;
//
//        if (map[0][0] == inboxChar && map[1][0] == inboxChar && map[2][0] == inboxChar) return true;
//        if (map[0][1] == inboxChar && map[1][1] == inboxChar && map[2][1] == inboxChar) return true;
//        if (map[0][2] == inboxChar && map[1][2] == inboxChar && map[2][2] == inboxChar) return true;
//
//        if (map[0][0] == inboxChar && map[1][1] == inboxChar && map[2][2] == inboxChar) return true;
//        if (map[0][2] == inboxChar && map[1][1] == inboxChar && map[2][0] == inboxChar) return true;

        //для любого размера поля
        //проверка горизонталей и вертикалей
        for(int y = 0; y < mapSizeY; ++y){
            int counter1 = 0; //счётчик для подсчёт по горизонтали
            int counter2 = 0; //счётчик для подсчёта вертикалей
            for(int x = 0; x < mapSizeX; ++x){
                //проверка горизонтали
                if (map[y][x] == inboxChar)
                    counter1++;
                //проверка вертикали
                if (map[x][y] == inboxChar)
                    counter2++;
            }
            if(counter1 == DOT_TO_WIN || counter2 == DOT_TO_WIN)
                return true;
        }

        //проверка главной и побочной диагоналей
        int counter1 = 0;  //для подсчёта главной диагонали
        int counter2 = 0; //для побочной
        for(int y = 0; y < mapSizeY; ++y){
            if(map[y][y] == inboxChar)
                counter1++;
            if(map[y][mapSizeY - y - 1] == inboxChar)
                counter2++;
        }
        if(counter1 == DOT_TO_WIN || counter2 == DOT_TO_WIN)
            return true;

        return false;
    }

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if(checkWin(HUMAN_DOT)){
                System.out.println("Human win");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(PC_DOT)){
                System.out.println("AI win");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }

        //Правила
        /*
        а) очередность хода
        б) нельзя ставить в заполненную клетку
        в) условие победы(горизонталь, вертикаль, диагональ)
        г) никто не выйграл, то конец игры, ничья, поле заполнено приэтом
        д) корректность хода
        е) ход противнику передаём
         */
    }
}
