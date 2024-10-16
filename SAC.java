import java.util.Scanner;
public class SquaresAndCubes {
public static void main(String[] args ) {

System.out.printf("%s\t%s\t%s\n", "number", "square", "cube" );
for (int index = 0; index <=10; index++) {
System.out.printf("%d\t%d\t%d\n", index, index * index, index * index * index);

}
}
}