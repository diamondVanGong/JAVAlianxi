package hello;
import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100;//С��ĺ�����
	double y=100;//С���������
	double degree=3.14/3;//���ȣ��˴�����60��
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>500-40-30||y<40+40) {//500�Ǵ��ڵĸ߶ȣ�40�����ӵı߿�30�����ֱ���������һ��40�Ǳ������ĸ߶ȣ�
			degree=-degree;
		}
		if(x<40||x>856-40-30) {
			degree=3.14-degree;}
		
	}
	
	//���ڼ��صķ���
	void launchaFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1���൱��1000���룬��Լһ��Ҫ��20�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	//main�����ǳ���ִ�е����
public static void main(String[]args) {
	System.out.println("������ѧ�õ�Van.G,�����Ϸ����Ŀ�ô�������̵Ŀ��");
	BallGame game=new BallGame();
	game.launchaFrame();
	
	
}
}
