import org.w3c.dom.Node;

public class RevertList {

    private Node head;
    private Node tail;

    public class Node {
        Node next;
        Node previous;
    }

    public void revertDouble() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            Node previous = current.previous;
            current.previous = next;
            if (previous == null) {
                tail = current;
            }
            if (next == null) {
                head = current;
            }
            current = next;
        }
    }

}
