class Node {
 	int data;
	Node next;

	public Node(int data) {
	    this.data = data;
	}
}

class Solution {
	static Node headForReverse;

	public static void main(String ss[]) {
		Node head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);

		head.next = two;
		two.next = three;
		three.next = four;

		//Solution.display(head);
		//Solution.reverseLinkedList(head);
		Solution.reverseLinkedListRecursive(head);
		Solution.display(headForReverse);
	}

	public static void reverseLinkedList(Node head) {
		// 1. Non Recursive method

		Node current = head;
		Node prev = null;
		Node next;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		System.out.println();
		display(prev);
	}

	public static void reverseLinkedListRecursive(Node current) {
		// 1. Recursive approach to reverse LL
		
		if(current == null)
			return;

		if(current.next == null) {
			headForReverse = current;
			return;
		}

		reverseLinkedListRecursive(current.next);
		Node q = current.next;
		q.next = current;
		current.next = null;
	}

	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.print("null");
	}
}