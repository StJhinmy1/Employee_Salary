package employee;

public class Employee {
	
	public String name;
	public double gross_salary;
	public double tax;
	public double tax_percentage;
	public int increase;
	
	
	public double net_salary() {
		double tax = (tax_percentage * gross_salary) / 100;
		return (gross_salary - tax);
		
	}
	
	public void increase(int increase) {
		this.increase += increase;
		
	}
	
	public double increase_result() {
		double percentage = (increase * gross_salary ) / 100 ;
		return (percentage + net_salary());
	}
	
	public String toString() {
		return name 
			+ "\nSalario líquido" + ": R$" 
	        + String.format("%.2f", net_salary()) 
	        ; 
	     
	}

}
