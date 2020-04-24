
public class Person {
	
	// member variables 
	private String lastName; 	// first name
	private String firstName; 	// last name
	private int age; 		//age

	//constructor 
	public Person(String firstName, String lastName, int age)
	{
		 this.firstName = firstName; 
		 this.lastName = lastName; 
		 this.age = age; 
	}
	// empty constructor 
	public Person()
	{
		
	}
	
	//getters for private members 
	public String getLast() {return lastName;}
	public String getFirst() {return firstName;}
	public int getAge() {return age;}
	
	//setters for private members
	public void setLast(String lastName) {this.lastName = lastName;}
	public void setFirst(String firstName) {this.firstName = firstName;}
	public void setAge(int age) {this.age = age;}
	
	public void displayPerson()
	{
		System.out.printf("Name: %s %s\nAge: %d\n", firstName, lastName, age);
	}
	
	
}
