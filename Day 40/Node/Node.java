package node;

public class Node 
{
    int Data;
    Node next;

    public Node(int Data, Node next) {
        this.Data = Data;
        this.next = null;
    }

    Node(int Data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
