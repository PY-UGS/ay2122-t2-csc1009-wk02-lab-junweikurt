import java.util.Scanner;
public class Q1 {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();
        System.out.println(byteValue);

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();
        System.out.println(shortValue);

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();
        System.out.println(intValue);

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();
        System.out.println(longValue);

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();
        System.out.println(floatValue);

        System.out.print("Enter a number for radius: ");
        float radius = input.nextFloat();
        double pi = 3.14159;
        double area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
