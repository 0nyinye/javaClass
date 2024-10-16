import java.util.Scanner;
public class Number1 {
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter first number");
 int  firstNumber = input.nextInt(); 

System.out.print("Enter second number");
int secondNumber = input.nextInt();

System.out.print("Enter third number");
int thirdNumber = input.nextInt();

System.out.print("Enter fourth number");
int fourthNumber = input.nextInt();

int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;

System.out.println("Sum is: " + sum);
System.out.printf("Sum is %d%n ", sum);
System.out.print("Sum is: " + sum );

  

}
}
