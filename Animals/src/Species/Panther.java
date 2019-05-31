package Species;

public class Panther extends Animal {
//    String name = "Black Panther named Wakanda";

    public Panther(String name) { super(name); }

    @Override
    public void animalInfo (){
        System.out.println("I am a " +name+ "." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom+ " kingdom."); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat deer, tapir and wild boar."); }

    @Override
    public void lifeSpan(){ System.out.println(name+ "'s" + " lifespan is between 12 and 15 years."); }

    @Override
    public void speed(){ System.out.println(name + " moves about 71mph!"); }

}//end of class Panther
