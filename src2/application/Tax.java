package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Tax {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many taxpayers will you enter? ");
		int n = sc.nextInt();
		System.out.println();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			if(i == 0) {
				System.out.printf("Enter the data of the %dst contributor: \n", (i+1));
			}else if(i == 1) {
				System.out.printf("Enter the data of the %dnd contributor: \n", (i+1));
			}else {
				System.out.printf("Enter the data of the %drd contributor: \n", (i+1));
			}
			System.out.print("Annual income with salary: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Annual income with service provision: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Annual income with capital gain: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Medical expenses: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Educational expenses: ");
			double educationSpending = sc.nextDouble();
			System.out.println();
			list.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
		}
		for(TaxPayer obj : list) {
			//int i = 0;
			System.out.println(obj);
		}
		sc.close();
	}

}
