import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {

        //Scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        String employment;
        String vehicle;

        do {
            //prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            //prompt and read an int example = age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            //prompt employment status
            System.out.print("Enter your employment status: e=employed, u=unemployed, s=student");
            employment = scanner.next();

            //prompt vehicle status
            System.out.println("Enter your vehicle status: C=car, T=truck, S=suv, N=do not own a vehicle");
            vehicle = scanner.next();

            System.out.println(String.format("Hello %s, your age is %d", username, age));


            //Lab Step #1 (if statements)
            if (age >= 16) {
                System.out.println("You are old enough to drive");
            } else {
                System.out.println("You are not old enough to drive");
            }
            if (age >= 18) {
                System.out.println("You are old enough to vote");
            } else {
                System.out.println("You are not old enough to vote");
            }
            if (age >= 21) {
                System.out.println("You are old enough to drink");
            } else {
                System.out.println("You are not old enough to drink");
            }
            if (age >= 35) {
                System.out.println("You are old enough to be President");
            } else {
                System.out.println("You are not old enough to be President");
            }
            if (age >= 55) {
                System.out.println("You can join AARP");
            } else {
                System.out.println("You cannot join AARP");
            }
            if (age >= 67) {
                System.out.println("You can start to draw Social Security");
            } else {
                System.out.println("You cannot start to draw Social Security");
            }
                System.out.print("Would you like to repeat the process answer Y(Yes),N(No)");
            
        } while (scanner.next().toLowerCase().charAt(0) == 'y');
        

        //Lab Step #2 (switch statements)
        switch (employment.toLowerCase()) {
            case "e":
                System.out.println("You are employed");
                break;

            case "u":
                System.out.println("You are unemployed");
                break;

            case "s":
                System.out.println("You are a student");
                break;

            default:
                System.out.println("I don't know what I'm doing with my life!!");
                break;
        }

        switch (vehicle.toUpperCase()) {
            case "C":
                System.out.println("I own a car.");
                break;

            case "T":
                System.out.println("I own a truck.");
                break;

            case "S":
                System.out.println("I own an SUV.");
                break;

            case "N":
                System.out.println("I don't drive!");
                break;

            default:
                System.out.println("I walk!!!");
                break;
        }

        //Lab Step #3 (for loops)
        int[] myArray = new int[30];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        //enhanced for loop (forEach)
        for (int x : myArray) {
            System.out.println(x);
        }
        //reassign elements with even numbers
        int z = 2;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = z;
            z += 2;
        }
        //enhanced for loop
        for (int y : myArray) {
            System.out.println(y);
        }
        //reverse order
        for (int y = myArray.length - 1; y >= 0; y--) {
            System.out.println(myArray[y]);
        }

        //Lab Step #4 (while loops)
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }
        i = myArray.length - 1;
        while (i >= 0) {
            System.out.println(myArray[i]);
            i--;
        }
        System.out.println("Total sum of even numbers " + arrayMethod(40));
    }

        public static int arrayMethod(int num){
            int[] newArray = new int[30];
            int evenSum = 0;

            for (int i = 0; i < newArray.length; i++){
                newArray[i] = i;
            }
            for (int i = 0; i < newArray.length; i++){
                if (i == num){
                    break;
                }
                else if (i%2 == 0){
                    evenSum += i;
                }
                else System.out.println(newArray[i]);
            }
            return evenSum;

            }

        }


