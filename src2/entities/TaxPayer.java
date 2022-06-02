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
	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public double getServicesIncome() {
		return servicesIncome;
	}
	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	public double getCapitalIncome() {
		return capitalIncome;
	}
	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	public double getHealthSpending() {
		return healthSpending;
	}
	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	public double getEducationSpending() {
		return educationSpending;
	}
	public void setEducationSpending(double educationalSpending) {
		this.educationSpending = educationalSpending;
	}
	public double salaryTax() {
		double anualSalaryIncome = 0;
		double salary = salaryIncome / 12;
		if(salary > 0 && salary < 3000.00) {
			System.out.printf("Salary tax: exempt");
		}else if(salary >= 3000.00 && salary < 5000.00) {
			anualSalaryIncome = salaryIncome * 0.10;
		}else if(salary > 5000.00) {
			anualSalaryIncome = salaryIncome * 0.20;
		}
		return anualSalaryIncome;
	}
	public double servicesTax() {
		double serviceProvision = 0;
		serviceProvision = servicesIncome * 0.15;
		return serviceProvision;
	}
	public double capitalTax() {
		double taxCapitalIncome = 0;
		taxCapitalIncome = capitalIncome * 0.20;
		return taxCapitalIncome;
	}
	public double grossTax() {
		double taxTotalGross = 0;
		taxTotalGross = (salaryTax() + servicesTax() + capitalTax());
		return taxTotalGross;
	}
	public double taxRebate() {
		double totalRebate = 0;
		double deductibleExpenses = healthSpending + educationSpending;
		double maximumDeductible = grossTax();
		double reduction = maximumDeductible * 0.30;
		if(deductibleExpenses >= reduction) {
			totalRebate = reduction;
		}else {
			totalRebate = deductibleExpenses;
		}
		return totalRebate;
	}
	public double netTax() {
		double netTaxActual = 0;
		double deductibleExpenses = healthSpending + educationSpending;
		double maximumDeductible = grossTax();
		double reduction = maximumDeductible * 0.30;
		if(deductibleExpenses <= reduction) {
			netTaxActual = maximumDeductible - deductibleExpenses;
		}else {
			netTaxActual = maximumDeductible - reduction;
		}
		return netTaxActual;
	}
}