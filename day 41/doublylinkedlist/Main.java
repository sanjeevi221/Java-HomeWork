package doublylinkedlist;

public class Main
{
     public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        // Insert elements
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(40);
        list.insertEnd(50);

        // Insert 30 at position 3
        list.insertAtPosition(30, 3);

        // Display final list
        list.display();
    }
}
