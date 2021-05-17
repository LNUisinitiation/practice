package com.lnu.team.service;

/**
 * 
 * @Description 表示员工的状态
 * @author LiYimin Email:1589810996@qq.com
 * @version
 * @date 2021年5月17日下午7:10:21
 */
public class Status {

	private final String NAME;

	private Status(String name) {
		this.NAME = name;
	}

	// 枚举
	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");

	public String getNAME() {
		return NAME;
	}

}
