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
    	System.out.println("我的id"+a.id);
    	System.out.println("我的密码是"+a.password);
    	System.out.println("我的email地址是"+a.email);
    	
    	
    }
}
