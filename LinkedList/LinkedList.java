public class LinkedList {
    public static class Node{
        int data;
        Node next;
public Node(int data){
     this.data = data; 
     this.next = null; 
     }

     }
     public static Node head;
     public static Node tail;
     
     public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }// add last
     public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
     }// print linked list
     public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
     }// add at index
     public void add(int idx,int data){
        if(idx == 0){ 
            addFirst(data); 
            return; } 
            Node newNode = new Node(data); 
            Node temp = head; 
            int i = 0; 
            while(i < idx-1){ 
                temp = temp.next; 
                i++;
                 }
     
                 newNode.next = temp.next; 
                 temp.next = newNode;
     }// remove first
                 public int removefirst(){
                    if(head == null){
                        System.out.println("Linked list is empty");
                        return -1;
                    }else if(head == tail){
                        int val = head.data;
                        head = tail = null;
                        return val;
                    }
                    int val = head.data;
                    head = head.next;
                    return val;
                 }// remove last
                 public int removeLast(){
                    if(head == null){ 
                        System.out.println("Linked list is empty");
                        return -1;
                    }else if(head == tail){
                        int val = head.data;
                        head = tail = null;
                        return val;
                    }
                    Node temp = head;
                    while(temp.next != tail){
                        temp = temp.next;
                    }
                    int val = tail.data;
                    temp.next = null;
                    tail = temp;
                    return val;
                 }// remove at index
                 public int search(int key){
                    Node temp = head;
                    int i = 0;
                    while(temp != null){
                        if(temp.data == key){
                            return i;
                        }
                        temp = temp.next;
                        i++;
                    }
                    return -1;
                 }// search recursively
                    public int searchRecHelper(Node head, int key){
                        if(head == null){
                            return -1;
                        }
                        if(head.data == key){
                            return 0;
                        }
                        int idx = searchRecHelper(head.next, key);
                        if(idx == -1){
                            return -1;
                        }
                        return idx+1;
                    }// search recursively
                 public int searchRec(int key){
                    return searchRecHelper(head, key);
                 }// reverse linked list
                 public void reverse(){
                    Node prev = null;
                    Node curr = head;
                    Node next;
                    while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                    }
                    tail = head;
                    head = prev;
                 }// palindrome
                 public boolean isPalindrome(){
                    Node slow = head;
                    Node fast = head;
                    while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                    }
                    Node prev = null;
                    Node curr = slow;
                    Node next;
                    while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                    }
                    Node left = head;
                    Node right = prev;
                    while(right != null){
                        if(left.data != right.data){
                            return false;
                        }
                        left = left.next;
                        right = right.next;
                    }
                    return true;
                 }// cycle detection
                 public static boolean isCycle(){
                    Node slow = head;
                    Node fast = head;
                    while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                        if(slow == fast){
                            return true;
                        }
                    }
                    return false;
                 }
                 public static void removeCycle(){
                    Node slow = head;
                    Node fast = head;
                    boolean cycle = false;
                    while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                        if(slow == fast){
                            cycle = true;
                            break;
                        }
                    }
                    if(cycle == false){
                        return;
                    }
                    slow = head;
                    Node prev = null;
                    while(slow != fast){
                        prev = fast;
                        slow = slow.next;
                        fast = fast.next;
                    }
                    prev.next = null;
                 }// merge sort
                 public Node getMid(){
                    Node slow = head;
                    Node fast = head;
                    while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                    }
                    return slow;
                 }
                 private Node merge(Node head1, Node head2){
                    Node mergedLL = new Node(-1);
                    Node temp = mergedLL;
                    while(head1 != null && head2 != null){
                        if(head1.data <= head2.data){
                            temp.next = head1;
                            head1 = head1.next;
                            temp = temp.next;
                        }
                        else{
                            temp.next = head2;
                            head2 = head2.next;
                            temp = temp.next;
                        }
                    }
                    while(head1 != null){
                        temp.next = head1;
                        head1 = head1.next;
                        temp = temp.next;
                    }
                    while(head2 != null){
                        temp.next = head2;
                        head2 = head2.next;
                        temp = temp.next;
                    }
                    return mergedLL.next;
                 }
                 public Node mergesort(Node head){
                    if(head == null || head.next == null){
                        return head;
                    }
                    Node mid = getMid();
                    Node rightHead = mid.next;
                    mid.next = null;
                    Node newLeft = mergesort(head);
                    Node newRight = mergesort(rightHead);
                    return merge(newLeft, newRight);
                 }
                 public void zigZag(){
                    Node slow= head;
                    //boolean leftToRight = true;
                    Node fast = head.next;
                    while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                    }
                    Node mid = slow;
                    Node curr = mid.next;
                    mid.next = null;
                    Node prev = null;
                    Node next;
                    while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                    }
                    Node left = head;
                    Node right = prev;
                    Node nextL, nextR;
                    while(left != null && right != null){
                        nextL = left.next;
                        left.next = right;
                        nextR = right.next;
                        right.next = nextL;
                        left = nextL;
                        right = nextR;
                    }

                 }




     


     public static void main(String[]args){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
       
         }

     }

