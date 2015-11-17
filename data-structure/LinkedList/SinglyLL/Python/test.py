from SinglyLL import SinglyLL

s = SinglyLL()
s.add(1)
s.add(2)
s.add(3)
s.add(4)
s.add_front(9)
print "before remove"
s.display()
s.remove_front()
print "after remove"
s.display()