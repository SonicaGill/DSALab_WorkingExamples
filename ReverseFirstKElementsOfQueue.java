import java.util.Stack;

class Main {
    private Stack<Integer> stack;
    public Main() {
        stack = new Stack<>();
    }
    public void push(int element) {
        stack.push(element);
    }
    public Integer peekCustom() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
    public static void main(String[] args) {
        Main customStack = new Main();
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);
        System.out.println("Peeked Element: " + customStack.peekCustom());
        System.out.println("Popped Element: " + customStack.pop());
        System.out.println("Peeked Element After Pop: " + customStack.peekCustom());
    }
}
