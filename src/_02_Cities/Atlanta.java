package _02_Cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {

		double basicTax = population * growthRate;
		double bonus = basicTax * (growthRate * 2);

		return bonus;
	}

}
