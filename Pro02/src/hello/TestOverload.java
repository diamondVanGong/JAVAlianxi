package hello;
/**
 * ���Է���������
 * 
 * @author Van.G
 *
 */
public class TestOverload {
	public static void main(String[] args) {
        System.out.println(add(3, 5));// 8
        System.out.println(add(3, 5, 10));// 18
        System.out.println(add(3.0, 5));// 8.0
        System.out.println(add(3, 5.0));// 8.0
        // �����Ѿ������ķ���������
        System.out.println();// 0������
        System.out.println(1);// ������1��int
        System.out.println(3.0);// ������1��double
    }
    /** ��͵ķ��� static������ã�*/
    public static int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    // ��������ͬ������������ͬ����������
    public static int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }
    // ��������ͬ���������Ͳ�ͬ����������
    public static double add(double n1, int n2) {
        double sum = n1 + n2;
        return sum;
    }
    // ��������ͬ������˳��ͬ����������
    public static double add(int n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
    //�������ֻ�з���ֵ��ͬ�������ɷ���������
    public static double add(int n1, int n2) {
        double sum = n1 + n2;
        return sum;
    }
    //�������ֻ�в������Ʋ�ͬ�������ɷ���������
    public static int add(int n2, int n1) {
        double sum = n1 + n2;         
        return sum;
    }   
}
