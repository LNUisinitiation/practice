package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Dept;
import com.service.DeptManager;
import com.google.gson.Gson;

@WebServlet("/all")
public class DeptQueryAllsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptQueryAllsController() {
		super();
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// �������Ĵ���д���⣬������
		// ��һ����ʵ����һ��ҵ��㣨Manager��
		System.out.println("sss");
		DeptManager service = new DeptManager();
		// �ڶ���������ҵ�����Ӧ�ķ���
		List<Dept> l = service.getAllList();
		// �������������ݴ����ն�
		// ������1��ʵ����һ��gson
		Gson g = new Gson();
		// ������2��ͨ��g��l ת���ַ���
		String json = g.toJson(l);
		System.out.println(json);
		//��������
		response.setCharacterEncoding("gb2312");
		// ���Ĳ�����json�����ն�
		response.getWriter().append(json);
	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
