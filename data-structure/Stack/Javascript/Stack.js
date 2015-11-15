var Stack = function() {
	this.array = [];
	this.top = -1;
};

Stack.prototype.empty = function() {
	return this.top == -1;
};

Stack.prototype.getTop = function() {
	console.log(this.array[this.top]);
};


Stack.prototype.push = function(data) {
	this.top = this.top + 1;
	this.array.push(data);
};

Stack.prototype.display = function() {
	var len = array.length;
	for (var i = len - 1; i >= 0; i--) {
		console.log(array[i]);
	}
};

Stack.prototype.pop = function() {
	if(!this.empty()) {
		this.array.pop();
		this.top = this.top - 1;
	} else {
		console.log("Stack is empty can not remove");
	}
};

var stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);

stack.getTop();

stack.pop();
stack.pop();

stack.getTop();

