package hello;
/**
 * ����ѭ����䵱�е�break
 * @author Van.G
 *
 */
public class TestBreak {
   public static void main(String[]args) {
	   //��100-150֮��Ĳ��ܱ�3�����������������ÿ�����5��
	   int count = 0;//���������
       for (int i = 100; i < 150; i++) {
           //�����3�ı���������������ѭ��������������һ��ѭ��
           if (i % 3 == 0){
               continue;
           }
           //���򣨲���3�ı��������������
           System.out.print(i + "��");
           count++;//û���һ��������������1
           //���ݼ������ж�ÿ���Ƿ��Ѿ������5����
           if (count % 5 == 0) {
               System.out.println();
           }
       }
}}
