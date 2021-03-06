
public class CustomStack {
    private int mSize;
    private int[] stackArray;
    private int top;

    public CustomStack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int element) {
        stackArray[++top] = element;
    }

    public int deleteElement() {
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i<=top; i++){

            s.append(stackArray[i]).append(" ");
        }
        return s.toString();
    }
}