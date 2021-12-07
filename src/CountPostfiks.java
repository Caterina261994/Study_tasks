import java.util.Scanner;

public class CountPostfiks {
    public static void main(String[] args) {
        for (int r = 0; r < 3; r++) {
            Scanner scanner = new Scanner(System.in);
            char[] chars = scanner.nextLine().toCharArray();
            CustomStack customStack = new CustomStack(chars.length);
            for (char aChar : chars) {
                if (Character.isDigit(aChar)) {
                    customStack.addElement(Character.getNumericValue(aChar));
                } else if (aChar == '*') {
                    int c = customStack.deleteElement();
                    int a = customStack.deleteElement();
                    customStack.addElement(c * a);
                } else if (aChar == '+') {
                    int b = customStack.deleteElement();
                    int v = customStack.deleteElement();
                    customStack.addElement(b + v);
                }
            }
            System.out.println(customStack.toString());
        }
    }
}
