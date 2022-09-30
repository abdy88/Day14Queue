package bl.com.queue;

public class Main {
	
	QueueOperations obj2 = new QueueOperations();
	

	public static void main(String[] args) {
	
		QueueOperations obj2 = new QueueOperations();
		
//		UC1
		obj2.enqueue(56);
		obj2.enqueue(30);
		obj2.enqueue(70);
		obj2.display1();
		
//		UC2
		System.out.println("dequeue from the beginning");
		obj2.dequeue();
		obj2.display1();
		System.out.println("again dequeue from the beginning");
		obj2.dequeue();
		obj2.display1();
		
		System.out.println("----End of Program-----");
	
	}
	
	

}
