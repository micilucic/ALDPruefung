package UE7_MovieLinkedList;

public class MovieLinkedList {
    // *** Membervariablen ***
   private Node first;
   private Node last;

    // *** Methoden ***
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
       return last;
    }

    public Node getMovieAtIndex(int index) {
        Node current = first;
        String s;
        if (current == null) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.getNext();
                s = current.getMovieTitle();
            }
        }
        return current;
    }

    public void insertMovieTitleAtIndex(String movieTitle, int index) {
        // TODO
    }

    public void deleteMovieAtIndex(int index) {
        // TODO
    }

    public void printList() {
        Node currentNode = this.getFirst();

        System.out.print("*** Start: ");
        if (currentNode == null) {
            System.out.print("<empty>");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.getMovieTitle() + ", ");
                currentNode = currentNode.getNext();
            }
        }
        System.out.println();
    }

}
