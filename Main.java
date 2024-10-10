package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)
        Pyramid pyr = new Pyramid();
        pyr.output();
        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)
        String name = "John";
        int age = 20;
        String favoriteColor = "Blue";
        Adlibs adl = new Adlibs();
        System.out.println(adl.output(name, favoriteColor, age));

        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
        String poopy = "I MAKE BREAD";
        int number = 2;
        char letter = 'T'; 
        Replace rpl = new Replace();
        System.out.println(rpl.charReplace(poopy, number, letter));
    }
}