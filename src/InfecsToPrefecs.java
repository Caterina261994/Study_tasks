import java.util.Scanner;

public class InfecsToPrefecs {
    public static void main(String[] args) {
        for (int r = 0; r < 3; r++) {
            int count1 = 0;
            int count2 = 0;
            StringBuilder stringBuilder = new  StringBuilder();
            Scanner scanner = new Scanner(System.in);
            char[] chars = scanner.nextLine().toCharArray();
            StacChar stacChar = new StacChar(chars.length);
            for (char aChar : chars) {
                if (Character.isDigit(aChar)) {
                    stringBuilder.append(aChar).append(" ");
                } else if (aChar == '*' || aChar == '+') {
                    stacChar.addElement(aChar);
                } else if (aChar == ')') {
                    stringBuilder.append(stacChar.deleteElement()).append(" ");
                    count2++;
                } else if (aChar == '(') {
                    count1++;
            }
            }
            boolean c = count1==count2;
            System.out.println(stringBuilder.toString());
            System.out.println("Скобки коректны " + c);
        }
    }
}