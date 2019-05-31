import java.awt.*;

public class TurtleTurtle {
    public static void main(String[] args) {
        World world = new World();
        Turtle bob = new Turtle(world);
        Turtle bill = new Turtle(world);

//variables in java
        int i = 0;
        double d = 0.0;
        float f = 0.0f;
        String s = "new string";
        char c = 'c';
        boolean b = true;
        long l = 90001;

        bob.forward();
        bob.turnLeft();
        bob.forward();
        bob.turnLeft();
        bob.forward();
        bob.turnLeft();
        bob.forward();
        //bill
        bill.setBodyColor(Color.blue);
        bill.setPenColor(Color.MAGENTA);
        bill.penUp();
        bill.turnRight();
//        bill.forward();
        bill.penDown();
        //0 is up
        bill.setHeading(0);
        bill.forward();
        bill.turn(45);
        bill.forward();
        bill.turn(45);
        bill.forward();
        bill.turn(45);
        bill.forward();
        bill.turn(45);
        bill.forward();
        bill.turn(90);
        bill.forward();
        bill.forward();
        bill.forward(45);




    }
}
