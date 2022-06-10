package first;

public class Methodoverloading {
	int d=6;  // Global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method Overloading: allowed you to create some method some name
		/*add different number of arguments
		 * data type for arguments should different*/
		 Methodoverloading ob=new  Methodoverloading();
		 ob.addition(6);
		 ob.additino();
		 ob.subtraction();
		 ob.division();
		 ob.multiplication();
	}
		
		public void addition(int d) {
			int t=this.d;//for call  global variable this key word
			
		}
		public void additino() {
			System.out.println(d);
			//int u=o; //local variable
		}
		public void addition(int d, float t) {
		}
		private void subtraction() {}
		protected void division() {}
		void multiplication() {}
		
	}
	
