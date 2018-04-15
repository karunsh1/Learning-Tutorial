package com.designPattern.factory;

public class GetPlanFactory {

	public PlanAbstractClass getplan(String planType) {

		if (planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("ComercialPlan")) {
			return new ComercialPlan();
		}
		if(planType.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		return null;

	}

}
