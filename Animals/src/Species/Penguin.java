package Species;

public class Penguin extends Animal {
//    String name = "Penquin named Benny";

    public Penguin(String name) { super(name); }

    @Override
    public void animalInfo() {
        System.out.println("I am a " + name + "." + "\n" + "I belong to the " + phylum + " phylum." + "\n" + "And part of the " + kingdom + " kingdom."); }

    @Override
    public void eat() { System.out.println(name + " loves to eat fish, crab, squid."); }

    @Override
    public void lifeSpan() { System.out.println(name + "'s" + " lifespan is between 20 and 30 years."); }

    @Override
    public void speed() { System.out.println(name + " moves about 40mph."); }

}//end of class Penguin

