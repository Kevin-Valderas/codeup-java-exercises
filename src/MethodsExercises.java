import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner keepGoing = new Scanner(System.in);
        boolean solve;
        do{
            System.out.print("Enter the first integer: ");
            Scanner numScan = new Scanner(System.in);
            int x = numScan.nextInt();
            System.out.print("Enter the second integer: ");
            int y = numScan.nextInt();
            Scanner choice = new Scanner(System.in);
            System.out.println("Choose from the following: addition, subtraction, multiplication, division, modulus\n ");
            String chosenMethod = choice.nextLine();
            int sum = x + y;
            int difference = x - y;
            int product = x * y;
            int quotient = x / y;
            int remainder = x % y;
            Integer solution = null;
            if (chosenMethod.equalsIgnoreCase("addition")){
                solution = sum;
            } else if (chosenMethod.equalsIgnoreCase("subtraction")){
                solution = difference;
            } else if (chosenMethod.equalsIgnoreCase("multiplication")){
                solution = product;
            } else if (chosenMethod.equalsIgnoreCase("division")){
                solution = quotient;
            }else if (chosenMethod.equalsIgnoreCase("modulus")){
                solution = remainder;
            }
            System.out.println("Using " + chosenMethod + ", your answer is: " + solution);
            System.out.println("\nContinue? ");
            String userResponse = keepGoing.next();
            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                solve = true;
            } else {
                solve = false;
                System.out.print("\nEnd of line");
            }
        }while(solve);
    }
}