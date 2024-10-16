import java.util.Scanner;
public class EvenOddPrime {
public static void main(String[] args ) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer:" );
int num1 = input.nextInt();


System.out.print("Enter a second integer:" );
int num2 = input.nextInt();

System.out.print("Enter a third integer:" );
int num3 = input.nextInt();

if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0 ) {

System.out.println("num1 && num2 && num3 " + "is are even number");

} else{

System.out.println(" odd");


}
}
}




 
