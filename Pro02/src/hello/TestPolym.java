package hello;
/**
 * ���Զ�̬
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
        System.out.println("����һ����");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("��������");
    }
    public void seeDoor() {
        System.out.println("������....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("����������");
    }
}