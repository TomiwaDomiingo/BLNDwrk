import java.util.Scanner;

public class MultiplicationTable1 {
public static void main(String[] args) {

   Scanner input = new Scanner(System.in); 
   System.out.print("Enter a positive integer: ");  
   int number = input.nextInt();

   if (number <= 0) {
   System.out.println("Please enter a positive integer.");
 } else {
 for (int i = 1; i <= 10; i++) { 
     int result = number * i;
   System.out.println(number + " * " + i + " = " + result);
}
}

}
}
