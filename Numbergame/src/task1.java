import java.util.Random;
import java.util.Scanner;

public class task1 { 
    static int count = 0;
    static int win = 0;
    
    task1(){
        count++;
    }
    
    public void guess(){
        try{
        int a = 0;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num1 = rd.nextInt(100) + 1;
        System.out.println("_Random number is chosen_");
        for(int i=0; i<7; i++){
        System.out.println("User Attempt "+(i+1)+" : Select a number between 1-100");
        int num2 = sc.nextInt();
        if(num2>100){
            throw new MyException("Invalid input. Please enter number between 1 to 100");
        }
        int r = check(num1, num2);
        if(r==1){
            a = 1;
            break;
        }
    }
        if(a!=1){
            System.out.println("_Failed_");
            System.out.println("The Randomly generated number was "+num1);
        }}catch (MyException e){
        System.out.println(e.toString());
    }
}
    static int check(int num1, int num2){
        int r;
        if (num1==num2){
            System.out.println("_Number Correct_");
            win++;
            r = 1;
        }
        else if(num1>num2){
            System.out.println("Number is too low");
            r = 0;
        }
        else {
            System.out.println("Number is too high");
            r = 0;
        }
        return r;
    }
    
    static void winloose(){
        int cal = (count/2)+1;
        System.out.println("-----------------------------------");
        System.out.println("User's Score");
        System.out.println("Total Attempts: "+count+"\nTotal Win: "+win+"\nTotal Lost: "+(count-win));
        System.out.println("-----------------------------------");
        if(win>=cal){
            System.out.println("User Won");
        }
        else{
            System.out.println("User Lost");
        }
        System.out.println("-----------------------------------");
    }

}