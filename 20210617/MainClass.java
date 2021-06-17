package com.lnu.java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * 
 * @Description 辽宁大学自研在线聊天室：球球
 * @author LiYimin	Email:1589810996@qq.com
 * @version
 * @date 2021年6月17日下午12:31:42
 */
public class MainClass {

	static String name = "李义民";
	
	public static void main(String[] args) {
		
		JFrame mainFrame = new JFrame("辽宁大学在线聊天室");//创建主窗体
		mainFrame.setSize(500, 400);//设置主窗体尺寸
		
		//添加面板，面板放在窗体上，控件放在面板上
		JPanel jp1 = new JPanel();//创建面板1
		JLabel jla1 = new JLabel("王冰冰");//创建控件1
		mainFrame.add(jp1, BorderLayout.NORTH);//将面板1添加到主窗体，并设置布局
		jp1.add(jla1);//将控件1添加到面板上
		
		JPanel jp2 = new JPanel();//创建面板2
		JTextArea jta = new JTextArea(10,40);//创建聊天内容显示区域
		JTextField jtx = new JTextField(30);//创建消息输入框
		JButton jbt_send = new JButton("发送");//创建发送消息按钮
		mainFrame.add(jp2, BorderLayout.CENTER);//将面板2添加到主窗体，并设置布局
		jp2.add(jta);//将聊天内容显示区域添加到面板2
		jp2.add(jtx);//将消息输入框1添加到面板2
		jp2.add(jbt_send);//将发送消息按钮添加到面板2
		
		jbt_send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String message = jtx.getText();//消息输入框获取输入的信息 
				
				jta.append(new Date() + "\n");
				jta.append(name + ":  " + message + "\n");//聊天内容显示区域，显示message
				
			}
			
		});
		
		mainFrame.setVisible(true);//设置主窗体可见
	}
}
