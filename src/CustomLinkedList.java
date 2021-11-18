public class CustomLinkedList {

 Node head = new Node(null); //Двусвязный список с добавлением в начало списка
 Node last;

    public static class Node{
        private Node next;
        private String value;
        private Node heady;
        Node(String value){
            this.value = value;
            this.heady = null;
            this.next = null;
        }
    }
    public void add(String value){

        if(head.next == null){
            head.value = value;
            head.next = head;
            head.heady = null;
        }else {
            Node new_node = new Node(value);
            new_node.value = head.value;
            new_node.next = last;
            head.value = value;
            head.next = new_node;
            new_node.heady = head;
            last = new_node;
        }

    }
    public String get(int index) {
        int currentIndex = 0;
        Node currentElement = head;
        while ((currentElement) != null) {
            if (currentIndex == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return "NO";

    }

}
