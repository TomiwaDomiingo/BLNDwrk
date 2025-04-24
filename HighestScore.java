import java.util.Scanner;

public class HighestScore {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of students: ");
int numOfStudents = input.nextInt();
input.nextLine(); 
int highestScore = 0;
String highestScoreName = "";
for (int i = 1; i <= numOfStudents; i++) {
System.out.print("Enter student " + i + " name: ");
String name = input.nextLine();

           
System.out.print("Enter student " + i + " score (0-50): ");
int score = input.nextInt();
input.nextLine(); 
while (score < 0 || score > 50) {
System.out.println("Invalid score. Please enter a score between 0 and 50.");
System.out.print("Enter student " + i + " score (0-50): ");
score = input.nextInt();
input.nextLine(); 
}
if (score > highestScore) {
highestScore = score;
highestScoreName = name;
}
}
System.out.println("The student with the highest score is: " + highestScoreName + " with a score of " + highestScore);
}
}

