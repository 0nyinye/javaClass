import java.util.Scanner;
public class Acceleration1 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter starting velocity(v0) in meters/second:" );
double v0 = input.nextDouble;

System.out.print("Enter ending velocity (v1) in meters/second:" );
double v1 = input.nextDouble; 

System.out.print("Enter time span (t) in seconds:" );
double t = input.nextDouble;


double a = v1 - v0 / t;

System.out.println("Average acceleration is:" +a );

}
}