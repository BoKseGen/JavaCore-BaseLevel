import java.util.Arrays;

public class HW2 {

    /* Directed by Ksenia Bondar 15.12.2020 */

    //Method for 1st task
    public static void changeArray(int[] array){
        for(int i = 0; i < array.length; ++i){
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    //Method for 2nd task
    public static void fillArray(int [] array){
        array[0] = 1;
        for(int i = 1; i < array.length; ++i){
            array[i] = array[i - 1] + 3;
        }
    }

    //Method for 3rd task
    public static void makeBigger(int[] array){
        for(int i = 0; i < array.length; ++i){
            array[i] = (array[i] < 6) ? array[i] * 2 : array[i];
        }
    }

    //Methods for 4th task
    //4.1
    public static int findMax(int[] array){
        int max = -10000000;
        for(int i = 0; i < array.length; ++i){
            max = (array[i] > max) ? array[i] : max;
        }
        return max;
    }
    //4.2
    public static int findMin(int[] array){
        int min = 10000000;
        for(int i = 0; i < array.length; ++i){
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }

    //Method for 5th task
    public static void identityArray(int[][] array){
        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array[i].length; ++j){
                array[i][j] = ((i == j) || (i + j == array.length - 1)) ? 1 : 0;
            }
        }
    }
    //print function
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array[i].length; ++j){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Method for 6th task
    public static boolean checkBalance(int[] array){
        int sum1 = 0;
        for(int i = 0; i < array.length; ++i){
            sum1 += array[i];
            int sum2 = 0;
            for(int j = i + 1; j < array.length; ++j){
                sum2 += array[j];
            }
            if (sum1 == sum2) return true;
        }
        return false;
    }

    //Method for 7th task (cyclic shift with temporary array)
    public static void cyclicShift(int[] array, int shift){

        // Любой сдвиг больше длины массива можно оптимизировать до меньшего сдвига
        // через деление по модулю
        if (shift > array.length){
            shift = Math.abs(shift % array.length);
        }

        if (shift < 0) { //левый сдвиг
//            int[] tmpArray = new int[Math.abs(shift)]; //выделяю память под новый массив
//            for(int i = 0; i < tmpArray.length; ++i){ //"отрезаю" часть массива размером abs(shift) слева
//                tmpArray[i] = array[Math.abs(shift) - 1 - i];
//            }

//            System.out.println(Arrays.toString(tmpArray));
//            for(int i = 0; i < array.length - Math.abs(shift); ++i){
//                array[i] = (i < array.length - Math.abs(shift)) ? array[i + Math.abs(shift)] : tmpArray[array.length - i - 1];
//            }

            int[] tmpArray = new int[Math.abs(shift)]; //выделяю память под новый массив
            System.arraycopy(array, 0, tmpArray, 0, Math.abs(shift)); //"отрезаю" часть массива размером abs(shift) слева

            for(int i = 0; i < array.length - Math.abs(shift); ++i){
                array[i] = array[i + Math.abs(shift)];
            }

            //приклеиваем справа отрезанную часть
            System.arraycopy(tmpArray, 0, array,array.length - Math.abs(shift), Math.abs(shift));

        } else if (shift > 0) { //правый сдвиг
//            int[] tmpArray = new int[shift];
//            for(int i = 0; i < tmpArray.length; ++i){ //опять "отрезаю" часть массива размером shift, но уже справа
//                tmpArray[i] = array[array.length - 1 - i];
//            }
//            System.out.println(Arrays.toString(tmpArray));
//            for(int i = array.length - 1; i >= 0; --i){ //
//                array[i] = (i >= shift) ? array[i - shift] : tmpArray[shift - i - 1];
//            }

            int[] tmpArray = new int[shift]; //выделяю память под новый массив
            System.arraycopy(array, array.length - Math.abs(shift), tmpArray, 0, shift); //"отрезаю" часть массива, но теперь уже справа

            for(int i = array.length - 1; i >= shift; --i){
                array[i] = array[i - shift];
            }
            //приклеиваем слева отрезанную часть
            System.arraycopy(tmpArray, 0, array,0, Math.abs(shift));



        } else {
            System.out.println("Похоже Вы ввели длину сдвига, равную 0. Массив не изменится в этом случае.");
        }
    }

    //Method for 8th task
    public static void cyclicModifiedShift(int[] array, int shift){
        // Любой сдвиг больше длины массива можно оптимизировать до меньшего сдвига
        // через деление по модулю
        if (shift > array.length){
            shift = Math.abs(shift % array.length);
        }

        if (shift < 0) {
            for (int i = 0; i > shift; i--) {
                int tmp = array[0];
                System.arraycopy(array, 1, array, 0, array.length - 1);
                array[array.length - 1] = tmp;
                //System.out.println(Arrays.toString(array));
            }

        } else if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int tmp = array[array.length - 1];
                System.arraycopy(array, 0, array, 1, array.length - 1);
                array[0] = tmp;
                //System.out.println(Arrays.toString(array));
            }
        } else {
            System.out.println("Похоже Вы ввели длину сдвига, равную 0. Массив не изменится в этом случае.");
        }
    }

    //main method
    public static void main(String[] args) {
        //1st task
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //tests
        System.out.println("1st task:");
        System.out.println("Before: " + Arrays.toString(array1));
        changeArray(array1);
        System.out.println("After:  " + Arrays.toString(array1)); //print changed array1
        System.out.println();

        //2nd task
        int[] array2 = new int[8];
        System.out.println("2nd task:");
        fillArray(array2);
        System.out.println(Arrays.toString(array2)); //print filled array3
        System.out.println();

        //3d task
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3rd task:");
        System.out.println("Before: " + Arrays.toString(array3));
        makeBigger(array3);
        System.out.println("After:  " + Arrays.toString(array3));
        System.out.println();

        //4th task
        int[] array4 = {100, 50, 1300, 12, -100, 84, 17, 32, 1002};
        int maxVal = findMax(array4);
        int minVal = findMin(array4);
        System.out.println("4th task:");
        System.out.println("Array: " + Arrays.toString(array4));
        System.out.println("Max element: " + maxVal);
        System.out.println("Min element: " + minVal);
        System.out.println();

        //5th task
        int size = 5; //чтоб было проще поменять размер квадратного массива, храню размер в size
        int[][] array5 = new int[size][size];
        System.out.println("5th task:");
        identityArray(array5);
        printArray(array5);
        System.out.println();

        //6th task
        int[] array6 = {1, 1, 1, 2, 1};
        int[] array7 = {2, 1, 1, 2, 1};
        int[] array8 = {10, 1, 2, 3, 4};
        System.out.println("6th task:");
        System.out.println("For array " + Arrays.toString(array6) +  " answer is " + checkBalance(array6)); //true
        System.out.println("For array " + Arrays.toString(array7) +  " answer is " + checkBalance(array7)); //false
        System.out.println("For array " + Arrays.toString(array8) +  " answer is " + checkBalance(array8)); //true
        System.out.println();

        //7th task
        int[] array9 = {1, 2, 3, 4, 5};
        int n = -2;
        System.out.println("7th task:");
        cyclicShift(array9, n);
        System.out.println("After cycle shift on " + n + ": " + Arrays.toString(array9));
        cyclicShift(array9, -n); //return to array [1, 2, 3, 4, 5]
        n = 2;
        cyclicShift(array9, n);
        System.out.println("After cycle shift on " + n + ": " + Arrays.toString(array9));
        System.out.println();

        //8th task
        int[] array10 ={1, 2, 3, 4, 5, 6};
        n = -4;
        System.out.println("8th task:");
        cyclicModifiedShift(array10, n);
        System.out.println("After cycle shift on " + n + ": " + Arrays.toString(array10));
        cyclicModifiedShift(array10, -n); //return to array [1, 2, 3, 4, 5, 6]
        n = 4;
        cyclicModifiedShift(array10, n);
        System.out.println("After cycle shift on " + n + ": " + Arrays.toString(array10));

    }

}
