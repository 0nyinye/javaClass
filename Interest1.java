import java.util.Scanner;
public class Interest1 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the balance");
double balance = input.nextDouble();

System.out.print("Enter annual interest rate (in percentage):");
double annualInterestRate = input.nextDouble();

double interest = balance * (annualInterestRate/1200);

System.out.println("Interest for the next month is:" +interest);



}
}
 