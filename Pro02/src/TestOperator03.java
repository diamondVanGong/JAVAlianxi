/**
 * l�߼������
 * @author Van.G
 *
 */
public class TestOperator03 {
 public static void main(String[]args) {
	 boolean b1=true;
	 boolean b2=false;
	 System.out.println(b1&b2);//false
	 System.out.println(b1|b2);//true
	 System.out.println(b1^b2);//true
	 System.out.println(!b2);//true
	 //���Զ�·
	 int c=3/0;//ArithmeticEXception
	 boolean b3=1>2&2<(3/0);//������ʵ���Ǽ�����
	 boolean b4=1>2&&2<(3/0);//�����false,û�м���
	 //��·�룬��һ����������ֵΪfalse����Ҫ�ټ��������Ĳ�������
	 
	 
	 
 }
}
