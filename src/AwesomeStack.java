public class AwesomeStack {

    public static void main(String[] args) {
        CustomStack mCustomStack = new CustomStack(10);

        mCustomStack.addElement(79);
        mCustomStack.addElement(59);
        mCustomStack.addElement(35);
        mCustomStack.addElement(24);

        mCustomStack.deleteElement();

        System.out.print("Стек: ");
        while (!mCustomStack.isEmpty()) {
            int value = mCustomStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}