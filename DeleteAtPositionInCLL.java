class Main {
    Node head = null;
    Node tail = null;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 0) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }
        Node temp = head;
        int index = 0;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }
        if (temp == null || temp.next == head) {
            System.out.println("Position is out of bounds.");
            return;
        }
        Node nodeToDelete = temp.next;
        temp.next = temp.next.next;
        if (nodeToDelete == tail) {
            tail = temp;
        }
    }
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head; 
        }
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.addNode(10);
        main.addNode(20);
        main.addNode(30);
        main.addNode(40);
        main.addNode(50);
        System.out.print("Original List: ");
        main.printList();
        main.deleteNodeAtPosition(2);
        System.out.print("List after deletion: ");
        main.printList();
    }
}
