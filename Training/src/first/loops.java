package first;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=1;
		
		//while loop check condition and when execute the code
		while(d<=100) {
			System.out.println("This is d="+d);
			d++;
		}
		while(d>=1) {
			System.out.println("This is d="+d);
			d--;
		}
		
		//do while loop execute the code first and check the condition
		do {
			System.out.println("This is do-while loop="+d);
			d++;
		}while(d<=100);
		
		//For loop
		//For Loops - Used ONLY when we know EXACTLY how many times we would like to loop/iterate
		
		for (int i=1;i<=100;i++) {
            System.out.println("The is for loop " +i);
        }
		for (int i=100;i>=1;i--) {
            System.out.println("The is for loop " +i);
        }
		
		
	
		
		
		}

	}


