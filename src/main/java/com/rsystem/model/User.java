package com.rsystem.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
//defining class name as Table name
@Table(name="user")
public class User implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "appid")
	private int appid;
	
	@Column(name="userid")
	private String userid;
	
	@ManyToOne
	@JoinColumn(name = "appid",insertable = false,updatable = false)
	private Application application;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	
	
}
