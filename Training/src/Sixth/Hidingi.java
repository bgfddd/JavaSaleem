package Sixth;

public class Hidingi {
	private int d;
	private int t;
	

	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Encapsulation/Data-hiding
		Hidingi ob = new Hidingi();
		ob.addition();
	}
	private void addition() {
		int i=6;
		int x=800000;
		int d=i+x;
		System.out.println(d);
		
	}
	public void addition6() {
		addition();
	}
	//Inheritance: to connect to combine two or more class
	

}
