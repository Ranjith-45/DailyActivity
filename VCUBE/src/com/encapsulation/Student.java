package com.encapsulation;

class ran {

	private int sid;
	private String sname;
	public void setSid( int sid) {
		this.sid=sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}

}
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ran st=new ran();
		st.setSid(12);
		st.setSname("ranjith");
		System.out.println(st.getSid());
		System.out.println(st.getSname());
	}
}
