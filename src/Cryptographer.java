import java.util.Scanner;
import java.util.Stack;

public class Cryptographer {

    private int numberOfRepetitionsOf5Letters;
    private int letterCellNumber;

    public int getNumberOfRepetitionsOf5Letters() {
        return numberOfRepetitionsOf5Letters;
    }

    public void setNumberOfRepetitionsOf5Letters(int numberOfRepetitionsOf5Letters) {
        this.numberOfRepetitionsOf5Letters = numberOfRepetitionsOf5Letters;
    }

    public int getLetterCellNumber() {
        return letterCellNumber;
    }

    public void setLetterCellNumber(int letterCellNumber) {
        this.letterCellNumber = letterCellNumber;
    }

    Stack<Character> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();

    public void isCryptographer() {
        int counter = 0;
        numberOfRepetitionsOf5Letters = string.length() / 5;
        letterCellNumber = 0;
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
