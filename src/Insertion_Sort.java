import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] array : data) {
            System.out.print(Arrays.toString(array) + " => ");
            for (int left = 0; left < array.length; left++) {
                // Вытаскиваем значение элемента
                int value = array[left];
                // Перемещаемся по элементам, которые перед вытащенным элементом
                int i = left - 1;
                for (; i >= 0; i--) {
                    // Если вытащили значение меньшее — передвигаем больший элемент дальше
                    if (value < array[i]) {
                        array[i + 1] = array[i];
                    } else {
                        // Если вытащенный элемент больше — останавливаемся
                        break;
                    }
                }
                // В освободившееся место вставляем вытащенное значение
                array[i + 1] = value;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}