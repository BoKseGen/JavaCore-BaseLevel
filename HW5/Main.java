import AnimalModel.Animal;
import Animals.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args){

        Bird bird = new Bird("Kesha");
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Bobik");
        Horse horse = new Horse("Luna");

        /*
            выполнение задания, когда у всех животных, принадлежащих одному классу,
            один и тот же лимит для методов run(), swim(), jump().
            Допустим, любая собака не может прыгнуть выше 0.2 м.
         */
        Animal[] animals = {bird, cat, dog, horse};

        for(int i = 0; i < animals.length; ++i){
            animals[i].run((float)((Math.random() * 1700) / ((Math.random() * 100) + 1)));
            animals[i].swim((float)((Math.random() * 1700) / ((Math.random() * 100) + 1)));
            animals[i].jump((float)((Math.random() * 1700) / ((Math.random() * 1000) + 1)));
            System.out.println();
        }
        System.out.println();

        /*
                Выполнение задания, где у всех животных свой собственный лимит
                для методов run(), jump(), swim().
         */
        System.out.println("TASK 5 :\n");
        Bird bird1 = new Bird("Bird1", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));
        Bird bird2 = new Bird("Bird2", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));

        Cat cat1 = new Cat("Cat1", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));
        Cat cat2 = new Cat("Cat2", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));

        Dog dog1 = new Dog("Dog1", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));
        Dog dog2 = new Dog ("Dog2", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));

        Horse horse1 = new Horse("Horse1", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));
        Horse horse2 = new Horse("Horse2", (float)(Math.random() * 300), (float)(Math.random() * 3), (float)(Math.random() * 600));

        Animal[] animalList = {bird1, bird2, cat1, cat2, dog1, dog2, horse1, horse2};
        for(int i = 0; i < animalList.length; ++i){
            animalList[i].run((float)((Math.random() * 1700) / ((Math.random() * 500) + 1)));
            animalList[i].swim((float)((Math.random() * 1700) / ((Math.random() * 500) + 1)));
            animalList[i].jump((float)((Math.random() * 1700) / ((Math.random() * 500) + 1)));
            System.out.println();
        }

    }
}
