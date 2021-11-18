import java.util.HashMap;
import java.util.Scanner;

public class Study_English {
    public static int[][] array;
    public static int n;
    public static int a;
    public static int b;
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(0,"zero");
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.put(4,"four");
        hashMap.put(5,"five");
        hashMap.put(6,"six");
        hashMap.put(7,"seven");
        hashMap.put(8,"eight");
        hashMap.put(9,"nine");
        hashMap.put(10,"ten");
        hashMap.put(11,"eleven");
        hashMap.put(12,"twelve");
        hashMap.put(13,"thirteen");
        hashMap.put(14,"fourteen");
        hashMap.put(15,"fifteen");
        hashMap.put(16,"sixteen");
        hashMap.put(17,"seventeen");
        hashMap.put(18,"eighteen");
        hashMap.put(19,"nineteen");
        hashMap.put(20,"twenty");
        hashMap.put(30,"thirty");
        hashMap.put(40,"forty");
        hashMap.put(50,"fifty");
        hashMap.put(60,"sixty");
        hashMap.put(70,"seventy");
        hashMap.put(80,"eighty");
        hashMap.put(90,"ninety");
        hashMap.put(100,"one hundred");
        for(int i = 20; i<100; i+=10) {
            for (int j = 1; j < 10; j++) {
                hashMap.put(i+j,hashMap.get(i) + "-" + hashMap.get(j));
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите до какого числа вы хотели видеть таблицу умножения в пределах 10");
        n = scanner.nextInt();
        array = new int[n+1][n+1];
        for (int t = 0; t<=n; t++){
            for (int z = 0; z<=n; z++){
                array[t][z] = t*z;
            }
        }
        System.out.println("Введите первый множитель");
        a = scanner.nextInt();
        System.out.println("Введите второй множитель");
        b = scanner.nextInt();
        System.out.println(hashMap.get(a) + " * " + hashMap.get(b) + " = " + hashMap.get(array[a][b]));

    }
}
