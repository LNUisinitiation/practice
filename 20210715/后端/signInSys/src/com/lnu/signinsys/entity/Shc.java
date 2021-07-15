package com.lnu.signinsys.entity;
/**
 * 
 * @Description	课程表的实体类
 * @author LiYimin	Email:1589810996@qq.com
 * @version
 * @date 2021年6月24日上午2:04:21
 */
public class Shc {

	private int courseId;//课程号
	private String courseName;//课程名
	private String courseTeacher;//任课教师

	public Shc() {
		super();
	}

	public Shc(int courseId, String courseName, String courseTeacher) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	@Override
	public String toString() {
		return "Shc [courseId=" + courseId + ", courseName=" + courseName + ", courseTeacher=" + courseTeacher + "]";
	}
	
}
