import java.util.Scanner;

public class DrivingCost {
public static void main(String[] args ) {

Scanner input = new Scanner(System.in);

System.out.print("Enter driving distance:");
double distance = input.nextDouble();

System.out.print("Enter fuel efficiency (in miles per gallon ):");
double miles per gallon = input.nextDouble();

System.out.print("Enter price per gallon:");
double price per gallon = input.nextDouble();

double driving cost = (distance/miles per gallon) * price per gallon;

System.out.println("Cost of driving is $:" +driving cost);


}
} 






