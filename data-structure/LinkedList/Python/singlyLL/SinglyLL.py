# A Node class which has a constructor
# accepts data and next pointer
class Node(object):
	def __init__(self, data, next):
		self.data = data
		self.next = next

class SinglyLL(object):
	# head and tail initially points to None
	head = None
	tail = None

	# Append data to LL
	def add(self, data):
		# Create a temporary node
		# If the head pointer is empty i.e LL is empty
		# Then head will be temprary node which has data
		# else add data to next to tail node

		node = Node(data, None) 
		if self.head is None:
		    self.head = self.tail = node
		else:
		    self.tail.next = node
		self.tail = node # IMP! and assign back that node to tail

	def add_front(self, data):
		node = Node(data, None)
		if self.head is None:
			self.head = node
		else:
			node.next = self.head
		self.head = node

	def remove(self):
		# go to the last node
		# and keep traking the prev node
		# then assign prev node's next to None

		if self.head is None:
			print "list is empty, can't remove"
			pass
		else:
			temp_node = self.head
			prev_node = None
			while temp_node.next is not None:
				prev_node = temp_node
				temp_node = temp_node.next
			prev_node.next = None

	def remove_front(self):
		# store head pointer to temp node
		# then temp node next to its next
		# and head to temp node (which has moved to next)

		temp_node = self.head
		if self.head is None:
			print "list is empty, can't remove"
			pass
		else:
			temp_node = temp_node.next
			self.head = temp_node

	def display(self):
		temp_node = self.head
		while temp_node is not None:
		    print temp_node.data, " -> ",
		    temp_node = temp_node.next
		print None
