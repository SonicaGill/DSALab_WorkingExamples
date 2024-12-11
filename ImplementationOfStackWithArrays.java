class Stack{
    private int arr[];
    private int size;
    private int index = 0;
    public Stack (int size){
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()){
            System.out.println("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[--index];
    }
    
    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }
    
    public int size(){
        return index;
    }
} 
public class StackClient{
    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);
        System.out.println("1.Size of stack after push operation:" +stack.size());
        System.out.print("2.Pop elements from stack: ");
        while(!stack.isEmpty()){
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operation: " +stack.size());
        }
}