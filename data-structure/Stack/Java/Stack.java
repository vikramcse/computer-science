class Stack {
	private int[] arr;
	private int size;
	private int top;

	public Stack(int size) {
		arr = new int[size];
		this.size = size;
		this.top = -1;
	}

	public int getSize() {
		return arr.length;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void getTop() {
		System.out.println("top " + arr[top]);
	}

	public boolean isFull() {
		return top == size -1;
	}

	public void push(int data) {
		if(!isFull()) {
			top++;
			arr[top] = data;
		}
	}

	public void pop() {
		if (!isEmpty()) {
			int removed = arr[top--];
			System.out.println("popped element is " + removed);
		}
	}
}