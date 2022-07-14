package UE2_WagonLinkedList;

public class Node {
    // *** Membervariablen ***
    private String wagonID;
    private Node next;
    private Node prev;

    // *** Getter- & Setter-Methoden ***
    public String getWagonId() {
        return wagonID;
    }

    public void setWagonId(String wagonId) {
        this.wagonID = wagonId;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
