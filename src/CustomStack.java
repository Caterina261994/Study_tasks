import java.util.Scanner;

public class CustomStack {
    private int mSize;
    private char[] stackArray;
    private int top;

    public CustomStack(int m) {
        this.mSize = m;
        stackArray = new char[mSize];
        top = -1;
    }

    public void addElement(char element) {
        stackArray[++top] = element;
    }

    public char deleteElement() {
        return stackArray[top--];
    }

    public char readTop() {
        return stackArray[top];

    }
    //E A S * Y * Q U E * * * S T * * * I O * N * * *

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }

    static class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s  = scanner.nextLine();
            char[] array = s.toCharArray();
            CustomStack customStack = new CustomStack(array.length);
            for (int i = 0; i < array.length; i++){
                if (Character.isLetter(array[i])){
                    customStack.addElement(array[i]);
                }else if(array[i] == '*'){
                    System.out.println(customStack.readTop());
                    customStack.deleteElement();
                }
            }
        }
    }
}
