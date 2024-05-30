package com.cdac.training.hiberProject;
import javax.persistence.*;

@Entity
public class Candy {
	@Id
	private int cid;
	private String name;
	private float price;
	public Candy(int cid, String name, float price) {
		super();
		this.cid = cid;
		this.name = name;
		this.price = price;
	}
	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
