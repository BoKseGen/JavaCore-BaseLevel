package AnimalModel;

public class Animal {

    protected String name;
    protected float jumpLimit;
    protected float runLimit;
    protected float swimLimit;

    public Animal(String name){
        this.name = name;
    }

    //moves of animals
    public void swim(float length){
        if(length < swimLimit && length > 0) {
            System.out.println("Animal " + name + " has swum " + length + " metres");
        } else {
            System.out.println("Too big swim distance " + length + " for animal " + name + ". The swim limit is " + swimLimit);
        }
    }

    public void run(float length){
        if(length < runLimit && length > 0) {
            System.out.println("Animal " + name + " has run " + length + " metres");
        } else {
            System.out.println("Too big run distance " + length + " for this animal " + name + ". The run limit is " + runLimit);
        }
    }

    public void jump(float height){
        if(height < jumpLimit && height > 0) {
            System.out.println("Animal " + name + " has jumped on " + height + " metres");
        } else {
            System.out.println("Too big jump height " + height + " for this animal " + name + ". The jump limit is " + jumpLimit);
        }

    }
}
