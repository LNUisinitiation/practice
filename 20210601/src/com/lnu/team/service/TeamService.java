package com.lnu.team.service;

import com.lnu.team.domain.*;
import com.sun.tools.javac.launcher.Main;

public class TeamService {
	
	private static int counter = 1;
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;
	
	public TeamService() {
		
	}
	
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		
		for(int i = 0;i < total;i++) {
			team[i] = this.team[i];
		}
		return team;
		
		public void addMember(Employee e) throws TeamException{
			if(total >= MAX_MEMBER) {
				throw new TeamException("成员已满，无法添加");
			}
			if(!(e instanceof Programmer)) {
				throw new TeamException("该成员不是开发人员，无法添加");
			}
			
			Programmer p = (Programmer)e;
			
			if(isExist(p)) {
				throw new TeamException("该员工已在本团队中");
				
			if(p.getStatus().equals("BUSY")) {
				throw new TeamException("该员工已是某团队成员");
			}else if(p.getStatus().getNAME().equals("VOCATION")) {
				throw new TeamException("该员工正在休假，无法添加");
			}
			}
			
		}
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	