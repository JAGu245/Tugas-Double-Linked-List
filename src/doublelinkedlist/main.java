package doublelinkedlist;

/**
 *
 * @author jagu
 */
public class main {
    public static void main(String[] args) {
        DoubleLinkedList doublelist = new DoubleLinkedList();
        
        doublelist.insertFirst("Adi", 4213, 3.2f);
        doublelist.insertLast("Dani", 4214, 4);
        doublelist.insertAt("Adi", "Dina", 4231, 4.0f);
        doublelist.print();
    }
}
