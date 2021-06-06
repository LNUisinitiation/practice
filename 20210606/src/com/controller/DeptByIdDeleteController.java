package com.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.DeptManager;
import com.google.gson.Gson;

@WebServlet("/del")
public class DeptByIdDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptByIdDeleteController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ȡ�ò��ű��
		int bid = Integer.valueOf(request.getParameter("deptno"));
		DeptManager service = new DeptManager();
		boolean result = true;
		try {
			result = service.deleteBydid(bid);
		} catch (Exception ex) {
			ex.printStackTrace();
			result = false;
		}
		// �ѽ����Ӧ��ǰ�˻��ն�
		Gson g = new Gson();
		HashMap<String, Object> hm = new HashMap<>();
		// ʵ�ʿ����У�������һ�����ĵ��׶μ���ƽ׶ι涨���ˣ�
		hm.put("code", result == true ? 200 : 500);
		hm.put("desc", result);
		// ����
		String json = g.toJson(hm);
		response.getWriter().append(json);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
