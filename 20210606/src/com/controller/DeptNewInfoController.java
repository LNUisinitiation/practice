package com.baimei.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baimei.service.DeptManager;
import com.google.gson.Gson;


@WebServlet("/add")
public class DeptNewInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeptNewInfoController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//第一步：获取终端设备传递过来的的部门名称，get方式说明请求数据在url的后面
		//格式是url?键=值 &键＝值......
		String dname=request.getParameter("dn");
		//同查询步骤一样
		//实例化service
		DeptManager service=new DeptManager();
		//调用
		boolean result=true;
		try{
		result=service.insertDept(dname);
		}
		catch(Exception ex){
			ex.printStackTrace();
			result=false;
		}
		//把结果反应给前端或终端
		Gson g=new Gson();
		HashMap<String,Object> hm=new HashMap<>();
		//实际开发中，错误码一般在文档阶段即设计阶段规定好了，
		hm.put("code", result==true?200:500);
		hm.put("desc", result);
		//返回
		String json=g.toJson(hm);
		response.getWriter().append(json);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
