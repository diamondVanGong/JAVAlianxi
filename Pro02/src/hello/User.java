package hello;

public class User {
    String id;
    String password;
    String email;
    User(String id,String password){
    	this.id=id;
    	this.password=password;
    	this.email=id+"@gameSchool.com";
    }
    User(String id,String password,String email){
    	this.id=id;
    	this.password=password;
    	this.email=email;
    }
    public static void main(String[]args) {
    	User a=new User("001","110");
    	System.out.println("�ҵ�id"+a.id);
    	System.out.println("�ҵ�������"+a.password);
    	System.out.println("�ҵ�email��ַ��"+a.email);
    	
    	
    }
}
