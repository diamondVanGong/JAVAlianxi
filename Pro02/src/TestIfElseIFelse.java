/**
 * TestIFleseifelse
 * @author Van.G
 *
 */
public class TestIfElseIFelse {
      public static void main(String[]args) {
    	  int score = (int) (100 * Math.random());
          System.out.print("�ɼ�����" + score );
          if (score < 60) {
              System.out.println("�ȼ�D");
          } else if (score < 70) {
              System.out.println("�ȼ�C");
          } else if (score < 80) {
              System.out.println("�ȼ�B");
          } else if (score < 90) {
              System.out.println("�ȼ�A");
          }
      }
}
