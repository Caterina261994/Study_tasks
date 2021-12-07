import java.util.Scanner;
public class NOD {
    public static int a;
    public static int b;

    public static void main(String[] args) {
        int nod = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило");
        a = scanner.nextInt();
        System.out.println("Введите чило");
        b = scanner.nextInt();
        if (a < b) {
            while (a != 0) {
                int tmp = b % a;
                b = a;
                a = tmp;
                nod = b;
                System.out.println(b+", "+a);
            }
        } else if (a == b) {
            nod = a;
        } else {
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
                nod = a;
                System.out.println(a+", "+b);
            }
        }
        System.out.println(nod);
    }
}