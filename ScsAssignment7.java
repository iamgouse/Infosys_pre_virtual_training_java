class Tester {
	public static void main(String[] args) {
		int day = 1;
		   int month = 9;
		   int year = 15;
		   year += 2000;
		   int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		       daysInMonth[1] = 29;
		   }
		   day++;
		   if(day > daysInMonth[month - 1]){
		       day = 1;
		       month++;
		   }
		   if (month > 12){
		       month = 1;
		       year++;
		   }
		   System.out.println(day + "-" + month + "-" +year);
	}
}

