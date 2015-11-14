class Stack(object):
	def __init__(self):
		self.items = []

	def getSize(self):
		return self.len(items)

	def isEmpty(self):
		return getSize() == 0

	def push(self, data):
		self.items.append(data)

	def pop(self):
		self.items.pop()

	def peek(self):
		return self.items[getSize() - 1]

	def display(self):
		print "top"
		for i in self.items[::-1]:
			print i
