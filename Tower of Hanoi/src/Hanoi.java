<<<<<<< HEAD
import java.util.Stack;

public class Hanoi {

    public static void main(String[] args){
        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        tower1.push(3);
        tower1.push(2);
        tower1.push(1);
    }//end of void main


    public static void move(int numRings, int startPole, int endPole){
        if (numRings ==0){
            return;
        }
        int intermediatePole = 6 - startPole - endPole;
        move(numRings-1, startPole, intermediatePole);
        System.out.println("Move " +numRings + " from " + startPole + " to " +endPole);
        move(numRings-1, intermediatePole, endPole);
    }//end of void move


    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        if(n==1){
            System.out.println("Move disk 1 from rod " +from_rod + " to rod " +to_rod);
                return;
        }//end of if statement
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " +n+ " from_rod " +from_rod+ " to_rod " +to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }//end of void towerOfHanoi

    /*
    Step 1: Move (n-1) discs from pole 1 to pole 2
    Step 2: Move the nth disc (last disc) from pole 1 to pole 3
    Step 3: Now move the n-1 discs which is present in pole 2 to pole 3.
    Step 1 and Step 3 will be recursive.
     */

    public static void solve(int numRings, String start, String auxiliary, String end)


}//end of class Hanoi
=======
import java.util.Stack;

public class Hanoi {

    public static void main(String[] args){
        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        tower1.push(3);
        tower1.push(2);
        tower1.push(1);
    }//end of void main


    public static void move(int numRings, int startPole, int endPole){
        if (numRings ==0){
            return;
        }
        int intermediatePole = 6 - startPole - endPole;
        move(numRings-1, startPole, intermediatePole);
        System.out.println("Move " +numRings + " from " + startPole + " to " +endPole);
        move(numRings-1, intermediatePole, endPole);
    }//end of void move


    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        if(n==1){
            System.out.println("Move disk 1 from rod " +from_rod + " to rod " +to_rod);
                return;
        }//end of if statement
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " +n+ " from_rod " +from_rod+ " to_rod " +to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }//end of void towerOfHanoi

    /*
    Step 1: Move (n-1) discs from pole 1 to pole 2
    Step 2: Move the nth disc (last disc) from pole 1 to pole 3
    Step 3: Now move the n-1 discs which is present in pole 2 to pole 3.
    Step 1 and Step 3 will be recursive.
     */

    public static void solve(int numRings, String start, String auxiliary, String end)


}//end of class Hanoi
>>>>>>> 3be5a74ce561a2fa320384ebd8c2672401d9648b
