package java8.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class NewPeruod {

	public static void main(String[] args) {
		Period period = Period.between(LocalDate.now(), LocalDate.of(1999, 02, 15));
		System.out.println(period.getYears());
	}
}
