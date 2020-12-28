package Animals;

import AnimalModel.Animal;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
        this.jumpLimit = 2;
        this.runLimit = 200;
    }

    public Cat(String name, float swimLimit, float jumpLimit, float runLimit){
        super(name);
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }
    @Override
    public void swim(float length){
        System.out.println("Animal " + name + " hasn't swum because cats don't like swimming.");
    }

}
