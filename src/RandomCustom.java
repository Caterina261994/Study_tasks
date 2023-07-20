import java.util.ArrayList;

public class RandomCustom {

        public static int a = 41;
        public static int c = 11119;
        public static int m = 11113;
        public static int seed = 2;
        public static boolean notrandom = false;

        public static int getNextRandom()
        {
            seed = (a * seed + c) % m;
            return seed;
        }

        public static void main(String[] args)
        {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < 1000; i++)
            {
                arrayList.add(getNextRandom());
                System.out.println(getNextRandom());
            }
            for (int j = 0; j<arrayList.size();j++){
                for (int z = j+1; z<arrayList.size(); z++){
                    if (arrayList.get(j) == arrayList.get(z)){
                        notrandom = true;
                    }
                }
            }
            System.out.println(notrandom);
        }
    }
