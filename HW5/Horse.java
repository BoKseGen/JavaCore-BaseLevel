package Animals;

import AnimalModel.Animal;

public class Horse extends Animal{

    public Horse(String name){
        super(name);
        this.swimLimit = 100;
        this.jumpLimit = 3;
        this.runLimit = 1500;
    }

    public Horse(String name, float swimLimit, float jumpLimit, float runLimit){
        super(name);
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

}
