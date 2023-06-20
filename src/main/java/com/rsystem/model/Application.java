package com.rsystem.model;

import com.rsystem.request.CreateApplicationRequest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
//@NoArgsConstructor
@Entity
@Table(name = "ASPAPLCATN")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appid")
	private int appid;
	@Column(name="appcode")
	private String appcode;
	@Column(name="app_name")
	private String app_name;
	@Column(name="app_description")
	private String app_description;
	@Column(name = "country")
	private String country;
	@Column(name="concept")
	private String concept;
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getAppcode() {
		return appcode;
	}
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getApp_description() {
		return app_description;
	}
	public void setApp_description(String app_description) {
		this.app_description = app_description;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "USER")
	//@JoinColumn(name="appid" ,insertable =false ,updatable = false)
	private List<User> listOfUsers;
	
	
	public List<User> getListOfUsers() {
		return listOfUsers;
	}
	public void setListOfUsers(List<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
	public Application(CreateApplicationRequest createApplicationRequest) {
		this.appcode = createApplicationRequest.getAppcode();
		this.app_name = createApplicationRequest.getApp_name();
		this.app_description = createApplicationRequest.getApp_description();
		this.country = createApplicationRequest.getCountry();
		this.concept = createApplicationRequest.getConcept();
	}
	public Application() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
