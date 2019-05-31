package Species;

public class Panda extends Animal {
//    String name = "Kung Fu Panda";

    public Panda(String name) {
        super(name);
    }

    @Override
    public void animalInfo (){
        System.out.println("I am " +name+ "." + "\n" + "I belong to the " +phylum+ " phylum." + "\n" + "And part of the " +kingdom + " kingdom. "); }

    @Override
    public void eat(){ System.out.println(name + " loves to eat bamboo."); }

    @Override
    public void lifeSpan(){ System.out.println(name + "'s" + " lifespan is between 20 and 35 years."); }

    @Override
    public void speed(){ System.out.println(name + " runs about 20mph."); }


}//end of class Panda
