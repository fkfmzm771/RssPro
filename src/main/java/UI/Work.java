package UI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Work extends JFrame {
	private JTextField JT_title; //이름
	private JTextField JT_category; //분류
	private JTextField JT_pubDate; //등록일
	private JTextField JT_seeders; //시더
	private JTextField JT_down; //다운로드 횟수
	private JTextField JT_size; //파일 크기
	private JTextField JT_torrentPage; //페이지 링크
	private JButton btn_add;
	private JTable table = new JTable();
	private JScrollPane pane;
	private Object[] cols = null;

	public Work() {
		JT_size = new JTextField(20);
		JT_title = new JTextField(20);
		JT_category = new JTextField(20);
		JT_pubDate = new JTextField(20);
		JT_seeders = new JTextField(20);
		JT_torrentPage = new JTextField(20);
		JT_title.setBounds(130, 20, 50, 20);
		JT_category.setBounds(130, 50, 50, 20);
		JT_pubDate.setBounds(130, 80, 50, 20);
		JT_seeders.setBounds(130, 110, 50, 20);
		JT_torrentPage.setBounds(130, 110, 50, 20);

		btn_add = new JButton("검색");
		btn_add.setBounds(300, 70, 100, 20);

		cols = new String[]
				{
						"이름"
						, "분류"
						, "등록일"
						, "시더"
						, "다운로드 횟수"
						, "크기"
						, "페이지 링크"
				};

		final DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setColumnIdentifiers(cols);
		btn_add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[]{
						JT_title.getText()
						, JT_category.getText()
						, JT_pubDate.getText()
						, JT_seeders.getText()
						, JT_torrentPage.getText()
				});
			}
		});


		//ADD 데이터 넣기
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {

				int i = table.getSelectedRow();
				JT_title.setText((String) model.getValueAt(i, 0));
				JT_category.setText((String) model.getValueAt(i, 1));
				JT_pubDate.setText((String) model.getValueAt(i, 2));
				JT_seeders.setText((String) model.getValueAt(i, 3));
			}
		});


		pane = new JScrollPane(table);
		pane.setBounds(50, 150, 600, 300);


		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		add(pane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Color c = Color.decode("#bdb76b");
		getContentPane().setBackground(c);
		setLocationRelativeTo(null);
		setSize(800, 500);

	}
}