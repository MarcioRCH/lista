package entities;

public class TaxPayer {
	
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	public double getSalaryIncome() {
		return salaryIncome;
	}
	public double getServicesIncome() {
		return servicesIncome;
	}
	public double getCapitalIncome() {
		return capitalIncome;
	}
	public double getHealthSpending() {
		return healthSpending;
	}
	public double getEducationSpending() {
		return educationSpending;
	}
	public static double taxSalary(double salaryIncome) {
		double annualSalaryIncome = 0;
		double salary = salaryIncome / 12;
		if(salary > 0 && salary < 3000.00) {
			System.out.printf("Salary tax: exempt");
		}else if(salary >= 3000.00 && salary < 5000.00) {
			annualSalaryIncome = salaryIncome * 0.10;
		}else if(salary > 5000.00) {
			annualSalaryIncome = salaryIncome * 0.20;
		}
		return annualSalaryIncome;
	}
}