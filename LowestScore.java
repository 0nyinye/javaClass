import java.util.Scanner;
public class LowestScore  {
public static void main(String[] args )  {

Scanner input = new Scanner(System.in);

System.out.print("Enter number of students");
int numberofstudents = input.nextInt();

for(int index = 0; index < numberofstudents; index++)  {
input.nextLine();

System.out.println("Enter student's name");
String name = input.nextLine();
System.out.println("Enter student's score");
double score = input.nextDouble();




}
}
}