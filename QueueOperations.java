package bl.com.queue;

public class QueueOperations {

	LinkedListOperations obj1 = new LinkedListOperations();
	
	void enqueue(int data1)
	{
		obj1.insertFirst(data1);
		
		}
	
	 void dequeue()
	{
		obj1.removeFirst();
		
	}
	
	
	 void display1()
	{
		
		obj1.display();
	}
	
	
	
	
}
