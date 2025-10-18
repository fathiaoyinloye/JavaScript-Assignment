
public class WorldPopulationGrowth{

	public static void main(String... args){


/* p(t) = p0 (1 + r)^t where
p = population, t = no of years; p(t) = population after t years p0 = initial population, r = growth rate(%)


*/
		double population = 8243000000.0;
		double growthRate = 1 + 0.008;
		
		System.out.println("Years\t" + " Anticipated Population\t" + "Numerical increase");  
		for (int year = 1; year <=75; year++){
			
			double result = population * (Math.pow(growthRate,year));
	
			System.out.printf("%d\t%.0f\n", year, result );



		}
	}
}