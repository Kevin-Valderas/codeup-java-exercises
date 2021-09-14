import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString();
        System.out.println(userInput);
        boolean yesNoResult = input.yesNo();
        System.out.println(yesNoResult ? "User said yes" : "User said  no");
        int userInput2 = input.getInt(20, 45);
        System.out.println(userInput2);
        double userInput3 = input.getDouble();
        System.out.println(userInput3);
    }
}
