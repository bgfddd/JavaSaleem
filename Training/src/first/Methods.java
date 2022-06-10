package first;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Methods
         *Method without arguments
         **Method with arguments
         ***Method with return tape */
		ProfitOfCompany();
		ProfitOfCompanyMonthly(10000,6000,"January");
		int profitbeforetax=ProfitOfCompanyMonthlyWithReturnType(100000,60000,"January");
		
		ProfitOfCompanyMonthly(20000,6800,"February");
		ProfitOfCompanyMonthly(30000,6800,"March");
		ProfitOfCompanyMonthly(40000,6800,"April");
		ProfitOfCompanyMonthly(50000,6800,"May");
		ProfitOfCompanyMonthly(60000,6800,"June");
		ProfitOfCompanyMonthly(70000,6800,"July");
		ProfitOfCompanyMonthly(80000,6800,"August");
		ProfitOfCompanyMonthly(90000,6800,"September");
		ProfitOfCompanyMonthly(2000,6800,"October");
		ProfitOfCompanyMonthly(30000,6800,"November");
		ProfitOfCompanyMonthly(60000,6800,"December");
	
	}
	public static void ProfitOfCompany() {
		int income=100000;
		int expense=60000;
		int profit=income-expense;
		System.out.println("Profit of company="+profit);
		
	}
	
	public static void ProfitOfCompanyMonthly(int income,int expense,String Name) {
		int profit=income-expense;
		System.out.println("Profit of company for "+Name+"="+profit);
		
	}
	
	public static int ProfitOfCompanyMonthlyWithReturnType(int income,int expense,String Name) {
		int profit=income-expense;
		System.out.println("Profit of company for "+Name+"="+profit);
		return profit;
		
	}
	

}
