public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        System.out.println("Do I like food? " + Main.isAlike("food"));
        System.out.println("Do I like fishing? " + Main.isAlike("faking"));
        Main.printAboutMe();

    }


    public static void printAboutMe(){
        System.out.println("I like food, gym and playing video games with friends");
    }
    
    public static boolean isAlike(String topic) {
        String myLike = "I like food, gym and playing video games with friends";

        return myLike.contains(topic);
    }
}