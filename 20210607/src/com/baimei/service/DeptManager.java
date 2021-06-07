package com.baimei.service;

import java.util.List;

import com.baimei.dao.DeptDao;
import com.baimei.domain.Dept;

/**
 * ���������Ҫ�Լ�д�ģ�����dao���
 * @author ��ü
 *
 */
public class DeptManager {
  private DeptDao dao=new DeptDao();
	
  /**
   * ȫ�����ŵ��б�
   * @return ���� list<Dept>
   */
	public List<Dept> getAllList(){
		return dao.getList();
	}
	/**
	 * ������������
	 * @param dname ��������
	 * @return  true�ɹ�
	 */
	public boolean insertDept(String dname){
		Dept d=new Dept();
		d.setDeptName(dname);
		return dao.insert(d)>0?true:false;
	}
	/**
	 * ɾ��
	 * @param id
	 * @return
	 */
	public boolean deleteBydid(int id){
		return dao.delete(id)>0?true:false;
		
	}
}
