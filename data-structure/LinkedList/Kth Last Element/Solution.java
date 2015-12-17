class Solution {
    private int N;
    private Node head;
    
    private class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    public int getSize() {
        return N;
    }
    
    public void add(int data) {
        if(head == null) {
           head = new Node(data);
           N = 1;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            N++;
        }
    }
    
    public void getElementFromLast(int k) {
        Node temp = head;
        int fromHead = getSize() - k;
        int c = 0;
        
        while(temp != null) {
            if (c  != fromHead) {
                temp = temp.next;
                c++;
            }
            else {
                System.out.println("The element from last " + k + " is " + temp.data);
                break;
            }
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
        Solution list = new Solution();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.printLL();
        list.getElementFromLast(3);
    }
}