import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInt + "\" <--");
        System.out.print("Enter 3 words: ");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        System.out.printf("You entered:%n %s%n %s%n %s%n", string1, string2, string3);
        System.out.print("Enter a sentence: ");
        Scanner scs = new Scanner(System.in);
        String sentence = scs.nextLine();
        System.out.println(sentence);
        System.out.print("Enter the length of the Codeup Classroom: ");
        Scanner numScan = new Scanner(System.in);
        int length = Integer.parseInt(numScan.nextLine());
        System.out.print("Enter the width of the Codeup Classroom: ");
        int width = Integer.parseInt(numScan.nextLine());
        String mathDisplay1 = "The area of the Codeup Classroom is: ";
        String mathDisplay2 = " square feet; The perimeter of the Codeup Classroom is: ";
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println(mathDisplay1 + area + mathDisplay2 + perimeter);
        System.out.println();
    }
}
