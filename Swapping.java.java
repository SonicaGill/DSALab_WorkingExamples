/TASK NO-01
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a ^= b;  
        b ^= a;  
        a ^= b;  
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}