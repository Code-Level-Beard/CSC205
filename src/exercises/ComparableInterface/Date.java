package exercises.ComparableInterface;

public class Date implements Comparable<Date> {
	int day, month, year;

	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 1;
	}

	public Date(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		int maxDay = 0;
		if (this.getMonth() == 1|| this.getMonth() == 3 || this.getMonth() == 5 || this.getMonth() == 7 || this.getMonth() == 8 || this.getMonth() == 10 || this.getMonth() == 12) {
			maxDay = 31;
		}
		else if (this.getMonth() == 2) {
			maxDay = 28;
		}
		else {
			maxDay = 30;
		}
		if (day <= maxDay && day > 0) {
			this.day = day;
		}
		else {
			this.day = 1;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 12 && month > 0) {
			this.month = month;
		}
		else {
			this.month = 1;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 0) {
			this.year = year;
		}
		else {
			this.year = 0;
		}	
	}

	@Override
	public String toString() {
		return this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
	}

	@Override
	public int compareTo(Date d) {
		if (this.getYear() != d.getYear()) {
			return this.getYear() - d.getYear();
		}
		else if (this.getMonth() != d.getMonth()) {
			return this.getMonth() - d.getMonth();
		}
		else if (this.getDay() != d.getDay()) {
			return this.getDay() - d.getDay();
		}
		else {
			return 0;
		}
	}



}
