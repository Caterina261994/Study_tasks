import java.util.Scanner;

public class CountingSort {
    public static void sort( int[] input,int n)
    {
        int min=0,max=0;
        for (int i = 1; i < n; i++)
        {
            if (input[i] > max)
                max = input[i];
            if (input[i] < min)
                min = input[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < n; i++)
            count[input[i] - min]++;
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                input[j++] = i + min;
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
        sort(array,array.length);

        for (int h : array)
            System.out.print(h + " ");
    }

}