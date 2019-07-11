package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		
		double basicTax = population * growthRate;
		
		return basicTax + 1000000;
	}
}
