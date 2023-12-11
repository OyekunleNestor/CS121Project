package WeekFourteen;

import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int element) {
        stack.add(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}