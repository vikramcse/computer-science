var Node = function(data) {
	this.data = data;
	this.next = null;
};

var SinglyLL = function() {
	this.len = 0;
	this.head = null;
	this.tail = null;
};

SinglyLL.prototype.add = function(data) {
	var newNode = new Node(data);
	// Empty LL
	if(this.head === null) {
		this.head = this.tail = newNode;
		this.len = 1;
	} else 
		this.tail.next = newNode;
	this.tail = newNode;
	this.len++;
};

SinglyLL.prototype.addFront = function(data) {
	// 1. create new node
	// 2. Assign new node next to the current head
	// 3. Then new node to head

	var newNode = new Node(data);
	newNode.next = this.head;
	this.head = newNode;
};

SinglyLL.prototype.remove = function() {
	// 1. Check for empty node
	// 2. Go up to the last node
	// 3. Keep track the prev node
	// 4. Assign next of prev to null
	// 5. Output the deleted node

	if(this.head == null) {
		console.log("cant remove! Linked List is empty.");
	} else {
		var temp = this.head;
		var prev = null;
		while(temp.next !== null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

};

SinglyLL.prototype.display = function() {
	var temp = this.head;
	var output ='';
	while(temp !== null) {
		output = output + temp.data + " -->";
		temp = temp.next;
	}
	console.log(output + " null");
};

var list = new SinglyLL();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.addFront(100);
list.display();
list.remove()
list.display();