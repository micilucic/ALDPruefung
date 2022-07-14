package UE7_MovieLinkedList;

public class Node {
    // *** Membervariablen ***
    private final String movie;
    private Node next;
    private Node prev;

    // *** Methoden ***
    public Node(String movie) {
        this.movie = movie;
    }

    public String getMovieTitle() {
        return movie;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
       this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }
}
