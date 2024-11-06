//TASK NO-02
import java.util.Scanner;
public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();
        float roundedNum1 = Math.round(num1 * 1000.0) / 1000.0f;
        float roundedNum2 = Math.round(num2 * 1000.0) / 1000.0f;
        if (roundedNum1 == roundedNum2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different up to three decimal places.");
        }
        scanner.close();
    }
}