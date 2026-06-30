package com.studyopedia;

class Friends{
	int Sid;
	String Sname;
	//non-static or instance variables are stored in HEAP area...
	
	
	static int Cid=666;
	static String Cname="Jntuhces";
	//Static variables are stored in Method area 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First priority is local variable 
		
		
		int Cid=777;
		String Cname="JNTUHCES";
		System.out.println(Cid);
		System.out.println(Cname);
		
		System.out.println("************ Object 1**************");
		Friends charan=new Friends();
		charan.Sid=507;
		charan.Sname="Sri Charan";
		System.out.println(Cid);
		System.out.println(Cname);
		System.out.println(charan.Sid);
		System.out.println(charan.Sname);
		
		
		System.out.println("************ Object 2**************");
		Friends ms=new Friends();
		ms.Sid=534;
		ms.Sname="Mansingh";
		System.out.println(Cid);
		System.out.println(Cname);
		System.out.println(ms.Sid);
		System.out.println(ms.Sname);
		
		System.out.println("************ Object 3**************");
		Friends a=new Friends();
		a.Sid=545;
		a.Sname="Sarigalla Aravind";
		System.out.println(Cid);
		System.out.println(Cname);
		System.out.println(a.Sid);
		System.out.println(a.Sname);
		
	
		System.out.println("************ Object 4**************");
		Friends v=new Friends();
		v.Sid=549;
		v.Sname="Vikram";
		System.out.println(Cid);
		System.out.println(Cname);
		System.out.println(v.Sid);
		System.out.println(v.Sname);

	}

}
public class Memorymanage{
	public static void main(String[] args) {
		System.out.println("Hello...");
	}
}
