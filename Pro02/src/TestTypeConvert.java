/**
 * 测试类型转化
 * @author Van.G
 *
 */
public class TestTypeConvert {
public static void main(String[]args) {
	int a=324;
	long b=a;
	double d=b;
	a=b;//不能做自动转化
	long e=3.23F;//错误
	float f=234324L;
	//特例
	byte b2=1230;//超过范围了，不能转化
	//容量小的向容量大的转化
}
}
