/**
 * ����if��ѡ����ṹ
 * @author Van.G
 *
 */
public class TestIf {
	public static void main(String[]args) {
		double d=Math.random();//���ص�������ҿ�����
		System.out.println(d);
		//int i=(int)(6*Math.random()+1);
		//System.out.println(d);
		//int i=(int)(6*Math.random()+1);
		//if(i<=3) {
			//System.out.println("С");
			
		//}
		int i=(int)(6*Math.random())+1;
		int  j=(int)(6*Math.random())+1;
		int k=(int)(6*Math,random())+1;
		int count=i+j+k;
		//�����������ֽ�д���15����������
		if(count>15) {
			Sustem.out.println("�������������");}
		if(count>=10&&count <=15) {
			System.out.println("�����������һ���");}
		if(count<10) {
			System.out.println("�������������ô������");}
		System.out.println("����"+count+"��");
	}
}
