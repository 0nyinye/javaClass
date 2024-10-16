import java.util.Scanner;
public class VolumeAndArea {
public static void main(String[] args ) {

Scanner input = new Scanner(System.in);

	System.out.print("Enter length of sides of equilateral triangle:" );
	double length = input.nextDouble();

	double area = (Math.sqrt(3)/4) * Math.pow(length,2);

	double volume = area * length;

System.out.println("Area is:" + area ); 

System.out.println("Volume of triangular prism " + volume );


}
}  


 
