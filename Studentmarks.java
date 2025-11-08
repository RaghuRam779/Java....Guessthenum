import java.util.Scanner;

public class Studentmarks
{
//    Takes marks of students as input (for one or more subjects).
//    Calculates total, average, highest, and lowest marks.
//    Optionally, determines grade or pass/fail status.
//    Arrays → store multiple student marks.
//    Loops → to iterate over marks.
//    Functions → to separate logic (e.g., calculate average, find max).
//    Conditional statements → for grading or pass/fail.
    public static void Total_marks(int[] marks){
        int ttl=0;
        for (int mark : marks) {
            ttl += mark;

        }
        System.out.println("Total marks: "+ttl);
    };
    public static void Avg_marks(int[] marks) {
        int sum=0;
        for (int mark : marks) {
            sum += mark;

        }
        int avg=sum/marks.length;
        System.out.println(avg);
    };
    public static void Highest_marks(int[] marks) {
        int highest = marks[0];
        int i = 1;
        while (i < marks.length) {
            if (marks[i] > highest) {
                highest = marks[i];
            }

            i++;
        }
        System.out.println("Highest marks: "+highest);
    }
    public static void Low_marks(int[] marks) {
        int Low = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < Low) {
                Low = marks[i];
            }

        }
        System.out.println("Low marks: "+Low);
    }
    public static void Grade(int[] marks) {
        int ttl=0;
        for (int i=0;i<marks.length;i++)
        {
            ttl+=marks[i];

        }
        if (ttl <350){
            System.out.println("Result : Fail");
        }
        if (ttl > 350){
            System.out.println("Result : Pass");
            if (ttl < 450)
                {
                System.out.println("Grade:--  B+ ---");
                }
            if( ttl > 500 && ttl < 550){
                System.out.println("Grade:--  A  ---");
            }
            if(ttl > 550 && ttl < 600){
                System.out.println("Grade:--  O  ---");
            }
        }

    }

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);
        int[] marks = new int[6];

        System.out.println("Enter Students marks:");
        for (int i = 0; i < 6; i++) {
            marks[i] = ui.nextInt();
        };

        for (int num : marks) {
            System.out.println(num+ " ");
        };
        Total_marks(marks);
        Avg_marks(marks);
        Highest_marks(marks);
        Low_marks(marks);
        Grade(marks);

    }
}
