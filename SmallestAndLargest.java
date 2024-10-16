import java.util.Scanner;
public class SmallestAndLargest {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer:");
int integer1 = input.nextInt();

System.out.print("Enter second integer:");
int integer2 = input.nextInt();

System.out.print("Enter third integer:");
int integer3 = input.nextInt();

int sum = integer1 + integer2 + integer3;
int average = (integer1 + integer2 + integer3) / 2;
int product = integer1 * integer2 * integer3;

System.out.println("Sum is:" + sum);
System.out.println("Average is:" + average);
System.out.println("Product is:" + product);

if(integer1 > integer2 && integer1 > integer3) {
System.out.println("Largest number is:" + integer1);
if(integer2 > integer1 && integer2 > integer3) {
System.out.println("Largest number is:" + integer2);
if(integer3 > integer1 && integer3 > integer2) {
System.out.println("Largest number is:" + integer3);
if(integer1 < integer2 && integer1 < integer3) {
System.out.println("Smallest number is:" + integer1);
if(integer2 < integer1 && integer2 < integer3) {
System.out.println("Smallest number is:" + integer2);
if(integer3 < integer1 && integer3 < integer2) {
System.out.println("Smallest number is:" + integer3);



}
}
}
}
}
}
}
}












