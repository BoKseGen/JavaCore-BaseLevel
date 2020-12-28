package Animals;

import AnimalModel.Animal;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
        this.swimLimit = 10;
        this.jumpLimit = 0.5f;
        this.runLimit = 500;
    }

    public Dog(String name, float swimLimit, float jumpLimit, float runLimit){
        super(name);
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

}
