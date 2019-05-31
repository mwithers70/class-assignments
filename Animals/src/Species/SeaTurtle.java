package Species;

public class SeaTurtle extends Animal {
//    String name = "Turtle-ton";

    public SeaTurtle(String name) {
        super(name);
    }

    @Override
    public void animalInfo (){
        System.out.println("I am " +name+ " a Sea Turtle." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom+ " kingdom."); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat fish, crab, seaweed and jellyfish."); }

    @Override
    public void lifeSpan(){ System.out.println(name+ "'s" + " lifespan is between 60 and 80 years."); }

    @Override
    public void speed(){ System.out.println(name + " moves about 2.4mph."); }


}//end of class SeaTurtle
