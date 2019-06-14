import java.util.ArrayList;

public class Utils {

    public static ArrayList<Character> createConsBank(){
        ArrayList<Character> consBank = new ArrayList<>();
        for(int i = 65; i<91; i++){
            char newChar = (char) i;
            if(!"AEIOU".contains(String.valueOf(newChar))) {
                consBank.add(newChar);
            }
        }
        return consBank;

    }//end of public ArrayList<Character>
}//end of class Utils
