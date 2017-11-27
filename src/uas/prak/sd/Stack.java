package uas.prak.sd;
// =====BISMILLAH=====

public class Stack {

    private final int SIZE = 20;
    private int[] st;
    private int top;

    public Stack() {
        st = new int[SIZE];    // make array
        top = -1;
    }

    void push(int j) {
        st[++top] = j;
    }

    public int pop() {
        return st[top--];
    }

    int peek() {
        return st[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
// =====ALHAMDULILLAH=====
