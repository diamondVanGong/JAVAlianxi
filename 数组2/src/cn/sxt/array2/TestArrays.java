package cn.sxt.array2;

import java.util.Arrays;

/**
 * ����java.util.Arrays�������ʹ��
 * @author Van.G
 *
 */
public class TestArrays {
    public static void main(String[]args) {
    	int[]a= {100,5,150,80,200,20,30};
    	System.out.println(a);
    	System.out.println(Arrays.toString(a));
    	Arrays.sort(a);
    	System.out.println(Arrays.toString(a));
    	//�Զ�������Ҫcomparable�Ľӿ�
    	System.out.println(Arrays.binarySearch(a, 30));
    	
    	
    	
    }
    
}
