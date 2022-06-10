package first;

public class Arraysa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] students=new int[10];
		students[0]=1000;
		students[1]=1500;
		students[2]=2000;
		students[3]=3000;
		students[4]=66;
		students[5]=23;
		students[6]=18;
		students[7]=4000;
		students[8]=500;
		students[9]=100;
		//students[10]=22;/*java.lang.ArrayIndexOutOfBoundsException*/
		System.out.println(students[0]);
		System.out.println(students[6]);
		System.out.println(students.length);
	/*	for(int i=0;i<students.length;i++) {
			students[i]=i;
			System.out.println("students["+i+"]="+students[i]);
		}*/
		
		for(int d:students) {
			System.out.println(d);
		}

	}

}
