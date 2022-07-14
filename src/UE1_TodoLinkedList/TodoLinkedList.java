package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***
  private Node first;
  private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        Node newNode = new Node(todoText, null);
        Node currentNode = first;
        if (first == null) {
            first = newNode;
        } else {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void deleteLastTodoText() {
       Node currentNode = first;
       if (first == null) {
           return;
       } else if (first.getNext() == null){
           first = null;
       } else {
           while (currentNode.getNext().getNext()!=null) {
               currentNode = currentNode.getNext();
           }
           currentNode.setNext(null);
       }
    }

    public String getTodoTextAtIndex(int index) {
        Node currentNode = first;

        if (first == null) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
                if (currentNode == null) {
                    return null;
                }
            }
        }
        return currentNode.getTodoText();
    }
}
