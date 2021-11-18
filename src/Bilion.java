public class Bilion {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int N = 10;
        int i, j, k, count = 0;
        for (i = 0; i < N; i++){
            for (j = 0; j < N; j++){
                for (k = 0; k < N; k++) {
                    count++;
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Execution time in nanoseconds  : " + totalTime);
        System.out.println("Execution time in milliseconds : " + totalTime / 1000000);
        System.out.println("count = " + count);
    }
}