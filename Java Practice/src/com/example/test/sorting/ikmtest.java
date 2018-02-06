package com.example.test.sorting;

import java.util.Calendar;
import java.util.Formatter;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ikmtest extends Parent {

	int x = 5;

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//System.out.println(args[1]+args[2]);
		/*
		 * Calendar cal = Calendar.getInstance(); cal.set(2000, Calendar.AUGUST,30);
		 * cal.roll(Calendar.MONTH, 7); System.out.println(""+cal.get(Calendar.DATE)+
		 * "-"+ + cal.get(Calendar.MONTH) + "-"+ cal.get(Calendar.YEAR));
		 * cal.add(Calendar.MONTH, 13); System.out.println(""+cal.get(Calendar.DATE)+
		 * "-"+ + cal.get(Calendar.MONTH) + "-"+ cal.get(Calendar.YEAR));
		 */
		/*
		 * Shape shape = new quat(); quat quad = new quat(); shape = quad; Tran tr =
		 * (Tran)quad; int a = 9, b = 2; float f; f = a/b; f = f/2; f =a + b/f;
		 * System.err.println(f);
		 */
		/*
		 * String report = args[0];
		 * 
		 * if(report.equals(Report.EMPRT.getName())) {
		 * System.out.println(Report.EMPRT.getId()+" name "+ Report.EMPRT.getName()); }
		 * if(report.equals(Report.EMPRT)) {
		 * System.out.println(Report.EMPRT.getId()+" name "+ Report.EMPRT.getName()); }
		 * if(report.equals(Report.EMPRT.toString())) {
		 * System.out.println(Report.EMPRT.getId()+" name "+ Report.EMPRT.getName()); }
		 * if(report.equals(Report.EMPRT.name())) {
		 * System.out.println(Report.EMPRT.getId()+" name "+ Report.EMPRT.getName()); }
		 */
		Locale lc = new Locale("USA");
		System.out.println(lc.getCountry());
		
		/*StringBuilder sb = new StringBuilder("c");
		
		String s= "A";
		String s3= "B";
		String stnull = null;
		Formatter fmt = new Formatter(sb);
		fmt.format("%-2s",s3);
		
		
		System.out.println( fmt);*/
	
		/*
		Object o = new ikmtest();
		System.out.println(o.toString());
		SortedSet<Ele> s1 = new TreeSet<Ele>();
		s1.add(new Ele(15));
		s1.add(new Ele(10));
		s1.add(new Ele(25));
		s1.add(new Ele(10));
		System.out.println(s1.first() + "  "+ s1.size());*/
		
		/*System.out.println(getCount());
		ikmtest ob = new ikmtest();
		System.out.println(getCount());
		*/
		/*int i ;
		int j = i =6;
		*/
		
	}
	public ikmtest() {
		count++;
	}
	
		/*public String toString() {
			return "testhg";
		}*/
	
	

	static int n2 = getvalue();
	static int n1 = 20;

	static int getvalue() {
		return n1;

	}

	static int doSum() {
		return n1 + n2;
	}

	static int dominus() {
		return n1 - n2;
	}
	/*
	 * public enum Report{ EMPRT(1,"Emp_Report", (2,"manager")); private String
	 * name; private int id; Report(int id, String name){ this.setName(name);
	 * this.id = id; }
	 * 
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getId() { return id; } public void setId(int
	 * id) { this.id = id; }
	 * 
	 * }
	 */
}

class Shape {
};

class quat extends Shape {
}

class Tran extends Shape {
}
class Ele implements Comparable{
	int id;
	Ele(int id){
		this.id = id;
		
	}
	public int compareTo(Object obj) {
		Ele e = (Ele)obj;
		return this.id - e.id;
		}
	public String toString() {
		return ""+this.id;
	}
	
}
class Parent{
    protected static int count = 0;
    public Parent() {count++;}
    static int getCount(){return count;}
}
