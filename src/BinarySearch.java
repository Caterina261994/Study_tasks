import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] array, int v) {
        int left = 0;
        int right = array.length-1;
        while (right >= 1) {
            int midle = (right + left) / 2;
            if (array[midle] == v) {
                return midle;
            }else if (array[midle] > v) {
                right = midle - 1;
            } else left = midle + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array;
        int v;
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
        System.out.println("Введите искомое число");
        v = scanner.nextInt();
        //= {1488,1578,1973,3665,4426,4548,5435,5446,633,6385,6455,6504,6937,6965,7104,7230,8340,8958,928,9364,9550,9645,9686};
        //int v = 5435;
        System.out.println(binarySearch(array, v));
    }
}