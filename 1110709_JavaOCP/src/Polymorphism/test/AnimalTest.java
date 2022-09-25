/**
"繼承->多型"的2大優點:
1.維護性:新增物種不用動到原程式、自動体醒必要屬性與功能。
2.可讀性:關係性分類讓程式容易理解。
 **/

package Polymorphism.test;

import Polymorphism.entity.Animal;
import Polymorphism.entity.Bird;
import Polymorphism.entity.Cat;

public class AnimalTest {
public static void main (String[]args) { 
	
	/*動物共同的功能顯示出來*/
Animal[] animals = new Animal[] {new Cat("貓"),new Bird("鳥","翅膀")};//"貓跟鳥"雖為不同物種，但為同型態"Animal"，所以可用陣列集合起來。
//再用loop快速走訪Animal
for(Animal animal:animals) {
	System.out.print(animal.getName()+":");
	animal.talk();
	System.out.print(",");
	animal.eat();
	System.out.print("\n");
}
/*動物特殊技能*/
Cat cat = new Cat("美短貓");
System.out.print(cat.getName()+":");
System.out.print(cat.scratch(" tree"));
System.out.print("\n");

Bird bird = new Bird("鸚鵡","一對翅膀");
System.out.print(bird.getName()+":");
bird.sing();
System.out.print("，還有"+bird.getWing()+"可");
bird.fly();


}
}
