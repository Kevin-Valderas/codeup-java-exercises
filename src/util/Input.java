package util;

public class Input {
    private Scanner scanner;
    public String getString(){
        System.out.println("Please enter a string:");
        String userInput = scanner.nextLine();
        return userInput;
    }
}
