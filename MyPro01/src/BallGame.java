
import  java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double  x=100;	//С��ĺ�����
	double  y=100; //С���������
	//�����ڵķ���
	public void paint(Graphics  g){
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
	}
	
	//���ڼ���
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
	}
	
	//main�����ǳ���ִ�е����
	public static void main(String[] args){
		System.out.println(" ������ѧ�ø�俣������Ϸ��Ŀ�ô�������̵Ŀ�У�Ԣ�����֣�");
		BallGame game = new BallGame();
		game.launchFrame();
	}
	
}
