package node;

public class SinglyLinkedlist
{
     Node head;

    // Insert at end
    void insert(int Data) {
        Node newNode = new Node(Data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    void delete(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.Data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.Data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedlist list = new SinglyLinkedlist();

        int elements[] = {25, 32, 45, 6, 24, 52};

        for (int e : elements)
            list.insert(e);

        list.delete(6);

        System.out.println("Final Linked List:");
        list.display();
    }
}