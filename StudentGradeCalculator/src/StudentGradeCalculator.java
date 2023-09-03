import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        int marksarr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects :");
        int n = sc.nextInt();
        marksarr = new int[n];
        try{
        for(int i =0; i<n; i++){
        System.out.println("Enter the subject "+(i+1));
        String sub = sc.next();
        System.out.println("Enter the marks :");
        int marks = sc.nextInt();
        if(marks>100){
            throw new MyException("Invalid input. Marks should be out of 100");
        }
        marksarr[i] = marks;
    }
        task2 t = new task2(marksarr);
        t.calculatetotal();
        t.calculateaverage();
        t.calculategrade();
        t.displayresult();
        }catch (MyException e){
        System.out.println(e.toString());
    }
}
}