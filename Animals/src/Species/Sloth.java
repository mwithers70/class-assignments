package Species;

public class Sloth extends Animal {
//    String name = "Sid the Sloth";

    public Sloth(String name) {super(name);}

    @Override
    public void animalInfo (){
        System.out.println("I am " +name+ "." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom+ " kingdom."); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat leaves, buds and fruit."); }

    @Override
    public void lifeSpan(){ System.out.println(name+ "'s" + " lifespan is between 25 and 40 years."); }

    @Override
    public void speed(){ System.out.println(name + " moves about 15mph!"); }





}//end of class Sloth
