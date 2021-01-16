package DataStructure;

public class DoublyLinkedList {
    int size;
    NodeDouble head;
    NodeDouble tail;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(7);
        dll.addLast(8);
        dll.removeLast();
        dll.removeLast();
        dll.print();
    }

    DoublyLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    NodeDouble getHead() {
        return this.head;
    }

    NodeDouble getTail() {
        return this.tail;
    }

    void addLast(int value) {
        NodeDouble temp = new NodeDouble(value);
        this.size++;
        if(isEmpty()) {
            this.head = temp;
            this.tail = temp;
            return;
        }
        this.tail.setNext(temp);
        temp.setPrev(this.tail);
        this.tail = temp;
    }

    void addFirst(int value) {
        NodeDouble temp = new NodeDouble(value);
        if (isEmpty()) {
            this.head = temp;
            this.tail = temp;
            this.size++;
            return;
        }
        this.head.setPrev(temp);
        temp.setNext(this.head);
        this.head = temp;
        this.size++;
    }

    void removeFirst() {
        if(isEmpty()){
            System.out.println("Linked List Kosong");
            this.size--;
            return;
        } else if(this.size == 1) {
            this.head = this.tail = null;
            this.size--;
            return;
        }
        this.head = this.head.getNext();
        this.head.getPrev().setNext(null);
        this.head.setPrev(null);
        this.size--;
    }

    void removeLast() {
        if(isEmpty()){
            System.out.println("Linked List Kosong");
            this.size--;
            return;
        } else if(this.size == 1) {
            this.head = this.tail = null;
            this.size--;
            return;
        }
        this.tail = this.tail.getPrev();
        this.tail.setNext(null);
        this.size--;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
            return;
        }
        NodeDouble temp = this.head;
        while(temp != null) {
            System.out.printf("%d ", temp.getValue());
            temp = temp.getNext();
        }
        System.out.println();
    }
}
