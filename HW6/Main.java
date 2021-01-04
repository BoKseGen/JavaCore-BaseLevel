import java.io.*;
import java.util.Locale;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //task 1
        try{
            FileOutputStream fos1 = new FileOutputStream("file1.txt");//, true);
            byte[] str1 = ("Многопоточность (англ. Multithreading) — свойство платформы (например, операционной системы, " +
                    "виртуальной машины и т. д.) или\nприложения, состоящее в том, что процесс, порождённый в операционной системе, " +
                    "может состоять из нескольких потоков,\nвыполняющихся «параллельно», то есть без предписанного " +
                    "порядка во времени. ").getBytes();

            fos1.write(str1);
            fos1.close();

            FileOutputStream fos2 = new FileOutputStream("file2.txt");//, true);
            byte[] str2 = ("При выполнении некоторых задач\nтакое разделение может достичь более эффективного" +
                    "использования ресурсов вычислительной машины.\nТакие потоки называют также потоками" +
                    "выполнения (от англ. thread of execution);\nиногда называют «нитями»" +
                    "(буквальный перевод англ. thread) или неформально «тредами».\n").getBytes();

            fos2.write(str2);
            fos2.close();
        } catch (IOException exception){
            exception.printStackTrace();
        }

        //task 2
        try{

            //create file3.txt
            FileOutputStream fos = new FileOutputStream("file3.txt");//,true);

            //read file1.txt and write it to file3.txt
            FileInputStream fis = new FileInputStream("file1.txt");
            byte[] str1 = new byte[fis.available()];
            fis.read(str1);
            fos.write(str1);

            //same file2.txt
            fis = new FileInputStream("file2.txt");
            byte[] str2 = new byte[fis.available()];
            fis.read(str2);
            fos.write(str2);

            //print end var of file3.txt
            FileInputStream fis3 = new FileInputStream("file3.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis3));
            int outBox;
            while((outBox = reader.read()) != -1) {
                System.out.print((char) outBox);
            }

            fis.close();
            fos.close();
            reader.close();
        } catch (IOException exception){
            exception.printStackTrace();
        }

        //task3
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово, которое желаете найти в файле file3.txt:");
        try {

            String wordToSearch = input.readLine();
            if(isFileHaveWord(wordToSearch)){
                System.out.println("Данное слово есть в файле.");
            } else {
                System.out.println("Такого слова нет в файле");
            }

        } catch(IOException ioException){
            ioException.printStackTrace();
        }

    }

    public static boolean isFileHaveWord(String wordToSearch){
        try{
            FileInputStream fis = new FileInputStream("file3.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            byte[] text = new byte[fis.available()];
            fis.read(text);
            fis.close();
            String[] lines = new String(text).split("\n");
            for(String line : lines){
                String[] words = line.split(" ");
                for(String word : words){
                    if ((word.toLowerCase()).equalsIgnoreCase(wordToSearch.toLowerCase())) {
                        return true;
                    }
                }
            }
//            String str;
//            while((str=reader.readLine()) != null){
//                if(((String)str).equals(wordToSearch))
//                    return true;
//            }

        } catch (IOException exception){
            exception.printStackTrace();
        }

        return false;
    }
}
