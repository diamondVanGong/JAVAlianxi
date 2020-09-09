package hello;
import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100;//小球的横坐标
	double y=100;//小球的纵坐标
	double degree=3.14/3;//弧度，此处就是60度
	//花窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被花了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>500-40-30||y<40+40) {//500是窗口的高度，40是桌子的边框，30是球的直径，，最后一个40是标题栏的高度，
			degree=-degree;
		}
		if(x<40||x>856-40-30) {
			degree=3.14-degree;}
		
	}
	
	//窗口加载的方法
	void launchaFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1秒相当于1000毫秒，大约一秒要话20次窗口
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	//main方法是程序执行的入口
public static void main(String[]args) {
	System.out.println("我是尚学堂的Van.G,这个游戏的项目让大家体验编程的快感");
	BallGame game=new BallGame();
	game.launchaFrame();
	
	
}
}
