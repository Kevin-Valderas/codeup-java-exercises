import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Function;

public class ControlFlowExercises {
    public static void main(String[] args) {
        /*1.a*/
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i);
//            System.out.print("%n");
//            i++;
//        }

        /*1.b.1*/

//        int i = 2;
//    do {
//        System.out.print(i + "\n");
//        i = i + 2;
//    } while(i <= 100);
//
        /*1.b.2 */
//        int i = 100;
//        do {
//            System.out.print(i + "\n");
//            i = i - 5;
//        }while(i >= -10);
//
        /*1.b.3*/
//        double i = 2;
//        do {
//            System.out.print(i + "\n");
//            i = Math.pow(i, 2);
//        }while(i <= 100000);
//
        /*2.0.0*/
//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }else
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }else
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

        /*3.0.0*/
//        Scanner integer = new Scanner(System.in);
//        Scanner response = new Scanner(System.in);
//        boolean confirm;
//        do{
//        System.out.print("What number would you like to go up to? " );
//        int userInput = integer.nextInt();
//        String tableStart = """
//                Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                """;
//        System.out.println(tableStart);
//        for (int i = 1; i <= userInput; i++) {
//            int square = (int) Math.pow(i, 2);
//            int cube = (int) Math.pow(i, 3);
//            System.out.print(i + "      | " + square + "       | " + cube + "\n");
//            }
//        System.out.println("Do you want to go again? ");
//        String userResponse = response.next();
//        if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
//            confirm = true;
//        } else {
//            confirm = false;
//        }
//        }while(confirm);
        /*4.0.0*/
        Scanner integer = new Scanner(System.in);
        Scanner response = new Scanner(System.in);
        boolean confirm;
        do{
            System.out.print("Enter a grade from 0 - 100. \n" );
            int userInput = integer.nextInt();
            if (userInput <= 59){
                System.out.print("F");
            }else if (60 <= userInput && userInput <= 66){
                System.out.print("D");
            }else if (67 <= userInput && userInput <= 79){
                System.out.print("C");
            }else if (80 <= userInput && userInput <= 87){
                System.out.print("B");
            }else if (88 <= userInput && userInput <= 100){
                System.out.print("A");
            }else{
                break;
            }
            System.out.println("\nContinue? ");
            String userResponse = response.next();
            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
            confirm = true;
             } else {
            confirm = false;
             }
            }while(confirm);
    }
}
