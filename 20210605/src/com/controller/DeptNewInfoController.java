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
		//��һ������ȡ�ն��豸���ݹ����ĵĲ������ƣ�get��ʽ˵������������url�ĺ���
		//��ʽ��url?��=ֵ &����ֵ......
		String dname=request.getParameter("dn");
		//ͬ��ѯ����һ��
		//ʵ����service
		DeptManager service=new DeptManager();
		//����
		boolean result=true;
		try{
		result=service.insertDept(dname);
		}
		catch(Exception ex){
			ex.printStackTrace();
			result=false;
		}
		//�ѽ����Ӧ��ǰ�˻��ն�
		Gson g=new Gson();
		HashMap<String,Object> hm=new HashMap<>();
		//ʵ�ʿ����У�������һ�����ĵ��׶μ���ƽ׶ι涨���ˣ�
		hm.put("code", result==true?200:500);
		hm.put("desc", result);
		//����
		String json=g.toJson(hm);
		response.getWriter().append(json);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
