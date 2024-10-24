package HW2;

import java.util.Scanner;
public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5


    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / elseif / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(68) would return a D






    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    
 


    // You can either create a tester class or put your code here
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the perpendicular: ");
        int perpendicular = input.nextInt();

        System.out.print("This is the Hypotenuse: ");

        System.out.println(Math.sqrt(Math.pow(base,2) + Math.pow(perpendicular,2)));
        
        System.out.println("Enter your grade:");
        double grade = input.nextDouble();
            grade = Math.ceil(grade);
        
        System.out.println("This is your Letter Grade:");
        if (grade >= 90.00){
            System.out.println("A");
        } else if(grade >= 80.00){
            System.out.println("B");
        } else if (grade >= 70.00) {
            System.out.println("C");
        } else if (grade >= 60.00){
            System.out.println("D");
        } else{
        System.out.println("F");
        }
        {
        System.out.println("Enter the Total Bill:");
                double totalBill = input.nextDouble();
                
            System.out.println("Enter the amount of people splitting the bill:");
                int billPerPerson = input.nextInt();
                billPerPerson = (int) (totalBill / billPerPerson);

            System.out.println("Percentage to tip:");
                double percentTip = input.nextDouble();
                    percentTip = Math.ceil((billPerPerson)*(percentTip/100));
                
            System.out.println(percentTip);
        

        input.close();
    }

}
}