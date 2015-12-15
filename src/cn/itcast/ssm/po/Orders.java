package cn.itcast.ssm.po;

import java.util.Date;
import java.util.List;

public class Orders {

	private int id;
	private int userId;
	private String number;
	private Date createtime;
	private String note;
	
	private User user;
	private List<OrderDetail> orderdetails;
	 
	public List<OrderDetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<OrderDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
