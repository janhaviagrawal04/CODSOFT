import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.println("Number Game\nUser has 7 attempts in each round to guess the number");
        try{
        while(j==1){
            i++;
            System.out.println("-----------------------------------");
            System.out.println("Round "+i);
            System.out.println("-----------------------------------");
            task1 t = new task1();
            t.guess();
            System.out.println("-----------------------------------");
            System.out.println("Play Again? y/n");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            if (a.matches("y")){
                j = 1;
            }
            else if (a.matches("n")){
                j = 0;
            }
            else{
                throw new MyException("Invalid input. Please enter 'y' or 'n'.");
            }
        }
        task1.winloose();
    }
    catch (MyException e){
        System.out.println(e.toString());
    }
}
}