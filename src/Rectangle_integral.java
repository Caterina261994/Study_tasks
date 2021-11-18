import java.util.Scanner;

public class Rectangle_integral {
    static double x,h;
    static double sum = 0.0;
    static double fx;
    static double eps;
    static int n = 1;
    static double d = 0.0;
    static double b, c, a;
    static double s1;
    static double s;
    private static double func (double x){
        return a*Math.pow(x, 2) + b;
    }
    private static double rectangle_integral(double c, double d, int n){
        h = (c - d) / n;  //шаг

        for (int i = 0; i < n; i++) {
            x = d + i*h;
            fx = func(x);
            sum += fx;
        }
        return (sum * h); //приближенное значение интеграла равно
        //сумме площадей прямоугольников
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение а для функции y=ax2+b");
        a = scanner.nextDouble();
        System.out.println("Введите значение b для функции y=ax2+b");
        b = scanner.nextDouble();
        System.out.println("Введите значение c окончание интервала функции y=ax2+b");
        c = scanner.nextDouble();
        System.out.println("Введите значение точности вычисления интеграла для функции y=ax2+b");
        eps = scanner.nextDouble();
        s1 = rectangle_integral(c,d,n);
        do{
            s = s1;
            n = 2 * n;
            s1 = rectangle_integral(c,d,n);
        } while (Math.abs(s1 - s)> eps);
        System.out.println("Интеграл = " + s1);
        System.out.println(n);
    }
}
