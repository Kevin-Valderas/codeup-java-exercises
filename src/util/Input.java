package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public String getString(){
        System.out.println("Please enter a string:");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Do you agree?");
        String answer = scanner.next();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        String prompt = "Enter an integer between " + min + " and " + max;
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        while (userInput <= min || userInput >= max) {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a number:");
        return scanner.nextDouble();
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
