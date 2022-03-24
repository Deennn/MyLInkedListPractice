import lombok.ToString;
@ToString
public class LinkedList {
    Node head;
    Node tail;

    public void add(int element){
        Node newNode = new Node(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

}

@ToString
class Node {
    int value;
    Node next;

    Node(int value){
        this.value = value;
        next = null;
    }
}

class TryEverything{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}