import java.util.Scanner;

public class conditionaloperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using the conditional operator
        System.out.println("The number " + number + " is " + ((number % 2 == 0) ? "Even" : "Odd") + ".");
        
        
    }
    
}
