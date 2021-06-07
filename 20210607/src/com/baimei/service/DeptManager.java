package com.baimei.service;

import java.util.List;

import com.baimei.dao.DeptDao;
import com.baimei.domain.Dept;

/**
 * 这个类是需要自己写的，调用dao层的
 * @author 白眉
 *
 */
public class DeptManager {
  private DeptDao dao=new DeptDao();
	
  /**
   * 全部部门的列表
   * @return 集合 list<Dept>
   */
	public List<Dept> getAllList(){
		return dao.getList();
	}
	/**
	 * 部门名称新增
	 * @param dname 部门名称
	 * @return  true成功
	 */
	public boolean insertDept(String dname){
		Dept d=new Dept();
		d.setDeptName(dname);
		return dao.insert(d)>0?true:false;
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public boolean deleteBydid(int id){
		return dao.delete(id)>0?true:false;
		
	}
}
