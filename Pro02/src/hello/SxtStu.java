package hello;
/**
 * �໹�ж������ϰ
 * @author Van.G
 *
 */
public class SxtStu {
	//ֻ������û�з����ǽṹ��
  int id;
  String sname;
  int age;
  Computer comp;//�����
  void study() {
	  System.out.println("��������ѧϰ!"+comp.brand);
  }
 //����
  void play() {
	  System.out.println("����������ˣ");
  }
  //���췽�������ڴ��������Ķ����޲͵Ĺ��췢����������ϵͳ�Զ�����
  SxtStu(){
	  
  }
  public static void main(String[]args) {
  SxtStu stu=new SxtStu();
  stu.play();
  stu.id=1001;
  stu.sname="Van��G";
  stu.age=18;
  Computer c1=new Computer();
  c1.brand="����";
  stu.comp=c1;
  stu.play();
  stu.study();
  
  }

  
}
class Computer{
	  String brand;
}

