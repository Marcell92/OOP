import java.util.ArrayList;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person Marcell = new Person (25, "Marcell", "Unemployed");
		Person Jason = new Person (22, "Jason", "McDonalds crewmember");
		Person Callum = new Person (22, "Callum", "Developer Intern");
		Person Tib = new Person (22, "Tib", "Game Developer");
		Person Nidhesh = new Person (24, "Nidhesh", "Events Manager");
		System.out.println(Marcell.toString());
		System.out.println(Jason.toString());
		System.out.println(Callum.toString());
		System.out.println(Tib.toString());
		System.out.println(Nidhesh.toString());
	
	
	
		ArrayList <Person> Personlist = new ArrayList<Person>();
		
		Personlist.add(Marcell);
		Personlist.add(Jason);
		Personlist.add(Callum);
		Personlist.add(Tib);
		Personlist.add(Nidhesh);
		
		
		//for-each loop so i don't have to type out system.out.println 5 times
		for (Person Person : Personlist) {
			System.out.println(Person.toString());
		}
		String search = "M";
		  for(Person Person : Personlist){
		        if((Person.getname()).contains(search)) {
		        	System.out.println("I found " + Person.getname());
		        	                     }
		                                                }
	 }
	
 }