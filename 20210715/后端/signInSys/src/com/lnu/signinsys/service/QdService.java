package com.lnu.signinsys.service;

import java.util.List;

import com.lnu.signinsys.dao.QdDao;
import com.lnu.signinsys.entity.Qd;

/**
 * @author Administrator
 *
 */
public class QdService {
	
	QdDao qddao = new QdDao();
	
	public Qd login(String stuName,String password){
		
		//boolean success = false;
		
		Qd qd = qddao.selectByStuName(stuName);
		
		if(qd!=null && qd.getPassword().equals(password)){
			
			return qd;
		}
		return null;
	}
	
	
	public boolean regist(Qd qd){
		boolean success = false;
		
		Qd qd2 = qddao.selectByStuName(qd.getStuName());
		if(qd2==null){
			
			int num = qddao.insertQd(qd);
			if(num>0){
				success = true;
			}
		}
		return success;
	}
	
	//main   alt+/
	public static void main(String[] args) {
		
		QdService qs = new QdService();
		
		System.out.println("-------分割线-------");
		Qd qd = new Qd(1,"zhangyangliang","male","computer","2class",1,"521");
		boolean flag2 = qs.regist(qd);
		System.out.println(flag2);
	}


	public List<Qd> getAllList() {
		// TODO Auto-generated method stub
		return qddao.selectAllQd();
	}
	
}
