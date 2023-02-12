import java.util.Scanner;
import java.util.Stack;

public class MainCryptographer {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int counter = 0;
        int numberOfRepetitionsOf5Letters = string.length() / 5;
        int letterCellNumber = 0;
        for (int i = 1; i <= numberOfRepetitionsOf5Letters; i++) {
            for (int j = letterCellNumber; j < 5 + letterCellNumber; j++) {
                char symbol = string.charAt(j);
                stack.push(symbol);
                counter++;
            }
            if (counter == 5) {
                letterCellNumber = letterCellNumber + 5;
                counter = 0;
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(stack.pop());
            }
        }
        int counter1 = 0;
        for (int i = 5 * numberOfRepetitionsOf5Letters; i < string.length(); i++) {
            char symbol1 = string.charAt(i);
            stack.push(symbol1);
            counter1++;
        }
        for (int j = 0; j < counter1; j++) {
            System.out.print(stack.pop());
        }
    }

}


