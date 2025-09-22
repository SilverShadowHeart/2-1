the queue interface is a part of java.util package and extends the collections interface it stores and processes the data in an order where elements are added at the rear and removed from the front 

key features 
fifo order elemnts are processed in the order they were inserted first in first out 

no random access unlike list elements cannot be accessed directly by index

multiple variants  



declaration of queues
Queue<obj> queue = new LinkedList<obj>();

remove removes and returns the element at the front of the queue if the queue is empty it throws and exception 

poll removes and returns the element at the front of the queue if the queue is empty it returns null

element returns the element at the front of the queue without removing it if the queue is empty it throws and exception

peek returns the element at the front of the queue without removing it if the queue is empty it returns null

size ??