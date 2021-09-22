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
        int input;
        String s = getString();
        try {
            input = Integer.parseInt(s);
            return input;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Not a number");
            return getInt(min, max);
        }
    }


    public double getDouble(){
        System.out.println("Enter a number:");
//        return scanner.nextDouble();
        return Double.parseDouble(getString());
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
