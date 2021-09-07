import java.sql.SQLOutput;

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
        for (int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }else
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
