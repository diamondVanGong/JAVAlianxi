package hello;

public class TestSuper02 {
public static void main(String[]args) {
	System.out.println("开始创建一个childclass的对象");
	new ChildClass2();
}
}
class FatherClass2{
	public FatherClass2() {
		System.out.println("创建Fatherclass");
	}
}
class ChildClass2 extends FatherClass2{
	public ChildClass2() {
		System.out.println("创建ChildClass");
	}
}
