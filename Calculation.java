import java.util.Scanner;
public class Calculation {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number:" );
double num1 = input.nextDouble();

System.out.print("Enter a second number:" );
double num2 = input.nextDouble();

System.out.print("Enter a third number:" );
double num3 = input.nextDouble();

double addition = num1 + num2 + num3;
double subtraction = num1 - num2 - num3;
double multiplication = num1 * num2 * num3;

System.out.println("Sum of addition is:" + addition);
System.out.println("Subtraction is:" + subtraction);
System.out.println("Multiplication is:" + multiplication);

System.out.println();

}
}

