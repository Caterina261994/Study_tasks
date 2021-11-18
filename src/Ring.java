import java.util.Scanner;

public class Ring {

    static double s1 = 0.0;
    static int a;
    static int length = 1;
    static double eps;
    static double d;
    static final double PI = 3.14;
    static int count = 0;
    static double o;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение точности");
        eps = scanner.nextDouble();
        System.out.println("Введите количество сторон многоугольника");
        a = scanner.nextInt();
        System.out.println("Введите значение диаметра окружности");
        d = scanner.nextDouble();
        double S = PI * d;
        while ((S - s1) > eps) {
            s1 = a * length;
            a += 1;
            if (S > s1) {
                {
                    count++;
                }

            }
        }
            System.out.println(count);

    }
}