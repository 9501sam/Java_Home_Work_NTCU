public class DateTry{
	private String month;
	private int day;
	private int year;   
	public DateTry(String month,int day,int year){
		this.month=month;
		this.day=day;
		this.year=year;
	}

	public boolean equals(DateTry date){
		if(!this.month.equals(date.month) || this.day != date.day || this.year != date.year){
			return false;
		}
		return true;
	}

	public String getMonth(){
		return month;
	}

	public int getDay(){
		return day;
	}

	public int getYear(){
		return year;
	}

	public boolean setMonth(String month){
		this.month = month;
		return true;
	}

	public boolean setDay(int day){
		this.day = day;
		return true;
	}

	public boolean setYear(int year){
		this.year = year;
		return true;
	}

	public boolean setDate(String month,int day,int year){
		boolean result=false;
		this.month = month;
		this.day = day;
		this.year = year;
		result = true;
		return result;
	}

	public boolean setDate(int monthInt,int day,int year){
		boolean result=false;
		this.month = monthString(monthInt);
		this.day = day;
		this.year = year;
		result = true;
		return result;
	}

	public boolean setDate(DateTry date){
		boolean result=false;

		this.month = date.month;
		this.day = date.day;
		this.year = date.year;
		result = true;
		
		return result;
	}

	public String monthString(int monthNumber)
	{
		switch (monthNumber)
		{
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				System.out.println("Fatal Error");
				System.exit(0);
				return "Error"; 
		}
	}

}
