import java.util.Stack;

public class Earthquake {

    int[] arrPushMagnitude;
    private static final int CONTROL_SIGNAL = 97;
    private static final int CONTROL_NUMBER_OF_PUSHES = 5;
    private static final int CONTROL_PUSH_MAGNITUDE = 3;
    private int controlAtTheEndOfDay;
    private int numberOfPushes;


    public int getControlAtTheEndOfDay() {
        return controlAtTheEndOfDay;
    }

    public void setControlAtTheEndOfDay(int controlAtTheEndOfDay) {
        this.controlAtTheEndOfDay = controlAtTheEndOfDay;
    }

    public int getNumberOfPushes() {
        return numberOfPushes;
    }

    public void setNumberOfPushes(int numberOfPushes) {
        this.numberOfPushes = numberOfPushes;
    }

    public int[] getArrPushMagnitude() {
        return arrPushMagnitude;
    }

    public void setArrPushMagnitude(int[] arrPushMagnitude) {
        this.arrPushMagnitude = arrPushMagnitude;
    }

    Stack<Integer> stack = new Stack<>();


    public void checkingForAnEarthquake(int controlAtTheEndOfDay, int[] arrPushMagnitude) {

        if (controlAtTheEndOfDay >= CONTROL_SIGNAL) {
            int counter = 0;
            for (int i = 0; i < arrPushMagnitude.length; i++) {
                if (arrPushMagnitude[i] >= CONTROL_PUSH_MAGNITUDE) {
                    int element = arrPushMagnitude[i];
                    stack.push(element);
                    counter++;
                }
            }
            if (counter >= CONTROL_NUMBER_OF_PUSHES) {
                System.out.println("Всего зафиксировано " + counter + " толчков следующей амплитуды:");
                for (int j = 0; j < counter; j++) {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}










