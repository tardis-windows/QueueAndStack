
public class Queueing {

	private int arrSize; 
	private int arrQueue[]; 
	private int front; 
	private int rear; 
	private int currentSize = 0; 
	
	//constructor
	public Queueing(int arrSize)
	{
		this.arrSize = arrSize; 
		this.front = 0; 
		this.rear = -1; 
		this.arrQueue = new int[this.arrSize];
	}
	
	//enqueue adding elements to q
	public void enqueue(int elementIn)
	{
		if(isFull())
		{
			System.out.println("Queue is full"); 
		}else
		{ 
			if(rear == arrSize - 1)
				rear = -1; 
			
			arrQueue[++rear] = elementIn; 
			currentSize++; 
			System.out.println(elementIn + " added to the Queue");	
		}
	}
	
	// remove elements from Q
	public int dequeue() 
	{
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0; 
		}else {
	
			int temp = arrQueue[front++]; 
			if(front == arrSize)
				front = 0; 
				
			System.out.println(temp + " removed from queue"); 
			currentSize--; 
			return temp; 	
		}
	}
	
	public int peekFront()
	{
		System.out.println(arrQueue[front] + " peeking front"); 
		return arrQueue[front]; 
	}
	
	// check if queue is full 
	
	public boolean isFull()
	{
		if(currentSize == arrSize)
			return true; 
		return false; 
	}
	
	// check if queue is empty
	public boolean isEmpty()
	{
		if(currentSize == 0)
			return true; 
		return false; 
	}
	
	public void size()
	{
		System.out.printf("There are %d elements in the Queue\n", currentSize);
	}
}
