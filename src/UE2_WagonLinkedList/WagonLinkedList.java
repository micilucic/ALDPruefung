package UE2_WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;
    // *** Methoden ***


    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setPrev(Node prev) {
        this.last = prev;
    }



    void insertWagonAtFirstPos(String wagonId) {
        Node newNode = new Node();

        if (first == null) {
           first = newNode;
           last = newNode;
           newNode.setWagonId(wagonId);
        } else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
            first.setWagonId(wagonId);
        }
    }

    void removeWagonFromLastPos() {
        Node helper;
       if (first == null) {
           return;
       } else if (first == last) {
           first = null;
           last = null;
       } else {
           helper = last.getPrev();
           helper.setNext(null);
           last = helper;
       }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
