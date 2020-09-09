package hello;
/**
 * 类还有对象的练习
 * @author Van.G
 *
 */
public class SxtStu {
	//只有属性没有方法是结构体
  int id;
  String sname;
  int age;
  Computer comp;//计算机
  void study() {
	  System.out.println("我在认真学习!"+comp.brand);
  }
 //方法
  void play() {
	  System.out.println("我在认真玩耍");
  }
  //构造方法，用于创建这个类的对象，无餐的构造发方法可以由系统自动创建
  SxtStu(){
	  
  }
  public static void main(String[]args) {
  SxtStu stu=new SxtStu();
  stu.play();
  stu.id=1001;
  stu.sname="Van。G";
  stu.age=18;
  Computer c1=new Computer();
  c1.brand="联想";
  stu.comp=c1;
  stu.play();
  stu.study();
  
  }

  
}
class Computer{
	  String brand;
}

