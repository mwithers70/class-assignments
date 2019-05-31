public class Troll {
    public Troll() {
    }

    public static String disemvowel(String string) {
//        String string = "This website is for losers LOL!";
        System.out.println("Input String : " + string);
        string = string.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(string);
        return string;
    }//end of void main

    public static void main(String[] args) {
    }//end of void main

}//end of class troll