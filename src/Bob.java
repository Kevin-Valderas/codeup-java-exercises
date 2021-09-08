import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner talkBob = new Scanner(System.in);
        Scanner keepGoing = new Scanner(System.in);
        boolean confirm;
        do{
            System.out.print("What do you want? \n");
            String converse = talkBob.nextLine();
            if (converse.endsWith("?")){
                System.out.print("Sure.\n");
            }else if (converse.endsWith("!")){
                System.out.print("Whoa, chill out!\n");
            }else if (converse.isBlank()){
                System.out.print("Fine. Be that way! \n");
            }else{
                System.out.print("Whatever...\n");
            }
            System.out.println("\nAnything else? ");
            String userResponse = keepGoing.next();
            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                confirm = true;
            } else {
                confirm = false;
                System.out.print("Then leave me alone already!");
            }
        }while(confirm);
    }
}
