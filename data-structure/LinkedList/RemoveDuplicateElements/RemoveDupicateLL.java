import java.util.*;

class RemoveDupicateLL {
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
    
    public void removeDuplicateBad() {
        Node temp1 = head;
        // First while loop is to keep track for each element
        while (temp1.next != null) {
            Node temp2 = temp1;
            // for this element compare with each element in the list
            while(temp2.next != null) {
                if (temp1.data == temp2.next.data) {
                    int dup = temp2.data; // if we want to print the dup data
                    temp2.next = temp2.next.next; // deletes the duplicate element
                }
                else {
                    temp2 = temp2.next;
                }
            }
            temp1 = temp1.next;
        }
    }
    
    public void removeDuplicateGood() {
        // Created a HashMap for keeping track dup elements
        // and once the element found dont put that element in Map
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Node temp = head;
        Node prev = null;
            
        // now traverse until node.next = null found
        while(temp != null) {
            if(map.containsKey(temp.data)) {
                prev.next = temp.next;
            }
            else {
                map.put(temp.data, true);
                prev = temp;
            }
            temp = temp.next;
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
    
    public static void main(String args[]) {
        RemoveDupicateLL list = new RemoveDupicateLL();
        
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);
        
        list.printLL();
        
        list.removeDuplicateBad();
        
        list.printLL();
    }
}