
public class NodeDouble {
    private int value;
    private NodeDouble next;
    private NodeDouble prev;

    NodeDouble(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    NodeDouble getNext() {
        return this.next;
    }

    NodeDouble getPrev() {
        return this.prev;
    }

    void setNext(NodeDouble temp) {
        this.next = temp;
    }

    void setPrev(NodeDouble temp) {
        this.prev = temp;
    }
}
