package DataStructure;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int nums;

    SinglyLinkedList() {
        this.nums = 0;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        nums++;
    }

    public void addLast(int value) {
        if (isEmpty()) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);
            this.tail.next = newNode;
            this.tail = newNode;
            nums++;
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        Node temp  = this.head;
        while (temp != null) {
            System.out.printf("%s ", temp.getValue());
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return this.nums == 0;
    }

    public Node getHeadNode() {
        return this.head;
    }

    public Node getTailNode() {
        return this.tail;
    }

    public void removeFirst() {
        if(!isEmpty()) {
            this.head = this.head.next;
            nums--;
        } else {
            System.out.println("Linked List Kosong, Tidak Ada Data Yang Bisa Dihapus");
        }
    }

    public void removeLast() {
        if(!isEmpty()) {
            if (getLength() == 1) {
                this.head = null;
                this.tail = null;
                nums--;
                return;
            }
            Node temp = this.head;
            while (temp.next != this.tail){
                temp = temp.next;
            }
            this.tail = temp;
            this.tail.next = null;
            nums--;
        } else {
            System.out.println("Linked List Kosong, Tidak Ada Data Yang Bisa Dihapus");
        }
    }

    public int getLength() {
        return this.nums;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(5);
        // sll.addFirst(6);
        // sll.addFirst(7);
        // sll.addLast(7);
        // sll.addLast(6);
        // sll.addLast(5);
        sll.removeLast();
        sll.display();
        sll.removeLast();
        System.out.println(sll.getLength());
    }
}
