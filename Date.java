class Date {			//creating a class with the properties day (int), month (string), year (int)
    int day;
    String month;
    int year;

    public Date() {		//creating a constructor without any parameter, and giving specific dates to the properties
        day=30;
        month="March";
        year=2020;}
    public Date(int d, String m, int y) {	//creating a constructor with three parameters d for int day, m for string month, year for int year.
        if(dateOK(d,m,y)==true) {			// if statement which calls on the dateOk method to validate the date.
            day=d;
            month=m;
            year=y;}
        else {
            System.out.println("input date doesn't exist"); //if the date is invalid then it will exit the program and display this message
            System.exit(0);
        }
    }
    public Date(int d, int m, int y) {		//creating a constructor with three parameters d for int day, m for int month, year for int year.
        if(dateOK(d,m,y)==true) {			// if statement which calls on the dateOk method to validate the date.
            day=d;
            month= monthString(m);
            year=y; }
        else {
            System.out.println("input date doesn't exist"); //if the date is invalid then it will use todays date for the employee
//			day=30;
//			month="March";
//			year=2020;
            System.exit(0);
        }
    }
    public boolean equals(Date otherDate) {	//return true when otherDate has the same day, month and year.
        if(day==otherDate.day && month==otherDate.month && year==otherDate.year)
            return true;
        else
            return false; }
    private String monthString(int m) {		//switch statement which converts the int m to a string for the month that pairs with its numerical value
        String monthString;
        switch (m) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;}
        return monthString;
    }
    private boolean dateOK(int d, String m, int y) {		//this validate the date, when the month is a string if it falls within the constraints given
        if(y<1000 || y>9999)					//checks if the year falls between 1000 and 9000
            return false;
        if(m=="April" || m=="June" || m=="September"|| m=="November") {	//if statement that will control the amount of days, so that the months with 30 days will have 30
            if(d<1 || d>30)
                return false; }
        else if(m=="February") {		//if statement to determine if the year is a leap year, if so February will have 29 days
            if( (y%100==0 && y%400==0) || y%4==0 ) {
                if(d<1 || d>29)
                    return false; }
            else {
                if(d<1 || d>28)		//for February in a non leap year
                    return false;}
        }
        else if(m=="Invalid month")		//determines if the month is valid or not
            return false;
        else {
            if(d<1 || d>31)			//for every other month since all others have 31 days
                return false; }
        return true;
    }
    private boolean dateOK(int d, int m, int y) {		//this validate the date, when the month is an int if it falls within the constraints given
        if(y<1000 || y>9999) {							//checks if the year falls between 1000 and 9000
            return false; }
        if(m<1 || m>12) {								//checks whether the the month exists, hence numbers 1 thourgh 12
            return false; }
        if(m==4 || m==6 || m==9 || m==11) {				//if statement that will control the amount of days, so that the months with 30 days will have 30
            if(d<1 || d>30)
                return false; }
        else if(m==2) {
            if( (y%100==0 && y%400==0) || y%4==0 ) {	//if statement to determine if the year is a leap year, if so February will have 29 days
                if(d<1 || d>29)
                    return false; }
            else {
                if(d<1 || d>28)							//for February in a non leap year
                    return false;}
        }
        else {
            if(d<1 || d>31)							//for every other month since all others have 31 days
                return false; }
        return true;}
    public void setDate(int d, int m, int y) {			//this sets the date for when and gives actual numbers to the parameters set by the class when the month is an int
        if(dateOK(d,m,y)==true) {
            day=d;
            month= monthString(m);
            year=y;}
        else {
            System.out.println("input date doesn't exist"); //if the date is invalid then it will exit the program and display this message
            System.exit(0);
        }
    }
    public void setDate(int d, String m, int y) {		//this sets the date for when and gives actual numbers to the parameters set by the class when the month is a string
        if(dateOK(d,m,y)==true) {
            day=d;
            month=m;
            year=y;}
        else {
            System.out.println("input date doesn't exist"); //if the date is invalid then it will exit the program and display this message
            System.exit(0);
        }
    }
    public int getDay() {		//stores the accessors of the properties for the date as an int
        return day;}
    public int getMonth() {		//takes the string of the month and turns it into a int, then stores accessors of the properties as a year.
        if(month=="January")
            return 1;
        else if(month=="February")
            return 2;
        else if(month=="March")
            return 3;
        else if(month=="April")
            return 4;
        else if(month=="May")
            return 5;
        else if(month=="June")
            return 6;
        else if(month=="July")
            return 7;
        else if(month=="August")
            return 8;
        else if(month=="September")
            return 9;
        else if(month=="October")
            return 10;
        else if(month=="November")
            return 11;
        else
            return 12;
    }
    public int getYear() {		//stores the  accessors of the properties for the year as an int
        return year;}
    public void setDay(int d) {		//the mutators of the properties for day as an int
        day=d;}
    public void setMonth(int m) {	//the mutators of the properties for month as an int
        month=monthString(m);}
    public void setMonth(String m){		//the mutators of the properties for month stored as a string
        month=m;}
    public void setYear(int y) {		//the mutators of the properties for year as an int
        year=y;}
}