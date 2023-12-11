package WeekFourteen;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        while (!myStack.isEmpty()) {
            // Print popped elements
            System.out.println("Popped: " + myStack.pop());
        }
    }
    /*
    Discussion Questions for Stack:
    1. Where would a queue be more appropriate to use than a stack?
       - A queue would be more appropriate when you need to maintain the order of elements based on the principle of First-In-First-Out (FIFO).
       For example, in scenarios like processing tasks in the order they are received.

    2. What are the differences in the order of elements when using a stack vs. using a queue?
       - In a stack, the last element added is the first one to be removed (Last-In-First-Out or LIFO).
        In a queue, the first element added is the first one to be removed (First-In-First-Out or FIFO).
    */
}