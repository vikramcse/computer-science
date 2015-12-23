class FindMiddle {
    private int N;
    private Node head;
    
    private class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
        }
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
    
    public void findMiddle() {
        Node fast = head;
        Node slow = head;
        
        while(fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        System.out.println(slow.data);
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
        FindMiddle list = new FindMiddle();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.printLL();
        
        list.findMiddle();
    }
}