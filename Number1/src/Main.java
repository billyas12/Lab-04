//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printMessage(5);

    }
    public static void printMessage(int n) {
        while (n > 0) {
            System.out.println("Hello World");
            n = n - 1;
        }
    }
}