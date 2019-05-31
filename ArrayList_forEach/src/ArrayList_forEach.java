import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class ArrayList_forEach {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String favoriteAnimal;
//        System.out.println("Enter your favorite animal");
//        favoriteAnimal = scanner.next();
//
//        ArrayList<String> animals = new ArrayList<>(); //Create an ArrayList object
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("bird");
//        animals.add("tiger");
////        System.out.println(animals);
//
//        for(String i : animals) { //takes value of animals for each index and place into String i
//            if (i.equals(favoriteAnimal)) //if the value of 'i' equals user input(favoriteAnimal)
//            System.out.println("I love " + i + "s");
//            else System.out.println(i + " No I dont care about those");
//        }

//        if(animals.contains(favoriteAnimal)) System.out.println("I love " +favoriteAnimal);
//        else System.out.println("No I don't care about those");


//        System.out.print("What is your favorite animal: d=dog, c=cat, b=bird, t=tiger");
//        favoriteAnimal = scanner.next();

//        System.out.println(animals);
//        animals.forEach((n) -> print(n));
//     animals.forEach();
//     public static void print(String n){
//         System.out.println("I like " +n);
//     }

//        System.out.println("My favorite animals is: " + animals.indexOf(0));
//        favoriteAnimal = myFavoriteAnimal.next();
//
//        if (favoriteAnimal == "dog") {
//            System.out.println("I love " + animals.get(0));
//        } else {
//            System.out.println("No, I don't care for those.");
//            }

//        }
        Numbers();
        carDealer();
    }
        public static void Numbers () {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, String> profile = new HashMap<>();
            profile.put("name", "");
            profile.put("age", "");
            profile.put("hometown", "");
            profile.put("favorite food", "");

            System.out.print("What is your name? ");
            String nameValue = scanner.nextLine();
            profile.replace("name", "", nameValue);
            System.out.println("This is " + nameValue);

            System.out.print("What is your age? ");
            String ageValue = scanner.nextLine();
            profile.replace("age", "", ageValue);
            System.out.println("They are " + ageValue + " years-old");

            System.out.print("Where is your hometown? ");
            String hometownValue = scanner.nextLine();
            profile.replace("hometown", "", hometownValue);
            System.out.println("from " + hometownValue);

            System.out.print("What is your favorite food? ");
            String favoritefoodValue = scanner.nextLine();
            profile.replace("favorite food", "", favoritefoodValue);
            System.out.println("and their favorite food is " + favoritefoodValue);


            Scanner num = new Scanner(System.in);
            num.useDelimiter(" "); //allows you to input a space after the number && use commas.
            ArrayList<Integer> numbers = new ArrayList<>();
            System.out.println("Please select five numbers: ");

            while (num.hasNextInt()) {
                numbers.add(num.nextInt());
            }
            System.out.println(numbers);


            int sum = 0;
            for (Integer i : numbers) {
                sum += i;
                System.out.println("Sum of these numbers are " + sum);
            }

            int product = 1;
            for (Integer i : numbers) {
                product *= i;
                System.out.println("Product of these numbers are " + product);
            }

            Collections.sort(numbers);

            System.out.println("The largest number is: " + numbers.get(4));
            System.out.println("The smallest number is: " + numbers.get(0));
        }

        public static void carDealer () {
            Scanner car = new Scanner(System.in);
            HashMap<String, String> vehicle = new HashMap<>();
            vehicle.put("Charger", "Dodge");
            vehicle.put("M6", "BMW");
            vehicle.put("Chiron", "Bugatti");
            vehicle.put("Benz", "Mercedes");
            System.out.println("What model car are you looking for today? ");

            String response = car.nextLine();
            if (vehicle.get(response) != null) {
                System.out.println("Looking for a " + vehicle.get(response) + "Our " + response + "selection is over here.");
            } else {
                System.out.println("Sorry, we don't have any " +response+"s in stock.");


        }

    }

}