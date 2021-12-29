import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {

        int[][] results = 	{{39, 40, 17, 35, 42, 6}, {40, 41, 27, 41, 42, 36}, {40, 41, 27, 41, 42, 36}};
        compareAndRankThreeTeams(results);
        System.out.print("Give me a word: ");
        Scanner Input = new Scanner(System.in);
        String name = Input.nextLine();
        printWordTriangle(name);

        Employee e1 = createEmployee("Jack", 5, "October", 2019);
        Employee e2 = createEmployee("Peter", 3, "December", 2008);
        Employee e3 =  createEmployee("Jack", 5, "October", 2019);
        CompareThreeEmployee(e1, e2, e3);

        int a [] = {51, 88, 3, 70, 96, 38, 47};
        int n = a.length;
        oddToBack(a, n);
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }

    }

    public static int[][] compareAndRankThreeTeams (int[][] results){
        int[][] rank = new int[results.length][6];						//Initializing an empty 2D array to store individual ranks of imported data
        int [] total = new int[results.length];							//Initializing an empty 1D array to store the total of each team
        int [] tRank = new int[results.length];							//Initializing an empty 1D array to store the rank of each team total
        System.out.println("The ranking list:");
        System.out.println("\tP1\tP2\tP3\tP4\tP5\tP6\tTotal\tRank");
        for (int k = 0; k< results.length; k++) {					//loop that runs for the amount of teams to calculate each of their individual totals and stores them in array called tRank
            total [k]= results[k][0]+results[k][1]+results[k][2]+results[k][3]+results[k][4]+results[k][5];}		//sums the total of each individual, for each team separately
        for (int n = 0; n < results.length; n++) {					//loop that runs for the amount of teams, to calculate and store each individuals rank
            for (int m = 0; m < results[0].length; m++) {			// loop that runs for the amount of members of each team (6)
                int count = 0;										//initializes a value to store the rank of each value
                for (int j = 0; j < results[0].length; j++) {		// loop that runs for the amount of members of each team (6)
                    for (int i = 0; i < results.length; i++) {		// loop that runs for the amount teams
                        if (results[i][j] > results[n][m]) {			//compares each individual value against every other value in all the arrays
                            count++;}									// each time the value is greater than another, it adds it to the count
                    }
                    rank[n][m] = count+1;}						// store the value of each individuals rank, determined in the previous line and stores it in an array
            }
            int team = n+1;										//stores the value of each team number
            int rankadd = 0;									//Initializes a value that stores each teams individual rank
            for (int q = 0; q < total.length; q++) {
                if (total[q] > total[n]) {						//compares each team total value against every other team total value
                    rankadd++;}									//adds 1 for each time a team has a higher total than another
                tRank[n] = rankadd +1;}							//stores each teams total rank in an array
            System.out.println("Team "+team+"\t"+ results[n][0]+"("+rank[n][0]+")"+"\t"+ results[n][1]+"("+rank[n][1]+")"+
                    "\t"+results[n][2]+"("+rank[n][2]+")"+"\t"+results[n][3]+"("+rank[n][3]+")"+
                    "\t"+results[n][4]+"("+rank[n][4]+")"+"\t"+results[n][5]+"("+rank[n][5]+")"+"\t"+total[n]+"\t"+tRank[n]);
            //prints each line of data, prints for each team separately
        }

        return results;
    }

    public static String printWordTriangle(String name){
        for (int j = 0; j<name.length(); j=j+2) {
            for (int i = 0, n = name.length(); i < n-j; i++) {
                if ((name.length() - i -1)%2==0) {
                    System.out.print(name.charAt(name.length()-(i+1+j)));
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Nice triangle!");

        return name;
    }

    public static Employee createEmployee(String name, int day, String month, int year){
        Employee e1 = new Employee();
        e1.setName(name);
        e1.hiringDate = new Date(day, month, year);


        return e1;
    }

    public static String CompareThreeEmployee(Employee e1, Employee e2, Employee e3){
        System.out.print("The first employee (e1): ");
        e1.employeePrint();													//prints e1, and the characteristic for it
        System.out.print("The Second employee (e2): ");
        e2.employeePrint();													//prints e2, and the characteristic for it
        if(e1.seniority(e2)==1)	{
            System.out.println(e2.getName()+" is more senior than "+e1.getName()+"\n");}  //if e1 is more senior then e2, print this
        else if(e1.seniority(e2)==-1) {
            System.out.println(e1.getName()+" is more senior than "+e2.getName()+"\n");} //if e2 is more senior then e1, print this
        else {
            System.out.println(e1.getName()+" and "+e2.getName()+" are hired on the same date\n"); } //if e1 is hired the same date as e2, print this
        System.out.print("The duplicated employee (e3): ");			//prints e3
        e3.employeePrint();
        System.out.println("e1.equals(e3) => "+e1.equals(e3));		//tests and prints if e1 equals to e3, returns a boolean value
        System.out.println("e2.equals(e3) => "+e2.equals(e3));		//tests and prints if e2 equals to e3, returns a boolean value
        System.out.println("e1==e3 => "+(e1==e3));					//tests and prints if e1 is the same as e3, returns a boolean value
        System.out.println("e2==e3 => "+(e2==e3));

        return null;
    }

    public static int[] sort (int[] a, int n) {
        for (int i = 0; i < n; n++) {
            if (i > (n/2)-1) break;
            if (a[i]%2 != 0) {
                for (int j = n -1; j>0; j--) {
                    if (a[j]%2 == 0) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }

        return a;
    }

    public static void oddToBack(int sort[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sort[i]%2 != 0) {

                int temp = sort[i];
                System.out.println(temp);

            } else {
                sort[count++] = sort[i];
            }
        }
    }
}

