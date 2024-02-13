//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //calls printMessage function
        printMessage(5);

    }
    public static void printMessage(int n) {
        while (n > 0) {//while loop to ensure number (n) is greater than 0
            System.out.println("Hello World");//outputs message
            n = n - 1;//updates n by subtracting 1 before looping again
        }
    }
}