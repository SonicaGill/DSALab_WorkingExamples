import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        int elementToSearch = 30;
        int position = stack.search(elementToSearch);
        
        if (position != -1) {
            System.out.println("Element " + elementToSearch + " found at position (from top): " + position);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the stack.");
        }
    }
}
