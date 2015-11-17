class SinglyLL {
    
   private class Node {
       private int data;
       private Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    private int N;
    private Node head;
    
    public int getSize() {
        return N;
    }
    
    // Add a new element to LL
    public void add(int data) {
        // Check if the LL is empty
        if (head == null) {
            head = new Node(data);
            N = 1;
        }
        // Traverse up to the end of the LL and append the new node at the end
        else {
            // create a temporary node
            // copy it as a head
            Node temp = head;
            
            // now traverse until node.next = null found
            while(temp.next != null) {
                temp = temp.next;
            }
            
            // create a new node and initialize it with current data
            Node newNode = new Node(data);
            
            // now the temp point to the end of the LL
            // so temp.next should be the new node
            temp.next = newNode;
            N++;
        }
    }
    
    public void removeFirst() {
        if(head != null) {
            // copy the head to temp node 
            // in case if we want to return the deleted element
            Node temp = head;
            // then assign head as next node to head
            head = head.next;
            N--;
        }
    }
    
    public void removeLast() {
        // go upto the end of LL
        if (head != null) {
            Node temp = head;
            Node previous = temp;
            
            // now traverse until node.next = null found
            while(temp.next != null) {
                previous = temp; // for keeping track of previous element
                temp = temp.next;
            }
            
            previous.next = null;
            N--;
        }
    }
    
    public void addFirst(int data) {
        if (head != null) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String ss[]) {
        SinglyLL list = new SinglyLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.printLL();
        
        list.addFirst(8);
        
        list.printLL();
        
    }
}