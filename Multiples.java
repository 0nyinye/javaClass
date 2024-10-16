import java.util.Scanner;
public class Multiples {
public static void main(String[] args ) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer:");
int number1 = input.nextInt();

System.out.print("Enter a second integer:");
int number2 = input.nextInt();

int number1tripled = number1 * 3;
int number2doubled = number2 * 2;

if(number1tripled % number2doubled == 0) {
System.out.println("number1tripled is a multiple of number2doubled");

} else{

System.out.println("number1tripled is not a multiple of number2doubled");

}
}
} 