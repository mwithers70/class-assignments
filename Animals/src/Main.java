import Species.Animal;
import Species.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    Tiger tiger = new Tiger("Tony");
    Panda panda = new Panda("Kung Fu Panda");
    Eagle eagle = new Eagle("Eagle Nation");
    GreatWhiteShark greatWhiteShark = new GreatWhiteShark("Great White Shark");
    Panther panther = new Panther("Wakanda");
    Penguin penguin = new Penguin("Benny");
    Seal seal = new Seal("Earl");
    SeaTurtle seaTurtle = new SeaTurtle("Turtle-ton");
    SiberianHusky siberianHusky = new SiberianHusky("Gotti");
    Sloth sloth = new Sloth("Sid");

       char again;

        do {
            System.out.println("What animal would you like to know more about: \n Tiger, Eagle, GreatWhiteShark, Panda, Panther, Penguin, Seal, SeaTurtle, SiberianHusky or Sloth?");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equalsIgnoreCase("Tiger")) {
                tiger.animalInfo();
                tiger.eat();
                tiger.lifeSpan();
                tiger.speed();

            } else if (answer.equalsIgnoreCase("Panda")) {
                panda.animalInfo();
                panda.eat();
                panda.lifeSpan();
                panda.speed();

            } else if (answer.equalsIgnoreCase("Eagle")) {
                eagle.animalInfo();
                eagle.eat();
                eagle.lifeSpan();
                eagle.speed();

            } else if (answer.equalsIgnoreCase("GreatWhiteShark")) {
                greatWhiteShark.animalInfo();
                greatWhiteShark.eat();
                greatWhiteShark.lifeSpan();
                greatWhiteShark.speed();

            } else if (answer.equalsIgnoreCase("Panther")) {
                panther.animalInfo();
                panther.eat();
                panther.lifeSpan();
                panther.speed();

            } else if (answer.equalsIgnoreCase("Penguin")) {
                penguin.animalInfo();
                penguin.eat();
                penguin.lifeSpan();
                penguin.speed();

            } else if (answer.equalsIgnoreCase("Seal")) {
                seal.animalInfo();
                seal.eat();
                seal.lifeSpan();
                seal.speed();

            } else if (answer.equalsIgnoreCase("SeaTurtle")) {
                seaTurtle.animalInfo();
                seaTurtle.eat();
                seaTurtle.lifeSpan();
                seaTurtle.speed();

            } else if (answer.equalsIgnoreCase("SiberianHusky")) {
                siberianHusky.animalInfo();
                siberianHusky.eat();
                siberianHusky.lifeSpan();
                siberianHusky.speed();

            } else if (answer.equalsIgnoreCase("Sloth")) {
                sloth.animalInfo();
                sloth.eat();
                sloth.lifeSpan();
                sloth.speed();

            } else {
                System.out.println("Knowledge is power and you're missing out!!");
            }//last part to if statement
            System.out.println("Do you want learn about another animal?");
            again = scanner.nextLine().toLowerCase().charAt(0);
        }while (again == 'y' );
        System.out.println("Knowledge is power and you're missing out!!");

    }//end of void main


}//end of class Main
