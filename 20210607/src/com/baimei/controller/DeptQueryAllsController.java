package com.baimei.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baimei.domain.Dept;
import com.baimei.service.DeptManager;
import com.google.gson.Gson;

@WebServlet("/all")
public class DeptQueryAllsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptQueryAllsController() {
		super();
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 接下来的代码写在这，我在这
		// 第一步：实例化一个业务层（Manager）
		System.out.println("sss");
		DeptManager service = new DeptManager();
		// 第二步：调用业务层相应的方法
		List<Dept> l = service.getAllList();
		// 第三步：把数据传给终端
		// 第三步1：实例化一个gson
		Gson g = new Gson();
		// 第三步2：通过g把l 转成字符串
		String json = g.toJson(l);
		System.out.println(json);
		//处理乱码
		response.setCharacterEncoding("gb2312");
		// 第四步：把json传给终端
		response.getWriter().append(json);
	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
