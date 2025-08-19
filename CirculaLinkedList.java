// Easy Circular Linked List in Java
public class SimpleCircularLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null;

    // Insert at end
    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {   // first node
            head = newNode;
            head.next = head; // circular link to itself
        } else {
            Node temp = head;
            while (temp.next != head) { // move to last node
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // link back to head
        }
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
        SimpleCircularLinkedList cll = new SimpleCircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.display();   
    }
}
