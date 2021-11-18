import java.util.ArrayList;
import java.util.Scanner;

public class Quick_search {
    public  static int[] id = new int[10000];
    static int p,q;
    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++){
            id[i] = i;
        }
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        System.out.println("Введите количество пар которые вы введете");
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int count = 0;
        System.out.println("Вводите пары чисел через дефис(без пробела)");
        while (count<a){
            Scanner scanner1 = new Scanner(System.in);
            String c = scanner1.nextLine();
            test.add(c);
            String delimeter = "-";
            String[] parts = c.split(delimeter);
            p = Integer.parseInt(parts[0]);
            q = Integer.parseInt(parts[1]);
            int t  = id[p];
            if(t!=id[q]){
                result.add(c);
                for (int i=0;i<10000; i++){
                    if(id[i] == t){
                        id[i] = id[q];
                    }
                }
            }
            count++;
        }
        System.out.println("Входные данные");
        for (String s : test) {
            System.out.println(s);
        }
        System.out.println("Выходные данные");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
