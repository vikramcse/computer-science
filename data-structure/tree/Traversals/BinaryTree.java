import java.util.*;

public class BinaryTree {
  public void preOrderRecursive(Node root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrderRecursive(root.left);
      preOrderRecursive(root.right);
    }
  }
  
  public void InOrderRecursive(Node root) {
    if (root != null) {
      InOrderRecursive(root.left);
      System.out.print(root.data + " ");
      InOrderRecursive(root.right);
    }
  }
  
  public void inorder(Node root) {
    Stack<Node> st = new Stack<Node>();
    
    while(true) {
      while(root != null) {
        st.push(root);
        root = root.left;
      }
      
      if (st.isEmpty()) {
        break;
      }
      
      root = st.pop();
      System.out.print(root.data + " ");
      root = root.right;
    }
  }
  
  public void preorder(Node root) {
    Stack<Node> st = new Stack<Node>();
    
    while(true) {
      while(root != null) {
        System.out.print(root.data + " ");
        st.push(root);
        root = root.left;
      }
      
      if (st.isEmpty()) {
        break;
      }
      
      root = st.pop();
      root = root.right;
    }
  }
  
  public void levelOrder(Node root) {
    Queue<Node> Q = new LinkedList<Node>();
    
    if (root == null)
      return;
    
    Q.add(root);
    
    while(!Q.isEmpty()) {
      Node temp = Q.remove();
      System.out.print(temp.data + " ");
      
      if (temp.left != null)
        Q.add(temp.left);
      
      if (temp.right != null)
        Q.add(temp.right);
    }
  }
  
  public static void main(String args[]) {
    Node root = new Node(10);
    Node l = new Node(20);
    Node r = new Node(30);
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(4);
    
    root.left = l;
    root.right = r;
    l.left = one;
    l.right = two;
    two.left = three;
    r.right = four;
    
    new BinaryTree().levelOrder(root);
    //System.out.println();
    //new BinaryTree().InOrderRecursive(root);
    //System.out.println(root.left);
  }
}

class Node {
  int data;
  Node left;
  Node right;
  
  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
  
  public String toString() {
    return this.data+"";
  }
}