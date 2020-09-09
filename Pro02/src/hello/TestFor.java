package hello;
/**
 * 测试for循环
 * @author Van.G
 *
 */
public class TestFor {
    public static void main(String[]args) {
    	int sum=0;
    	for(int i=0;i<=100;i++) {
    		sum=sum+i;
    		
    	}
    	System.out.println(sum);
    	//初始化语句，条件判断，执行循环体，
    	//1.执行初始化语句：i=1
    	//2判断i<=100
    	//3执行循环体
    	//4步进迭代i++
    	//5回到第二部继续判断
    	System.out.println(sum);
    	//在while循环当中都有，但是for循环都是组合在一起了
    }
}
