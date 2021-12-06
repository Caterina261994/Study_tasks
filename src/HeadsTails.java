import java.util.Random;
import java.util.Scanner;

public class HeadsTails {
    public static boolean heads(){
        Random random = new Random();
        return 0==random.nextInt(5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i;
        int j;
        int cnt;
        int[] f = new int[n+1];
        for (j = 0; j<= n; j++) {
            f[j] = 0;
        }
        for (i =0; i<m; i++){
                cnt=0;
                for (j=0; j<n; j++){
                    if(heads()){
                        cnt++;
                    }
                }
                f[cnt]++;
            }
        for (int value : f) {
            if (value < 10) {
                System.out.println(".");
            } else {
                StringBuilder stringBuffer = new StringBuilder();
                for (int k = 0; k <= value; k += 10) {
                    stringBuffer.append("*");
                }
                System.out.println(stringBuffer.toString());
            }
        }
        }

    }

