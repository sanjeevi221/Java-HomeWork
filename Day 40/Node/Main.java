package node;

public class Main 
{
    public static void main(String[] args)
    {
        SinglyLinkedlist sc = new SinglyLinkedlist();
        
        sc.insert(23);
        sc.insert(34);
        sc.insert(56);
        sc.insert(12);
        sc.insert(36);
        sc.insert(67);
        
        sc.display();
        System.out.println("");
        
        sc.delete(12);
        System.out.println("Deleted");
        
    }
}
