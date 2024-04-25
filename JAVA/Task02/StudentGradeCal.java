import java.util.Scanner;

public class StudentGradeCal{

    public static void main(String[] args) {
        int total=0;
        int average=0;
        int noOfSubject=0;
        int marks;
        Scanner scanner = new Scanner(System.in);
        StudentGradeCal stuCal = new StudentGradeCal();

        System.out.print("Enter no of subject :");
        noOfSubject=scanner.nextInt();

        for (int i=1; i<=noOfSubject; i++){
            System.out.println("Enter Marks :");
            marks = scanner.nextInt();
            total+=marks;
        }
        average = total/noOfSubject;   if (average>80 && average<100){
            System.out.println("Grade A");
        } else if (average>65 && average<79) {
            System.out.println("Grade B");
        } else if (average>55 && average<64) {
            System.out.println("Grade C");
        } else if (average>50 && average<54) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade W");
        }
        System.out.println("Total Marks :"+total);
        System.out.println("Average :"+average);
    }

}
