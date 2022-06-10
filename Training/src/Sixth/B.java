package Sixth;

public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob =new B();
		ob.addition();
		ob.subtraction();
		ob.phones();
		ob.MetodOfC();
		

	}
	public void phones() {}
	 //same method we can not change data type or argument 
	@Override
	public void subtraction() {
		System.out.println("Overriding");
		int d=6;
	}
	
}
