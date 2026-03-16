public class Mileage {
	
	public static float calculateEfficiency(float litres, int prevkm, int currentkm) {
		int distance = currentkm - prevkm;
		return (litres / distance) * 100;
	}
	
	public static void main(String[] args) {
		
		//mileage  (placeholder for test)
		int[] km = {24886, 25319, 25740, 26141};
		
		//litres at each fill (placeholder for test)
		float[] litres = {27.59f, 29.55f , 28.98f , 27.13f};
		
		
	// start at 1 becasue each calculation of efficiency needs previous reading 
	for ( int i = 1; i < km.length; i++) {
		
		float efficiency = calculateEfficiency(litres[i], km [i-1], km[i]);
		
		System.out.printf("%.2f L/100km%n" , efficiency);


		}
	}
}
