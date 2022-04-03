package com.krishna.ToDo.Entity;

public class Stobj {

	private String str1;
	private int num;
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Stobj(String str1, int num) {
		this.str1 = str1;
		this.num = num;
	}
	public Stobj() {// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stobj [str1=" + str1 + ", num=" + num + "]";
	}
}
