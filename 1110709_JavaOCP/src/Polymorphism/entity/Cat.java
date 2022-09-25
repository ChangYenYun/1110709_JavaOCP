//繼承備註請看"Bird.java"。
package Polymorphism.entity;

public class Cat extends Animal{
	
	
	public Cat(String name) {
		super(name);
	}

	
	
	@Override
	public void eat() {
		System.out.print("吃罐罐");
		
	}

	@Override
	public void talk() {
		System.out.print("喵喵叫");
	}
	
	
	
	public  String scratch (String object) {
		return "scratch"+object;
	}
	

}
