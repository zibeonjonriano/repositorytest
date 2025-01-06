import java.util.*;

public class Nilai {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter student name: ");  // Prompt the user to enter the student's name.  '
    String name = scanner.next();
    System.out.print("Enter student real grade: " );
    int realGrade = scanner.nextInt();
    System.out.print("Enter student duration: ");  // Prompt the user to enter the student's duration.  '
    int duration = scanner.nextInt();
    double finalGrade;

    if (duration < 60) {finalGrade = 1.2 * realGrade;}
    else if ((duration<=60) && (duration <= 70)) {finalGrade = realGrade;}
    else if ((duration>70) && (duration <= 89)) {finalGrade = 0.75 * realGrade;}
    else if ((duration>=90) && (duration <= 100)){finalGrade = 0.5 * realGrade;}
    else {finalGrade = 0.2* realGrade;}

    System.out.println("Student Name: " + name + "Grade: " + finalGrade);
    }
}
