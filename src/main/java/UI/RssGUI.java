package UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class RssGUI extends JFrame {

	public RssGUI(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screnSize = kit.getScreenSize();

		this.setLocation((screnSize.width/2)-800 , (screnSize.height/2)-600);
		this.setSize(800,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Torrent Rss 검색기");
		this.setResizable(true);

		this.setLayout(new FlowLayout(FlowLayout.LEFT));


		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		btn1.setSize(200,50);

		Container container = this.getContentPane();
		container.add(btn1,BorderLayout.EAST);
		container.add(btn2,BorderLayout.NORTH);
		container.add(btn3,BorderLayout.WEST);
		container.add(btn4,BorderLayout.CENTER);
		container.add(btn5,BorderLayout.SOUTH);

		String colName[] = {"NAME","AGE","SEX"};

		DefaultTableModel model = new DefaultTableModel(colName,0);
		JTable table = new JTable(model);

		container.add(new JScrollPane(table),BorderLayout.CENTER);
		JPanel panel = new JPanel();

		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();

		JButton button1 = new JButton("add");
		JButton button2 = new JButton("del");

		panel.add(new JLabel("name"));
		panel.add(text1);
		panel.add(new JLabel("age"));
		panel.add(text2);
		panel.add(new JLabel("sex"));
		panel.add(text3);

		panel.add(button1);
		panel.add(button2);

		container.add(panel,BorderLayout.SOUTH);


		this.setContentPane(container);





	}
}
