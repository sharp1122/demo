package com.sharp.demo.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Timestamp2Str {
	
	public Timestamp2Str () {
		initGUI();
	}

	public static void main(String[] args) {
		new Timestamp2Str();
		System.out.println(System.currentTimeMillis());
	}
	
	private JPanel panel = null;
	private JPanel panel2 = null;
	private JPanel panel3 = null;
	private JLabel lable = null;
	private JTextField input = null;
	private JButton button = null;
	private JTextField result = null;
	
	public void initGUI() {
		JFrame frame = new JFrame();
		
		frame.setLayout(new BorderLayout());
		frame.setLocation(400,300);
		frame.setSize(400,300);  
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		lable = new JLabel("请输入日期（Long类型）：");
		input = new JTextField();
		panel.add(lable, BorderLayout.WEST);
		panel.add(input, BorderLayout.CENTER);
		
		panel2 = new JPanel();
//		panel2.setLayout(new BorderLayout());
		button = new JButton("转换");
		panel2.add(button);
		
		panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		result = new JTextField();
		panel3.add(result);
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.SOUTH);
		
		addListener();
		frame.setVisible(true);  
	}
	
	private void addListener() {
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if (input.getText() == null || "".equals(input.getText().trim())) {
					return;
				}
				
				Date date = new Date(Long.valueOf(input.getText().trim()));
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				String dateStr = sdf.format(date);
				
				result.setText(dateStr);
			}
		});
	}
}