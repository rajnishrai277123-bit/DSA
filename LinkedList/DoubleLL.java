public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void removeLast(){
        if(tail == null){
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        if(head == tail){
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
    public int getSize(){
        return size;
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }


    public static void main(String[] args){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        System.out.println("Size: "+dll.getSize());
        dll.reverse();
        dll.print();
        
    }


    
}