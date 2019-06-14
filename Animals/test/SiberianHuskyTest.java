<<<<<<< HEAD
import Species.SiberianHusky;
import org.junit.jupiter.api.*;

import java.io.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SiberianHuskyTest {
    PipedInputStream is = new PipedInputStream();
    PipedOutputStream os = new PipedOutputStream(is);
    PrintStream ps = System.out;
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    public SiberianHuskyTest() throws IOException {
    }

    @BeforeAll
    public  void prepare() {
        System.setOut(new PrintStream(os));
    }

    @Test
     public void animalInfo() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.animalInfo();
        assertPrinted("I am " + "Gotti" + " a Siberian Husky" + "." + "\n" + "I belong to the " +"Chordata"+ " phylum." + "\n" + "And part of the " +"Animalia"+ " kingdom.");
    }

    private void assertPrinted(String expected) {
        try {
            for (int i = 0; i< expected.split("\n").length;i++)
                Assertions.assertEquals(expected.split("\n")[i], br.readLine());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eat() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.eat();
        assertPrinted("Gotti" + " loves to eat raw chicken, beef, fish, fruits and lamb.");
    }

    @Test
     public void lifeSpan() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.lifeSpan();
        assertPrinted("Gotti" + "'s" + " lifespan is about 15 years.");

    }

    @Test
    public void speed() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.speed();
        assertPrinted("Gotti" + " moves at a top speed of 31mph!");

    }

    @AfterAll
    public void restoreOut() {
        System.setOut(ps);
    }
=======
import Species.SiberianHusky;
import org.junit.jupiter.api.*;

import java.io.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SiberianHuskyTest {
    PipedInputStream is = new PipedInputStream();
    PipedOutputStream os = new PipedOutputStream(is);
    PrintStream ps = System.out;
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    public SiberianHuskyTest() throws IOException {
    }

    @BeforeAll
    public  void prepare() {
        System.setOut(new PrintStream(os));
    }

    @Test
     public void animalInfo() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.animalInfo();
        assertPrinted("I am " + "Gotti" + " a Siberian Husky" + "." + "\n" + "I belong to the " +"Chordata"+ " phylum." + "\n" + "And part of the " +"Animalia"+ " kingdom.");
    }

    private void assertPrinted(String expected) {
        try {
            for (int i = 0; i< expected.split("\n").length;i++)
                Assertions.assertEquals(expected.split("\n")[i], br.readLine());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eat() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.eat();
        assertPrinted("Gotti" + " loves to eat raw chicken, beef, fish, fruits and lamb.");
    }

    @Test
     public void lifeSpan() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.lifeSpan();
        assertPrinted("Gotti" + "'s" + " lifespan is about 15 years.");

    }

    @Test
    public void speed() {
        SiberianHusky siberianHusky = new SiberianHusky("Gotti");
        siberianHusky.speed();
        assertPrinted("Gotti" + " moves at a top speed of 31mph!");

    }

    @AfterAll
    public void restoreOut() {
        System.setOut(ps);
    }
>>>>>>> 3be5a74ce561a2fa320384ebd8c2672401d9648b
}