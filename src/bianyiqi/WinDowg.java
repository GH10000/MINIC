package bianyiqi;
//ʧ�ܵĲ��ֳ���
import java.awt.*;
import javax.swing.*;
public class WinDowg extends JFrame{

	JTextField t1;
	JTextField t2;
	JTextArea text1;
	JTextArea text2;
	JButton button;
	Listen listener;
	void init()
	{
		
		t1 = new JTextField();
		t1.setEnabled(false);
		t1.setText("���ڴ�����Ҫ���б���Ĵ���");
		t2 = new JTextField();
		t2.setText("�������н������");
		t2.setEnabled(false);
		text1 = new JTextArea(800,400);
		button  = new JButton("����");
		text2 = new JTextArea(800,100);
		GridBagLayout layout = new GridBagLayout();
	    this.setLayout(layout);
	    add(t1);
	    add(button);
	    add(text1);
	    add(t2);
	    add(text2);
	    
	    
	    GridBagConstraints s= new GridBagConstraints();//����һ��GridBagConstraints��
        //������������ӽ����������ʾλ��
        s.fill = GridBagConstraints.HORIZONTAL;
        //�÷�����Ϊ���������������ڵ�������������Ҫ��ʱ����ʾ���
        //NONE�������������С��
        //HORIZONTAL���ӿ������ʹ����ˮƽ��������������ʾ���򣬵��ǲ��ı�߶ȡ�
        //VERTICAL���Ӹ������ʹ���ڴ�ֱ��������������ʾ���򣬵��ǲ��ı��ȡ�
        //BOTH��ʹ�����ȫ��������ʾ����
        s.gridheight = 1;
        s.gridwidth=0;//�÷������������ˮƽ��ռ�õĸ����������Ϊ0����˵��������Ǹ��е����һ��
        s.weightx = 0;//�÷����������ˮƽ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ�������������죬0��1֮��
        s.weighty=0;//�÷������������ֱ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ�������������죬0��1֮��
        layout.setConstraints(t1, s);//�������
        s.gridwidth=0;
        s.gridheight = 1;
        s.weightx =0 ;
        s.weighty=0;
        layout.setConstraints(button, s);
        s.gridwidth=0;
        s.gridheight = 3;
        s.weightx = 1;
        s.weighty=1;
        layout.setConstraints(text1, s);
        s.gridwidth=0;//�÷������������ˮƽ��ռ�õĸ����������Ϊ0����˵��������Ǹ��е����һ��
        s.gridheight = 1;
        s.weightx = 0;//����Ϊ1��j4��ռ��4���񣬲��ҿ��Ժ������죬
        //�������Ϊ1�������е��еĸ�Ҳ���������,����j7���ڵ���Ҳ��������
        //����Ӧ���Ǹ���j6��������
       s.weighty=0;
        layout.setConstraints(t2, s);
        s.gridwidth=0;
        s.gridheight = 1;
       s.weightx = 1;
        s.weighty=1;
        layout.setConstraints(text2, s);
	}
	public WinDowg()
	{
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void setListener(Listen listener)
	{
		this.listener = listener;
		listener.getText(text1);
		listener.setText(text2);
		button.addActionListener(listener);
	}
	
}