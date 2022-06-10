package first;

public class Condit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int d=6000;
         if(d>6000  || d==6000)  //(d>6000 && d==6000)
         { System.out.println("true");
         }
         
         
         if(d>6000 || d==6000) { System.out.println("true");}
         else{System.out.println("false");} 
         //declare variable and print the value is even or add number
         
         
         
        int b=60001;
         if(b%2==0 ) {
        	 System.out.println("Number is even");
         }else {
        	 System.out.println("Number is odd");
         }
         
         
         
         
         int Computer=90;
         int Math=100;
         int Software=70;
         int obtained=Computer+Math+Software;
         int Average=obtained/3;
         System.out.println("Average ="+Average+"%");
         
         if (Average>=90 && Average<=100 ) {
        	 System.out.println("Grade Is A");
         }else if (Average>=80 && Average<=89) {
        	 System.out.println("Grate is B ");
         }else if (Average>=70 && Average<=79) {
        	 System.out.println("Grate is C");
         }else if (Average>=60 && Average<=69) {
        	 System.out.println("Grate is D");
         }else {
        	 System.out.println("This is else block ");
         } 
         
         
         
         
         //Declare three variable and find which is greater with nested if statement.
         int t=6000;
         int s=2000;
         int v=1000;
         if (t>s) {
        	 if(t>v) {
        		 System.out.println("T is bigger");
        	 }else {System.out.println("V is greater");}
        	 
         }else if(s>v) {
        	 System.out.println("S is bigger ");
         }else {
        	 System.out.println("V is bigger");
         }   
         
         
         int i=0;
         switch (i) {
         case 1 :
        	 System.out.println("Manday");
        	 break;
         case 2 :
        	 System.out.println("Tuesday");
        	 break;
         case 3:
        	 System.out.println("Wednesday");
             break;
         case 4:
        	 System.out.println("Thursday");
             break;
         case 5:
        	 System.out.println("friday");
             break;
         case 6:
        	 System.out.println("Saturday");
             break;
         case 7:
        	 System.out.println("Sunday");
             break;
         default:
            	 System.out.println("Not a valid day");
         }
         return;
         
         
	}

}
