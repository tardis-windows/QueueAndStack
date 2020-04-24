
public class Stacker {

	private int stackSize; 
	private int[] arrStack; // array for stack of longs
	private int top; // top of stack
	
	// constructor 
	public Stacker(int stackSize)  
	{
		this.stackSize = stackSize; 
		this.arrStack = new int[stackSize]; // initialize arrstack
		this.top = -1;  // no items, at one top = 0
	}
	
	// push function
	public void push(int pushedElement) // add items to top of stack
	{
		if(!isFull()) { // check if it's full
			top++; // increment top
			arrStack[top] = pushedElement;
			System.out.printf("Push(%d)\n", pushedElement); 
		}
		else {
			System.out.println("Stack is full"); 
		}
	}
	
	
	// pop function: adds items to the stack 
	public int pop()	//return the top item
	{
		int returned;  
		if(!isEmpty())
		{
			returned = top; 
			top--; 
			System.out.printf("pop(%d)\n", arrStack[returned]);
			return arrStack[returned];
		}
		else
		{
			System.out.println("Stack is empty"); 
			return -1; 
		}
	}
	
	// peek, look but not remove top
	public int peek()
	{
		if(!this.isEmpty()) {
			System.out.printf("peek(%d)...just peeking still in stack\n", arrStack[top]);
            return arrStack[top];
		}
		else
		{
            System.out.println("Stack is Empty");
            return -1;
		} 
	}
	
	// check if it's empty
	public boolean isEmpty()
	{
		return (top == -1); //returns true if top == -1
	}
	
	// check if stack is is full
	public boolean isFull()
	{
		return (stackSize -1 == top); //max size reached return true
	}
	
	// stack size
	public void size()
	{
		System.out.printf("There are %d elements in the Stack\n",top + 1);
	}
}

