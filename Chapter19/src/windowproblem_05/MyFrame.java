package windowproblem_05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	
	public MyFrame(){
	JPanel panel = new JPanel();
	add(panel);
	
	JLabel label1 = new JLabel("ȭ�� �µ�");
	JLabel label2 = new JLabel("���� �µ�");
	 
	JTextField field1 = new JTextField(15);
	JTextField field2 = new JTextField(15);
		
	JButton button=new JButton("����");
	
	panel.add(label1);
	panel.add(field1);
	panel.add(label2);
	panel.add(field2);
	panel.add(button);
	

	setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 150);
    this.setTitle("�µ���ȯ��");
		
	}

}
