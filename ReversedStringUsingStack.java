import java.util.Stack;

class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        System.out.println("Reversed String: " + reversedString.toString());
    }
}
