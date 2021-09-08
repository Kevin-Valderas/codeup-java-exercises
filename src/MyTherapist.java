import java.util.Scanner;
public class MyTherapist {
    public static void main(String[] args) {
        Scanner query = new Scanner(System.in);
        Scanner response = new Scanner(System.in);
        boolean confirm;
        do{
            System.out.print("What brings you in today? \n" );
            String patient = query.next();
            if (patient.contains("stress") || patient.contains("nerv")){
                System.out.print("Feelings of stress often arise when we take on too much at once, or when we put a bit too much emphasis on things that might not be worthwhile. How about you walk me through a typical day in your life?\n");
            }else if (patient.contains("anger") || patient.contains("angry") || patient.contains("mad")){
                System.out.print("Dealing with anger can be challenging, but I'm positive we can find a method that will help you through this.\n");
            }else if (patient.contains("happy") || patient.contains("good")){
                System.out.print("Always a reason to celebrate when we have a nice week, am I right? If I may ask, what made this week better than usual?\n");
            }else{
                break;
            }
            System.out.println("\nAnything else? ");
            String userResponse = response.next();
            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                confirm = true;
            } else {
                confirm = false;
            }
        }while(confirm);
    }
}
