<<<<<<< HEAD
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        char again;
     do {
         System.out.println("Enter a number: ");

         int x = s.nextInt();

         if (isPrime(x)) {
             System.out.println(x + " is a prime number");
         } else {
             System.out.println(x + " is not a prime number");
         }

         System.out.println("Want to do another number? ");
         again = s.next().toLowerCase().charAt(0);
     }while(again == 'y');
    }//end of void main

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
            return true;
    }
}//end of class Prime
=======
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        char again;
     do {
         System.out.println("Enter a number: ");

         int x = s.nextInt();

         if (isPrime(x)) {
             System.out.println(x + " is a prime number");
         } else {
             System.out.println(x + " is not a prime number");
         }

         System.out.println("Want to do another number? ");
         again = s.next().toLowerCase().charAt(0);
     }while(again == 'y');
    }//end of void main

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
            return true;
    }
}//end of class Prime
>>>>>>> 3be5a74ce561a2fa320384ebd8c2672401d9648b
