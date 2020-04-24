
public class StackofObjects {

	private int stackSize; 
	private Person[] arrStack; // array for stack of longs
	private int top; // top of stack
	
	// constructor
	public StackofObjects(int stackSize)
	{
		this.stackSize = stackSize; 
		this.arrStack = new Person[stackSize]; // initialize arrstack
		this.top = -1;  // no items, at one top = 0
	}
	
	// push function
	public void push(Person pushedElement) // add items to top of stack
	{
		if(!isFull()) { // check if it's full
			top++; // increment top
			arrStack[top] = pushedElement;
			System.out.println("Push(Person)"); 
			pushedElement.displayPerson();
		}
		else {
			System.out.println("Stack is full"); 
		}
	}
	
	
	// pop function
	public Person pop()	//return the top item
	{
		int returned;  
		if(!isEmpty())
		{
			returned = top; 
			top--; 
			System.out.println("pop(Person)"); 
			arrStack[returned].displayPerson();
			return arrStack[returned];
		}
		else
		{
			System.out.println("Stack is empty"); 
			return null; 
		}
	}
	
	// peek, look but not remove top
	public Person peek()
	{
		if(!this.isEmpty()) {
			System.out.println("peek(Person)"); 
			arrStack[top].displayPerson();
            return arrStack[top];
		}
		else
		{
            System.out.println("Stack is Empty");
            return null;
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
		return (top == stackSize -1); //max size reached return true
	}
	
	// stack size
	public void size()
	{
		System.out.printf("There are %d elements in the Stack\n",top + 1);
	}
}

