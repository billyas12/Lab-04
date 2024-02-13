//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 55;
        int result = multipleOf7(n1, n2);

        System.out.println("The numbers between " +  n1 + " and " +  n2 + " that are multiples of 7 using recursion are " + result);
    }
    public static int multipleOf7(int n1, int n2){
        if(n1> n2){
            return 0;
        }
        if (n1 % 7 == 0){
            return n1 + multipleOf7(n1 + 7, n2);
        }
        else{
            return multipleOf7(n1 + 1, n2);
        }
    }
}