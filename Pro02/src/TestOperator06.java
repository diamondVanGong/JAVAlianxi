/**
 * �������������Ԫ�������
 * @author Van.G
 *
 */
public class TestOperator06 {
	public static void main(String[]args) {
		int score=80;
		int x=-100;
		String type=score<60?"������":"����";
		System.out.println(type);//����
		if(score<60) {
			System.out.println("������");
		}else {
			System.out.println("����");
			
		}//����ʵ���ϲ���д�����µ���ô���ӵı��ʽ
		System.out.println(x>0?1:(x==0?0:-1));//-1
	}
}
