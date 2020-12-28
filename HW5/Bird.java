package Animals;

import AnimalModel.Animal;

public class Bird extends Animal{

    public Bird(String name){
        super(name);
        this.jumpLimit = 0.5f;
        this.runLimit = 5;
    }

    public Bird(String name, float swimLimit, float jumpLimit, float runLimit){
        super(name);
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public void swim(float length){
        System.out.println("Animal " + name + " hasn't swum because birds can't swim.");
    }

}
