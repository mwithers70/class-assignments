import java.util.ArrayList;
import java.util.Scanner;

public class WheelOfFortune {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.setPuzzles("puzzle.txt");
        wheel.setWheelConfig("wheelConfig.txt");
        ArrayList<Player> players = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Player Michael = new Player("MICHAEL");
        Player Evan = new Player("EVAN");
        Player Prentice = new Player("PRENTICE");

        players.add(Michael);players.add(Evan);players.add(Prentice);

        //MAIN DO-WHILE LOOP!!!
        do {//main do-while loop
            ArrayList<Character> consBank = Utils.createConsBank();
            ArrayList<Character> vowelBank = new ArrayList<>();
            vowelBank.add('A');vowelBank.add('E');vowelBank.add('I');vowelBank.add('O');vowelBank.add('U');
            wheel.setCurrentPuzzle(); //iterates every time puzzle is solved and creates new puzzle.
            String currentAnswer = wheel.getPuzzleAnswer();
            String currentHint = wheel.getPuzzleHint();
            StringBuilder currentOutput = wheel.createOutput(currentAnswer);

            //reset tempCash for each player at the beginning of each round.
            for (Player p : players) {
                p.setTempCash(0);
            }

            boolean puzzleSolved = false;

            for(Player p : players){
                System.out.println(p.getName() + ": $" +p.getGrandCash() + "    ");
            }//end of for loop(Player p : players)


            do {//start of 1st do loop
                for (Player p : players) {
                    boolean playerContinue = true;
                    while(playerContinue && !puzzleSolved) {
                        System.out.println("It is " + p.getName() + "'s turn.");
                        System.out.println(p.getName()+ " Grand Total: $" +p.getGrandCash()+ " TempCash: $" +p.getTempCash());
                        p.setTurnCash(0);

                        System.out.println(currentHint);
                        System.out.println(currentOutput);

                        int userResponse = 1;

                        if (p.getTempCash() > 250) {
                            System.out.println("Press 3 to buy a vowel");
                        }//end of if(p.getTempCash)

                        System.out.println("Press 0 to quit game, 1 to spin the wheel, or 2 to solve the puzzle");
                        try {
                            userResponse = scanner.nextInt();
                        } catch(Exception e){
                            System.out.println("Invalid Entry, you lose a turn");
                            scanner.nextLine();
                            break;
                        }//end of catch block

                        if(userResponse > 3){
                            System.out.println("Invalid entry, you lose a turn");
                            break;
                        } else if(userResponse == 0) {
                            System.exit(0);//exit program

                        } else if (userResponse == 2) {
                            scanner.nextLine();
                            System.out.println("Enter your solution: ");
                            String userSolution = scanner.nextLine().toUpperCase();

                            if (userSolution.equals(currentAnswer)) {
                                System.out.println("Correct!");
                                System.out.println(p.getName() + " Solved the Puzzle");
                                p.addSolvedCash();
                                puzzleSolved = true;
                                break;
                            }//end of if(userSolution...)
                        } else if (userResponse == 1) {
                            int wheelResult = wheel.spinWheel();
                            if (wheelResult == -1) {
                                System.out.println("Wheel Landed on Lose a Turn!");
                                break;
                            } else if (wheelResult == 0) {
                                System.out.println("Wheel Landed on Bankrupt!");
                                p.setBankrupt();
                                break;
                            } else {
                                p.setTurnCash(wheelResult);
                                scanner.nextLine();
                                System.out.println("Wheel Landed on  $" + wheelResult);

                                boolean isConsonant = false;
                                char userCons;
                                do {
                                    System.out.println("Available Consonants: " +consBank);
                                    System.out.println("Select a consonant");
                                    userCons = scanner.nextLine().toUpperCase().charAt(0);

                                    if (!"AEIOU".contains(String.valueOf(userCons))) {
                                        isConsonant = true;
                                    }

                                    if(consBank.indexOf(userCons) == -1){
                                        System.out.println("That letter has already been guessed.");
                                        isConsonant = false;
                                    }

                                } while (!isConsonant);

                                consBank.remove(consBank.indexOf(userCons));

                                int letterCount = 0;//how many times letter appears in answer
                                for (int i = 0; i < currentAnswer.length(); i++) {
                                    if (userCons == currentAnswer.charAt(i)) {//"i" is the indexOf that character.
                                        currentOutput.setCharAt(i, userCons); //replaces the * with the character the user input
                                        letterCount++;
                                    }//end of if(userCons)
                                }//end of for loop

                                if (letterCount == 0) {
                                    System.out.println("There aren't any " + userCons + "s in the answer");
                                    break;
                                } else {
                                    System.out.println("There are " + letterCount + " " + userCons + "s in the answer");
                                    p.addTempCash(p.getTurnCash(), letterCount);
                                    playerContinue = true;
                                }//end of else statement (sout)

                            }//end of else statement (p.setTurnCash(wheelResult));


                        } else if (userResponse == 3){
                            if(p.getTempCash()<250){
                                System.out.println("You don't have enough money. Don't press 3");
                                break;
                            }
                            boolean isVowel = true;
                            char userVowel;
                            do {
                                scanner.nextLine();
                                System.out.println("Select a vowel");
                                userVowel = scanner.nextLine().toUpperCase().charAt(0);

                                if ("AEIOU".contains(String.valueOf(userVowel))) {
                                    isVowel = true;
                                }
                                if(vowelBank.indexOf(userVowel) == -1){
                                    System.out.println("That letter has already been guessed.");
                                    isVowel = false;
                                }
                            } while (!isVowel);


                            vowelBank.remove(vowelBank.indexOf(userVowel));


                            p.addTempCash(-250, 1);;

                            int letterCount = 0;//how many times letter appears in answer
                            for (int i = 0; i < currentAnswer.length(); i++) {
                                if (userVowel == currentAnswer.charAt(i)) {//"i" is the indexOf that character.
                                    currentOutput.setCharAt(i, userVowel); //replaces the * with the character the user input
                                    letterCount++;
                                }//end of if(userCons)
                            }//end of for loop

                            if (letterCount == 0) {
                                System.out.println("There aren't any " + userVowel + "s in the answer");
                                break;
                            } else {
                                System.out.println("There are " + letterCount + " " + userVowel + "s in the answer");
                                System.out.println(currentOutput);
                                playerContinue = true;
                            }//end of else statement


                        }//end of else if(userResponse)


                    }//end of while loop

                    }//end of for(Player p : players)

                } while (!puzzleSolved) ; //keep iterating through puzzle while puzzle is not solved.
                    System.out.println("Congratulations, moving on to the next puzzle");

            } while (Michael.getWins() < 3 && Evan.getWins() < 3 && Prentice.getWins() < 3); //end of 1st do-while loop



    }//end of void main


}//end of class WheelOfFortune1



//        wheel.setWheelConfig("wheelConfig.txt");
//        wheel.setPuzzles("puzzle.txt");
//
//        wheel.setCurrentPuzzle();
//
//        System.out.println(wheel.getPuzzleHint());
//        System.out.println(wheel.getPuzzleAnswer());
//
//        System.out.println(wheel.spinWheel());
