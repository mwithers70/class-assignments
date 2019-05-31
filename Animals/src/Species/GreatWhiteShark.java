package Species;

public class GreatWhiteShark extends Animal {
//    String name = "Great White Shark" ;

    public GreatWhiteShark(String name) { super(name); }

    @Override
    public void animalInfo (){
        System.out.println("I am a " +name+ "." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom+ " kingdom."); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat seals, sea lions and dolphins."); }

    @Override
    public void lifeSpan(){ System.out.println(name+ "'s" + " lifespan is between 30 and 40 years."); }

    @Override
    public void speed(){ System.out.println(name + " moves about 15mph!"); }


}//end of class GreatWhiteShark
