package first;

public class DecrementAndIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d=6;
		//++d;  // increment
	    //--d;  // decrement
		
		//int t=d++; //assigning the value, Increasing the value
		int t=++d;  //Increasing the value, Assigning the value
		System.out.println("This is value for d="+d);
		System.out.println("This is value for t="+t);
		
		Methodoverloading ob=new  Methodoverloading();
		//ob.addition();
		ob.division();
		ob.multiplication();
	
	}

}
