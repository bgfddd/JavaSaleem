package first;

public class NonStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Non StaticMethod into StaticMethod
		/* Have to create object of the class
		 * Object of the class:
		 * NameOftheClass object= new CostructorOftheclass*/
		/*Constructor:
		 * Every class has constructor
		 * default constructor   User-defined constructor
		 * public NameOfClass(){}   */
		NonStaticMethods ob=new NonStaticMethods();
		ob.ProfitOfCompany();

	}
	
	public  void ProfitOfCompany() {
		int income=100000;
		int expense=60000;
		int profit=income-expense;
		System.out.println("Profit of company="+profit);
		
	}
	
	public  void ProfitOfCompanyMonthly(int income,int expense,String Name) {
		int profit=income-expense;
		System.out.println("Profit of company for "+Name+"="+profit);
		
	}
	
	public  int ProfitOfCompanyMonthlyWithReturnType(int income,int expense,String Name) {
		int profit=income-expense;
		System.out.println("Profit of company for "+Name+"="+profit);
		return profit;
		
	}
	//Create our Constructor
	public NonStaticMethods() {
		System.out.println("Constructor is used");
	}
	
	

}
