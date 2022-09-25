package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

/* 【集合式物件導向】範例名為:Object_Collection */
public class Object_Collection {

	public static void main(String[] args) {
		/**
		 * ArrayList----->可重複，沒順序。
		 * HashSet------->不重複，隨機排序。
		 * TreeSet------->不重複，有排序。
		 * PriorityQueue->可重複，有排序。
		 * TreeSet & PriorityQueue因都為【有順序】,要找Object索引來做排序規則，所以要在【entity'class(class Meal)實作Comparable<T>之方法(以下有方法說明)】。
		**/
	System.out.println("============ArrayList======================");
	     ArrayList<Meal> al=new ArrayList();
	     al.add(new Meal("鍋燒麵",65,2));
	     al.add(new Meal("魚片鍋燒",75,1));
	     al.add(new Meal("鍋燒麵",65,2));
	     al.add(new Meal("什錦鍋燒",90,1));
	     for(Meal pal:al) {pal.show();}
	System.out.println("=============HashSet=====================");
		 HashSet<Meal> hs=new HashSet();
		 hs.add(new Meal("鍋燒麵",65,2));
		 hs.add(new Meal("魚片鍋燒",75,1));
		 hs.add(new Meal("鍋燒麵",65,2));
		 hs.add(new Meal("什錦鍋燒",90,1));
	     for(Meal phs:hs) {phs.show();}
	System.out.println("=============TreeSet=====================");
		 TreeSet<Meal> ts=new TreeSet();
		 ts.add(new Meal("鍋燒麵",65,2));
		 ts.add(new Meal("魚片鍋燒",75,1));
		 ts.add(new Meal("鍋燒麵",65,2));
		 ts.add(new Meal("什錦鍋燒",90,1));
	     for(Meal pts:ts) {pts.show();}
    System.out.println("=============PriorityQueue=====================");
    	 PriorityQueue<Meal> ps=new PriorityQueue();
    	 ps.add(new Meal("鍋燒麵",65,2));
    	 ps.add(new Meal("魚片鍋燒",75,1));
    	 ps.add(new Meal("鍋燒麵",65,2));
		 ps.add(new Meal("什錦鍋燒",90,1));
	     for(Meal pps:ps) {pps.show();}
	     
		
	}
	
}

/* 建立一個物件為Meal */
class Meal implements Comparable<Meal>{
	
	private String name;
	private int price;
	private int amount;
	private int sum;
	
	public Meal(String name, int price, int amount)
	{
		this.name = name;
		this.price = price;
		this.amount = amount;
		sum = price*amount;	
	}
	
	void show() {
		System.out.println("餐點:"+name+
							"\t價格:"+price+
							"\t數量:"+amount+
							"\t總金額:"+sum+"元");
	}

	@Override
	public int compareTo(Meal o) {
		//return o.sum-this.sum; //-->(以sum由大到小。)
		return this.sum-o.sum; //-->(以sum由小到大。)
	}
}
	
		
	

