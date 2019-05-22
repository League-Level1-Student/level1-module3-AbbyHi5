package _01_intro_to_static;

	public class Athlete {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	    	Athlete bob = new Athlete("Bob",10);
	    	Athlete carl = new Athlete("Carl",15);
	    	System.out.println(bob.name);
	    	System.out.println(bob.bibNumber); 
	    	System.out.println(bob.raceLocation); 
	    	System.out.println(carl.name);
	    	System.out.println(carl.bibNumber); 
	    	System.out.println(carl.raceLocation); 
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    }
	}

