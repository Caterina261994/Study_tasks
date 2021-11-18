import java.util.Scanner;

public class Linear_search {
    public static int linear_search(int[] array, int v){

        for (int i = 0; i< array.length; i++){
            if(array[i] == v) {
                return i;
            }
        }
        return -1;
    }
    public static int linear_search_max(int[] array){
        int c = array[0];
        for (int i = 1; i<array.length; i++){
            if(array[i] > c){
                c = array[i];
            }
        }
        return c;
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
        for(int i = 0; i< parts.length; i++){
            array[i] =Integer.parseInt(parts[i]);
        }
        System.out.println("Введите искомое число");
        v = scanner.nextInt();
         //= {1488,1578,1973,3665,4426,4548,5435,5446,6333,6385,6455,6504,6937,6965,7104,7230,8340,8958,928,9364,9550,9645,9686};
        //int v = 5435;
        System.out.println(linear_search(array,v));
        System.out.println("max number is " + linear_search_max(array));
    }
}
