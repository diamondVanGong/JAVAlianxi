package hello;

public class Person {
   int age;
   String name;
  public  Person(int age,String name){
	   this.age=age;
	   this.name=name;
   }
  void display(int age,String name) {
	  System.out.println("�ҵ�������"+name+"�ҵ�������:"+age);
  }
  public static void main(String[]args) {
	  Person a=new Person(18,"����");
	  a.display(19, "����");
	  
  }
}
