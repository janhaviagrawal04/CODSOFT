public class task2 {
    static float total = 0;
    int marks[];
    float average = 0;
    String grade;
    task2(int marks[]){
        this.marks = marks;
    }
    public void calculatetotal(){
        for(int i=0; i<marks.length; i++){
            total = total + marks[i];
        }
    }
    public void calculateaverage(){
        average = (total/marks.length);
    }
    public void calculategrade(){
        if(average>=90){
            grade = "A";
        }
        else if(average>=75 && average<90){
            grade = "B";
        }
        else if(average>=50 && average<75){
            grade = "C";
        }
        else if(average>=50 && average<40){
            grade = "D";
        }
        else {
            grade = "Failed";
        }
    }
    public void displayresult(){
        System.out.println("Total Marks: "+total);
        System.out.println("Average Percentage: "+average+" %");
        System.out.println("Grade: "+grade);
    }
}