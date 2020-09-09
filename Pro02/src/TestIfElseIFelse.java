/**
 * TestIFleseifelse
 * @author Van.G
 *
 */
public class TestIfElseIFelse {
      public static void main(String[]args) {
    	  int score = (int) (100 * Math.random());
          System.out.print("成绩是是" + score );
          if (score < 60) {
              System.out.println("等级D");
          } else if (score < 70) {
              System.out.println("等级C");
          } else if (score < 80) {
              System.out.println("等级B");
          } else if (score < 90) {
              System.out.println("等级A");
          }
      }
}
