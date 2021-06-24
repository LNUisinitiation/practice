package com.lnu.signinsys.entity;
/**
 * 
 * @Description	签到表的实体类
 * @author LiYimin	Email:1589810996@qq.com
 * @version
 * @date 2021年6月24日上午1:59:17
 */
public class Qd {

	private int stuId;// 学生id
	private String stuName;// 学生姓名
	private String stuSex;// 学生性别
	private String stuFaculty;// 学生系别
	private String stuClass;// 学生班级
	private int courseId;// 当前签到的课程号
	private String password;// 密码

	public Qd() {
		super();
	}

	public Qd(int stuId, String stuName, String password) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.password = password;
	}

	public Qd(int stuId, String stuName, String stuSex, String stuFaculty, String stuClass, int courseId,
			String password) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuFaculty = stuFaculty;
		this.stuClass = stuClass;
		this.courseId = courseId;
		this.password = password;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuFaculty() {
		return stuFaculty;
	}

	public void setStuFaculty(String stuFaculty) {
		this.stuFaculty = stuFaculty;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Qd [stuId=" + stuId + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuFaculty=" + stuFaculty
				+ ", stuClass=" + stuClass + ", courseId=" + courseId + ", password=" + password + "]";
	}
	
}
