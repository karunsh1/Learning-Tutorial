package com.designPattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneeraateBill {

	public static void main(String[] args) throws NumberFormatException, IOException {
		GetPlanFactory planFcator = new GetPlanFactory();
		System.out.println("Enter the value for example \"1\" for DomesticPlan");
		System.out.println("1: DomesticPlan" + "\n" + "2: ComercialPlan" +  "\n" + "3: InstitutionalPlan");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int planNo = Integer.parseInt(br.readLine());

		String PlanName = "";
		if (planNo == 1) {
			PlanName = "DomesticPlan";
		} else if (planNo == 2) {
			PlanName = "ComercialPlan";
		}else if (planNo == 3) {
			PlanName = "InstitutionalPlan";
		}else {
			System.out.println("Wrong Selection");
		}
		
		System.out.println("Enter the no. of unit for bill will be calculated");
		int units = Integer.parseInt(br.readLine());
		
		PlanAbstractClass p = planFcator.getplan(PlanName);
		
		System.out.println("Bill Amount of selected plan and units is : ");
		p.getRate();
		p.calculateBill(units);

	}

}
