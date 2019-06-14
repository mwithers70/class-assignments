import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Wheel {

   private ArrayList<String> puzzles;
   private ArrayList<Integer> wheelConfig;
   private String[] currentPuzzle; //stores the results of the .split

   public Wheel () {
       puzzles = new ArrayList<>();
       wheelConfig = new ArrayList<>();
   }//end of public Wheel

    public void setPuzzles(String fileName){
       puzzles.clear();
       ArrayList<String> arrList = new ArrayList<>();
       Path path = Paths.get(fileName);
       try(Stream<String> lines = Files.lines(path)) {
           Object[] arr = lines.toArray();
           for (Object t : arr) {
               arrList.add(t.toString());
           }
       }catch(Exception e){
           System.out.println("Didn't work");
       }
       puzzles = arrList;

       }//end of setPuzzles

    public int getPuzzleNum(){ return puzzles.size() -1; }

    public void setWheelConfig(String fileName){
       wheelConfig.clear();
       ArrayList<String> arrList = new ArrayList<>();
       Path path = Paths.get(fileName);
       try(Stream<String> lines = Files.lines(path)){
           Object[] arr = lines.toArray();
           for(Object t : arr){
               arrList.add(t.toString());
           }
       }catch(Exception e){
           System.out.println("WC didn't work");
       }
       for(String s : arrList){
           wheelConfig.add(Integer.parseInt(s));
       }
    }//end of void setWheelConfig

    public int spinWheel(){
       Random rand = new Random();
       int windex = rand.nextInt(wheelConfig.size()-1) +1; //shrink the array then moves it over. (1-10 becomes 1-9, then move array over so now 2-10)
       return wheelConfig.get(windex);
    }//end of int spinWheel

    public boolean setCurrentPuzzle(){
       if(puzzles.isEmpty()){
           return false;
       }
       Random rand = new Random();
       int newPIndex;
       newPIndex = rand.nextInt(puzzles.size()-1) +1;
       currentPuzzle = puzzles.get(newPIndex).split(":");
       puzzles.remove(newPIndex);
       return true;
    }//end of boolean setCurrentPuzzle

    public String getPuzzleHint() { return currentPuzzle[0];}
    public String getPuzzleAnswer(){ return currentPuzzle[1];}

    public StringBuilder createOutput(String currentAnswer){
       StringBuilder output = new StringBuilder();
       for(int i=0; i<currentAnswer.length(); i++){
           if(currentAnswer.charAt(i) == ' '){
               output.append("  ");
           }else {
               output.append("*");
           }
       }
       return output;
    }//end of StringBuilder

//    public boolean solveAttempt(){
//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Solution: ");
//        String userSolution = scanner.nextLine();
//        return userSolution.toUpperCase().equals(getPuzzleAnswer());
//    }




}//end of class Wheel
