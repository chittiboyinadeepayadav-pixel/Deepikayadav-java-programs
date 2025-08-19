// Simple Linked List in Java
public class SimpleLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null; // first node (head)

    // Insert at end
    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {   // if list is empty
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { // move to last node
                temp = temp.next;
            }
            temp.next = newNode; // add new node at end
        }
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
