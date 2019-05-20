public class Lab{
    public static void main(String[] args) {
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt = 7;
        float aNumber = 4.4f;
        boolean isCold = false;
//        double someNumbers = "";

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
        System.out.println(aNumber);
        System.out.println(isCold);

        int newValue1 = firstInt+secondInt;
        System.out.println(newValue1);

        int newValue2 = firstInt+thirdInt;
        System.out.println(newValue2);
//        fix by assigning thirdInt a value of 7.
        System.out.println(secondInt/firstInt);
        System.out.println(secondInt%firstInt);

        int fourthInt = firstInt + secondInt%firstInt;
        System.out.println(++fourthInt);

        int x = 100;
        System.out.println(x == 100);

        int y = 106;
        System.out.println(x>y);
        System.out.println(y>x);

        int z = 92;
        System.out.println((x<y) && (y<z));
        System.out.println((y<z) && (x>=y));
        System.out.println((z>(y+x)) || (x-y)<z);
        System.out.println((x<y) == !(x>y));

        int n = 64;
        System.out.println((n>>1) == (n/2));
        System.out.println((n<<1) == (n*2));

        n = 40;
        System.out.println((n>>1) == (n/2));
        System.out.println((n<<1) == (n*2));
        System.out.println((n>>2) == (n/4));
        System.out.println((n<<2) == (n*4));

        n = 17;
        System.out.println((n>>2)==(n/4) && (n<<2) == (n*4));
        anotherMethod(); //to call methods outside of main.
        playWithStrings();
    }
    public static void anotherMethod(){
        int x = 1000;
        Integer newValue = Integer.valueOf("1000");
        System.out.println("No it is inside the main scope");
        int z = Integer.compare(x, newValue);

        if(z >= 0){
            int y = (x/2);

            System.out.println(y + " is half a big variable");
            System.out.println(x + " Big Value");
        } else {
            System.out.println("The half value is definitely small");
            System.out.println(x + " Not a big value");
            //Create a global scope of y.
        }


    }

    public static void playWithStrings() {
        String firstName = "Michael";
        String lastName = new String("Withers");

        System.out.println("Hello " .concat(firstName).concat(" ").concat(lastName));
        System.out.println("Hello " + firstName + " " + lastName);

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);


        System.out.println(String.format("Total length of the string %s is %d", fullName, fullName.length()));
        //(fullName.indexOf("o")); //do not have an 'o' in my name.
        System.out.println(String.format("The String %s does not have an 'o' ", fullName));
        System.out.println(String.format("The letter %s is at position 7", fullName.charAt(7)));
        //name starts at zero, so space present at position 7.
        System.out.println(String.format("Does %s contain the word son: %b", fullName, fullName.contains("son")));
        System.out.println(String.format("What are the last 5 letters in %s : %s", fullName, fullName.substring(fullName.length()-5)));
        System.out.println(String.format("Does %s contain an apostrophe or dash: %b", fullName, (fullName.contains("'") || fullName.contains("-"))));
    }

}





