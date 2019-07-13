package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {

		double basicTax = population * growthRate;

		return basicTax + (population * .5);
	}

}
