import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + avg);


        System.out.print("Enter three numbers: ");

    }
}
