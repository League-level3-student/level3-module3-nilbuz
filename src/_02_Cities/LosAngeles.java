package _02_Cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	double getAnnualTaxes() {

		double basicTax = population * growthRate;
		double bonus = basicTax * (growthRate / 2);

		return bonus;
	}

}
