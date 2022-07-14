package UE4_BookingQueue;

public class BookingQueue {
    // *** Membervariablen ***
    private Node front;
    private Node rear;

    // *** Getter- und Setter-Methoden ***

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }


    // *** Operationen ***

    public void enqueue(Booking newBooking) {
        Node newNode = new Node(newBooking);

        if (front == null) {
           front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    public Booking dequeue() throws QueueEmptyException {
        Booking b;
        if (front == null) {
            throw new QueueEmptyException();
        } else if (front == rear) {
            b = front.getBooking();
            front = null;
            rear = null;
            return b;
        } else {
            b = front.getBooking();
            front = front.getNext();
            return b;
        }
    }

    public int getCount() {
        int counter = 0;
        Node current;
        current = front;

        while (current != null) {
            counter++;
            current = current.getNext();
        }
        return counter;
    }
}