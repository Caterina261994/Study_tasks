import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadixSort {
    public static void radixsort(int[] input) {
        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            for (Integer i : input) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    input[a++] = i;
                }
                buckets[b].clear();
            }
            divisor *= 10;
        }
    }
    public static void main(String[] args) {
        int[] array;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив через запятую без пробелов");
        str = scanner.nextLine();
        String delimeter = ",";
        String[] parts = str.split(delimeter);
        array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        radixsort(array);

        for (int h : array)
            System.out.print(h + " ");
    }

}
