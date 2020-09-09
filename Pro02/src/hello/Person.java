package hello;

public class Person {
   int age;
   String name;
  public  Person(int age,String name){
	   this.age=age;
	   this.name=name;
   }
  void display(int age,String name) {
	  System.out.println("我的名字是"+name+"我的年龄是:"+age);
  }
  public static void main(String[]args) {
	  Person a=new Person(18,"张三");
	  a.display(19, "李四");
	  
  }
}
