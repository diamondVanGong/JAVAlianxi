package hello;
/**
 * ���Է����Ļ���ʹ��
 * @author Van.G
 *
 */
public class TestMethod {
    public static void main(String[]args) {
    	//����Ҫͨ�����������ͨ�ķ���
    	TestMethod tm=new TestMethod();
    	tm.printSxt();
    	tm.printSxt();
    	tm.add(30, 40, 50);
    	int c=tm.add(30, 40, 50)+1000;
    	System.out.println(c);
    }
    void printSxt() {
    	System.out.println("������ѧ��...");
    	System.out.println("�Ϻ���ѧ�ã�");
    	System.out.println("������ѧ�ã���");
    	
    }
    int add(int a,int b,int c) {//������void
    	int sum=a+b+c;
    	System.out.println(sum);
    	return sum;
    	//return����������1���������������У�2����ֵ
    }
}
