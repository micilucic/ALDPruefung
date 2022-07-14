package UE3_BookStack;

public class BookStack {
    // *** Membervariablen ***
    private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop() {
        return top;
    }


    // *** Operationen ***

    public void push(String bookTitle) {
        Node newNode = new Node(bookTitle);
        newNode.setNext(top);
        top = newNode;
    }


    public String pop() throws StackEmptyException {
       if (top == null) {
           return null;
       } else {
           String s = top.getBookTitle();
           top = top.getNext();
           return s;
       }
    }

    public int getCount() {
        int count = 1;
        Node currentNode = top;
        while (currentNode.getNext()!=null) {
            count++;
        }
        return count;
    }
}
