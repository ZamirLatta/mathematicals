import java.util.Scanner;
import java.util.Random;

public class Mathematicals {
    static Random rand = new Random();

    static int getOp = rand.nextInt(2);
    static char op;

    public static void makeQuestion(){
        for(int i=0; i<1; i++){
            final int a = rand.nextInt(100);
            final int b = rand.nextInt(100);

            int answer = 0;

            if (getOp == 0) {
                op = '*';
                answer = a*b;
            } else if (getOp == 1) {
                op = '-';
                answer = a-b;
            } else if (getOp == 2) {
                op = '+';
                answer = a+b;
            }

            System.out.print(a);
            System.out.print(op);
            System.out.print(b+"\n");

            System.out.println("What is the answer?");

            Scanner scanner = new Scanner(System.in);
            String ansString = scanner.nextLine();
            int ansInt = Integer.valueOf(ansString);

            if (ansInt == answer){
                System.out.println("Correct.");
            } else {
                System.out.println("Not Correct.");
            }
        }
    }
    
    public static void main(String[] args){
        makeQuestion();
    }
}