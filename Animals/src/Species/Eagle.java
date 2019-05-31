package Species;

public class Eagle extends Animal {
//    String name = "Eagle Nation";

    public Eagle(String name) { super(name); }

    @Override
    public void animalInfo (){
        System.out.println("I am " +name+ "." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom+ " kingdom."); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat fish, mammals and reptiles."); }

    @Override
    public void lifeSpan(){ System.out.println(name+ "'s" + " lifespan is between 15 and 30 years."); }

    @Override
    public void speed(){ System.out.println(name + " moves about 100mph!"); }




}//end of class Eagle
