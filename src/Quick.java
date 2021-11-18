import java.util.ArrayList;
import java.util.Scanner;

public class Quick {
    public  static int[] id = new int[10000];
    static int p,q;
    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++){
            id[i] = i;
        }
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        System.out.println("Вводите пары чисел через дефис(без пробела), через запятую и пробел");
            Scanner scanner1 = new Scanner(System.in);
            String s = scanner1.nextLine();
            String delimeter1 = ", ";
            String[] sustr = s.split(delimeter1);
            for(int j =0; j< sustr.length; j++) {
                String c = sustr[j];
                test.add(c);
                String delimeter = "-";
                String[] parts = c.split(delimeter);
                p = Integer.parseInt(parts[0]);
                q = Integer.parseInt(parts[1]);
                int t = id[p];
                if (t != id[q]) {
                    result.add(c);
                    for (int i = 0; i < 10000; i++) {
                        if (id[i] == t) {
                            id[i] = id[q];
                        }
                    }
                }
            }

        System.out.println("Входные данные");
        for (String j : test) {
            System.out.println(j);
        }
        System.out.println("Выходные данные");
        for (String j : result) {
            System.out.println(j);
        }
    }
}
