package bl.com.queue;

public class QueueOperations {

	LinkedListOperations obj1 = new LinkedListOperations();
	
	public void enqueue(int data1)
	{
		obj1.insertLast(data1);
		
		}
	
	
	 public void dequeue() {
	 
//		 while (obj1.head!=null)
		{
			obj1.removeFirst();
		}
	 					}
	
	
	 public void display1()
	{
		
		obj1.display();
	}
	
	
	
	
}
