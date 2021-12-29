class Employee {		//creating a class with two properties, name and hiringDate, which is a type of date
    String name;
    Date hiringDate;

    public Employee() {		//creating a constructor without any parameters, and giving names to the properties
        name="Boris";
        hiringDate=new Date();}
    public Employee(String aName, Date aDate) {		//creating a constructor with two parameters, and parameters for the hiringDate
        name=aName;
        hiringDate=new Date(aDate.day,aDate.month,aDate.year);}
    public int seniority(Employee e) {				//Determines the seniority of the employee
        if(e.hiringDate.getYear()>hiringDate.getYear()) {
            return -1; }	//if this Employee is hired before the Employee e, based solely off their years
        else if(e.hiringDate.getYear()<hiringDate.getYear()) {
            return 1; }		//if this Employee is hired after the Employee e, based solely off their years
        else {		//if hired the same year
            if(e.hiringDate.getMonth()>hiringDate.getMonth()) {
                return -1; }	//if this Employee is hired before the Employee e, based off their month of employment, in the same year
            else if(e.hiringDate.getMonth()<hiringDate.getMonth()) {
                return 1; }		//if this Employee is hired after the Employee e, based off their month of employment, in the same year
            else {		//if hired in the same month & year
                if(e.hiringDate.getDay()>hiringDate.getDay()) {
                    return -1;}		//if this Employee is hired before the Employee e, based off their date of employment, if in the same year & month
                if(e.hiringDate.getDay()<hiringDate.getDay()) {
                    return 1;}		//if this Employee is hired after the Employee e, based off their date of employment, if in the same year & month
                else {
                    return 0;}		//it returns 0, if the two employees are hired on the same date,
            }
        }
    }
    public boolean equals(Employee e) {				//will return true, if the emplyees are hired on the same date
        if(e.hiringDate.equals(hiringDate))
            return true;
        else
            return false;}
    public String getName() {			//stores the accessors of the properties for names as a string
        return name; }
    public Date getHireDate() {			//stores the accessors of the properties for hiringDate as a date
        return hiringDate; }
    public void setHireDate(Date d) {	//the mutator of the properties, for the date
        hiringDate.setDay(d.getDay());		//the day of the day
        hiringDate.setMonth(d.getMonth());	//the month of the date
        hiringDate.setYear(d.getYear());}	//the year of the date
    public void setName(String aName) {	//the mutator of the properties, for the name of the employee
        name=aName; }
    public void employeePrint() {		//the mutator of the properties.
        System.out.println(name+" "+hiringDate.month+" "+hiringDate.getDay()+", "+hiringDate.getYear()+"\n"); } //allows for the employee to get printed, in the main method, with its given characteristics
}