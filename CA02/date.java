
//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html



//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Locale;

public class  ReadDate {

	public static void main (String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
		"dd/MM/yyyy", locale.ENGLISH);
					
					String dateStr = "27/02/2026";
					
					LocalDate date = LocalDate.parse(dateStr, formatter);
					System.out.println(date);// outputs 
	}
}

