import java.util.Scanner;
public class HelloWorld {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.print("Please enter your first number: ");
        int num1 = scan.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = scan.nextInt();

        double avg = (num1 + num2) / 2.0;

        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg + "!");
    }

}
