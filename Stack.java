// Easy Stack implementation using Array
public class EasyStack {

    int size = 5;          // maximum size of stack
    int top = -1;          // top element index
    int[] stack = new int[size];

    // Push (insert element)
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
        }
    }

    // Pop (remove element)
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        EasyStack s = new EasyStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();   // Stack: 10 20 30
        s.pop();       // Popped: 30
        s.display();   // Stack: 10 20
    }
}
