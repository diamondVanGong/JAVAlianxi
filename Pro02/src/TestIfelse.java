/**
 * ����ifelse˫ѡ��ṹ
 * @author Van.G
 *
 */
public class TestIfelse {
      public static void main(String[]args) {
    	  int h=(int)(6*Math.random()+1);
    	  System.out.println(h);
    	  if(h<=3) {
    		  System.out.println("С");
    	  }else {
    		  System.out.println("��");
    	  }
    	  System.out.println("#######");
    	  //�������һ��[0.0, 4.0)����İ뾶�������ݰ뾶��Բ��������ܳ�
          double r = 4 * Math.random();
         //Math.pow(r, 2)��뾶r��ƽ��
          double area = Math.PI * Math.pow(r, 2);
          double circle = 2 * Math.PI * r;
          System.out.println("�뾶Ϊ�� " + r);
          System.out.println("���Ϊ�� " + area);
          System.out.println("�ܳ�Ϊ�� " + circle);
          //������>=�ܳ��������"������ڵ����ܳ�"����������ܳ��������
          if(area >= circle) {
              System.out.println("������ڵ����ܳ�");
          } else {
              System.out.println("�ܳ��������");
          }
      }
}
