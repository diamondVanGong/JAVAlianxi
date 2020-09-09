package hello;
/**
 * 测试多态
 * @author Van.G
 *
 */
public class TestPolym {
	public static void main(String[]args) {
		Animal a=new Animal();
		animalCry(a);
		Dog d=new Dog();
		animalCry(d);
	}
	static void animalCry(Animal a) {
		a.shout();
	}

}
class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}