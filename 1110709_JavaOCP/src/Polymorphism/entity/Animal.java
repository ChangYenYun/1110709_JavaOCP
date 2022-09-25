package Polymorphism.entity;

//父類別為以下"Animal"
public abstract class Animal {
	
	//field
	private String name;
	
    //constructor
	public Animal(String name) {
		this.name = name;
	}
	
	
	//method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public abstract void eat() ;
    
	public abstract void talk() ;
	
}
	
	
