package hello;

public class TestThis {
	 int count=9;
	    public void count1(){
	        count=10;
	        System.out.print("count1="+count);
	    }
	    public void count2(){
	        System.out.print("count2="+count);
	    }
	    public static void main(String[ ] args) {
	        TestThis t=new TestThis();
	        t.count1();
	        t.count2();
	    }
}
