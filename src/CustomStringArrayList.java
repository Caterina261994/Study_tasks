public class CustomStringArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = capacity + capacity/2;
        String[] element1 = new String[capacity];
        for(int i = 0; i < elements.length; i++){
            element1[i] = elements[i];
        }
        elements = element1;
    }
    public String getElement(int l){
        return elements[l];
    }

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 11; i++) {
            arrayList.add("count" + i);
        }
       for (int l =0; l< arrayList.size; l++){
           System.out.println(arrayList.getElement(l));
       }
    }

}
