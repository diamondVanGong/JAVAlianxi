package hello;
/**
 * 测试方法的基本使用
 * @author Van.G
 *
 */
public class TestMethod {
    public static void main(String[]args) {
    	//必须要通过对象调用普通的方法
    	TestMethod tm=new TestMethod();
    	tm.printSxt();
    	tm.printSxt();
    	tm.add(30, 40, 50);
    	int c=tm.add(30, 40, 50)+1000;
    	System.out.println(c);
    }
    void printSxt() {
    	System.out.println("北京尚学堂...");
    	System.out.println("上海尚学堂！");
    	System.out.println("广州尚学堂！！");
    	
    }
    int add(int a,int b,int c) {//不能是void
    	int sum=a+b+c;
    	System.out.println(sum);
    	return sum;
    	//return有两个作用1：结束方法的运行，2返回值
    }
}
