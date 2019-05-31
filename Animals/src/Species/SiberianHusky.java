package Species;

public class SiberianHusky extends Animal {

    public SiberianHusky(String name) { super(name); }


    @Override
    public void animalInfo (){
        System.out.println("I am " +name+ " a Siberian Husky" + "." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom+ " kingdom."); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat raw chicken, beef, fish, fruits and lamb."); }

    @Override
    public void lifeSpan(){ System.out.println(name+ "'s" + " lifespan is about 15 years."); }

    @Override
    public void speed(){ System.out.println(name + " moves at a top speed of 31mph!"); }
}
