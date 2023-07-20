import java.util.Scanner;

public class Rule {
    static void rule(int l, int r, int h){
        int m = (l+r)/2;
        if (h>0){
            rule(l,m,h-1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Метка ");
            for(int i = 0; i<h; i++) {
                stringBuilder.append("-");
            }
            System.out.println(stringBuilder.toString());
            rule(l,m,h-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l= scanner.nextInt();
        int r = scanner.nextInt();
        int h = scanner.nextInt();
        rule(l,r,h);
    }
}
