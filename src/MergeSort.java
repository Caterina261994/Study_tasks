import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] src1, int src1Start, int[] src2, int src2Start,int[] dest, int destStart, int size){
        int index1 = src1Start;
        int index2 = src2Start;
        int src1End = Math.min(src1Start+ size,src1.length);
        int src2End = Math.min(src2Start+ size,src2.length);
        int iterationCount = src1End - src1Start + src2End - src2Start;
        for(int i = destStart; i < destStart +iterationCount; i++){
            if(index1<src1End && (index2 >= src2End || src1[index1] < src2[index2])){
                dest[i] = src1[index1];
                index1++;
                }else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
    public static int[] sortUnsorted(int[] a) {
       int[] array_temp;
       int[] currentSrc = a;
       int[] currentDest = new int[a.length];
       int size = 1;
       while(size<a.length){
           for (int i = 0; i< a.length; i+=2*size){
               merge(currentSrc, i ,currentSrc,i+size,currentDest,i,size);
           }
           array_temp = currentSrc;
           currentSrc= currentDest;
           currentDest = array_temp;
           size = size*2;

       }
       return currentSrc;
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
        System.out.println(Arrays.toString(sortUnsorted(array)));
    }
}
