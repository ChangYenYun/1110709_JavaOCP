package Polymorphism.entity;

public class Bird extends Animal {
	
	
	private String wing;
	
	public Bird(String name) {
		super(name);// 子類別(Bird)執行父類別(Animal)的建構式須:super(引數);
		
	}

	public Bird(String name,String wing)//OverLoding(多載)
	{ 
		super(name);
		this.wing=wing;
	}


	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	@Override//"Override(覆寫)" 
	public void eat() {
		System.out.print("吃蟲子");	
	}

	@Override
	public void talk() {
		System.out.print("吱吱叫");	
	}

	public void sing() {
		System.out.print("唱歌");
	}
	
	public void fly() {
		System.out.print("飛行");
	}

	
	}
		

