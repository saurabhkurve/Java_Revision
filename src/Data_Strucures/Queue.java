class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Dequeue operation
    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.front.data;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return data;
    }

    // Display operation
    public void display() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue after enqueuing 4 elements:");
        queue.display();

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue after dequeuing an element:");
        queue.display();
    }
}