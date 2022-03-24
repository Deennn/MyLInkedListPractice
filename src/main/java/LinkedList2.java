import lombok.ToString;

import java.sql.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

@ToString
public class LinkedList2 <T> {
    @ToString
    static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
    Node<T> head;
    Node<T> tail;
    private int size;

    public void addFirst(T item) {
        Node<T> node = new Node<>(item);
        if (isEmpty()) {
            head = tail = node;
        } else {

         node.next = head;
         head = node;

        }
        size++;

    }
    public void addLast(T item) {
        Node<T> node = new Node<>(item);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public int indexOf(T item) {
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }
    public boolean contains(T item) {
        return indexOf(item) != -1;
    }
    public void removeFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
        }else {
            var temp = head.next;
            head.next = null;
            head = temp;
        }
        size--;

    }
    public void reverse(){
        Node<T> current = head;
        Node<T> previous = null;


        while(current != null){
           Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        head = previous;
    }



    public void removeLast() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;

        } else {
            tail = getPrevious(tail);
            assert tail != null;
            tail.next = null;
        }
        size--;
    }
    public int size() {
        return size;
    }
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        var current  = head;
        int index = 0;
        while (current != null) {
            array[index++] =  current.value;
            current = current.next;
        }
        return array;
    }

    private Node<T> getPrevious(Node<T> node){
        var current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }



    private boolean isEmpty() {
        return head == null;
    }

}
//@ToString
class Test {

    public static void main(String[] args) {
        LinkedList2<String> list2 = new LinkedList2<>();
        list2.addFirst("Python");
        list2.addFirst("IOS");
        list2.addFirst("Java");
//       var arr =  list2.toArray();
  //      System.out.println(Arrays.toString(arr));
        System.out.println(list2);

        list2.reverse();

        System.out.println(list2);
//        list2.removeLast();
//        list2.removeLast();
//        System.out.println(  list2.size());
//        System.out.println(list2.contains("Pytho"));
//        System.out.println(list2);

//        Node<String> a = new Node<>("Python");
//        Node<String> b = new Node<>("Java");
//        Node<String> c = new Node<>("Ios");
//        Node<String> d = new Node<>("Node");
//        Node<String> e = new Node<>("Golang");
//
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;


//        Node<String> currentNode = a;
//
//        while (currentNode != null){
//            System.out.println(currentNode.value);
//            currentNode = currentNode.next;
//        }


    }
    public static String dnaComplement(String dna) {
        String result = "";
        for (int i = 0; i < dna.length(); i++) {


        }
        return result;
    }

}
