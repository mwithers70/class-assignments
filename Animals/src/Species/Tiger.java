package Species;

//import java.io.*;

public class Tiger extends Animal {
//    String name = "Tony the Tiger";

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void animalInfo() {
        System.out.println("I am " + name + "." + "\n" + "I belong to the " + phylum + " phylum." + "\n" + "And part of the " + kingdom + " kingdom.");
    }

    @Override
    public void eat() {
        System.out.println(name + " will devour an antelope.");
    }

    @Override
    public void lifeSpan() {
        System.out.println(name + " lifespan is between 18 to 25 years.");
    }

    @Override
    public void speed() {
        System.out.println(name + " runs about 30 to 40mph.");
    }
}







