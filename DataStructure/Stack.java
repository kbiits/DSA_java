/**
 * Stack
 */
public class Stack {

    private Node top;
    private Node down;
    private int size;

    Stack() {
        this.size = 0;
    }

    void push(int value) {
        Node temp = new Node(value);
        if (isEmpty()) {
            this.down = temp;
            this.top = temp;
            size++;
            return;
        }
        this.top.next = temp;
        this.top = temp;
        size++;
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        }
        Node temp = this.down;
        while (temp.next != this.top) {
            temp = temp.next;
        }
        int value = this.top.getValue();
        temp.next = null;
        this.top = temp;
        return value;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        st.print();
        System.out.println(st.peek());
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    int peek() {
        return this.isEmpty() ? -9999999 : this.top.getValue();
    }

    void print() {
        if (!isEmpty()) {
            Node temp = this.down;
            System.out.print("[ ");
            while (temp != null) {
                System.out.printf("%d , ", temp.getValue());
                temp = temp.next;
            }
            System.out.print(" ]");
            System.out.println();
        } else {
            System.out.println("Stack kosong");
        }
    }
}