package exercises.ComparableInterface;

public class DateDriver {

	public static void main(String[] args) {
		Date date1 = new Date(11,05,1984);
		Date date2 = new Date(10,05,1984);
		
		System.out.println("First entered date: "  + date1.toString());
		System.out.println("Second entered date: "  + date2.toString());

		if (date1.compareTo(date2) == 1) {
			System.out.println("The earliest of the two dates is: " + date2.toString());
		}
		else if (date1.compareTo(date2) == 0) {
			System.out.println(date1.toString() + " and " + date2.toString() + " are the same day");
		}
		else {
			System.out.println("The earliest of the two dates is: " + date1.toString());
		}

	}

}
