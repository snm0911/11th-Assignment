import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


class MyPanel extends JPanel
{
	public MyPanel()
	{
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//ù���� - ����
		g.drawLine(10, 100, 130, 10);
		int[] xPoints = {10,130,10,130};
		int[] yPoints = {160,250,250,160};
		g.drawPolyline(xPoints,yPoints,xPoints.length);
		g.drawString("drawLine()", 10, 130);
		g.drawString("drawPolyline()", 10, 280);
		
		//�ι�° - �簢��
		g.drawRect(150, 10, 120, 90);
		g.fillRect(150, 160, 120, 90);
		g.drawString("drawRect()", 150, 130);
		g.drawString("fillRect()", 150, 280);
		
		//����° - 3���� �簢��
		g.setColor(Color.GRAY); // �������� �������̸� ��üȿ���� ���⶧���� ���� �ٲ���
		g.draw3DRect(290,10,120,90,true);
		g.fill3DRect(290,160,120,90,true); // ���� ������ ���� ���� ���󰡱⶧���� �������� GRAY
		g.setColor(Color.black);
		g.drawString("draw3DRect()", 290, 130);
		g.drawString("fill3DRect()", 290, 280);
		
		//�׹�° - �ձ� �簢��
		g.drawRoundRect(430,10,120,90,20,20);
		g.fillRoundRect(430,160,120,90,20,20);
		g.drawString("drawRoundRect()", 430, 130);
		g.drawString("fillRoundRect()", 430, 280);
		
		//�ټ���° - Ÿ��
		g.drawOval(570, 10, 120, 90);
		g.fillOval(570, 160, 120, 90);
		g.drawString("drawOval()", 570, 130);
		g.drawString("fillOval()", 570, 280);
		
		//������° - ȣ
		g.drawArc(710, 10, 120, 90, 10, 100);
		g.fillArc(710, 160, 120, 90, 10, 100);
		g.drawString("drawArc()", 710, 130);
		g.drawString("fillArc()", 710, 280);
		
		//�ϰ���° - �ٰ���
		int[] xPoints2 = {850,970,850,970};
		int[] yPoints2 = {10,90,90,10};
		g.drawPolygon(xPoints2, yPoints2, xPoints.length);
		int[] xPoints3 = {850,970,850,970};
		int[] yPoints3 = {160,250,250,160};
		g.fillPolygon(xPoints3, yPoints3, xPoints2.length);
		g.drawString("drawPolygon()", 850, 130);
		g.drawString("fillPolygon()", 850, 280);
	}
}

public class BasicPaint {
	public static void main(String args[])
	{
		JFrame f = new JFrame("���� ���� �׸���");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(1000, 350);
		f.setVisible(true);
	}
}
