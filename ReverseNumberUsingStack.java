import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int number = 12345;
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 10); 
            number /= 10; 
        }
        int reversedNumber = 0;
        int placeValue = 1; 
        while (!stack.isEmpty()) {
            reversedNumber += stack.pop() * placeValue;
            placeValue *= 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
