package com.jsj.action;

import com.jsj.model.guanliyuan;
import com.jsj.Dto.Dto;
import com.opensymphony.xwork2.ActionSupport;
public class User extends ActionSupport{
	private Dto dto;
	public shu_action user=new shu_action();
	public Dto getDto() {
		return dto;
	}

	public void setDto(Dto dto) {
		this.dto = dto;
	}
	public String login() throws Exception {
		if(user.paramName(dto.getUsername(), dto.getPassword())){
		return "success";
		}else
		return "error";
	}
	public String insert() throws Exception{
		if(user.alias(dto.getUsername())){
			return "error";
			}else{
				user.add(dto.getUsername(), dto.getPassword());
				return "success";
			}
	
		}
	}
	

