package ui; //Paquete
import java.util.Scanner; //Scanner
import model.Company;

/*
To compile: javac -cp src src/ui/Main.java -d bin
To execute: java -cp bin ui.Main
Generate javadoc: javadoc -cp src src/ui/Main.java -d doc/API
*/

public class Main{

	private Company dagma; // Single relationship
	private Scanner sc; // sc

	 /**
	 * Constructor
	 */
	public Main(){
		dagma = new Company ();
		sc = new Scanner(System.in);
	}


	public static void main (String[] args){;

		Main companyMain = new Main();
		String select = " ";
		do{
			select = companyMain.options();
			companyMain.menu(select);
			
		}while (!select.equals("9"));
	}

	/**
	* Select for star menu
	* @return select String
	*/
	public String options (){
		System.out.println("\n\t1.Add wetland\n\t2.Add specie\n\t3.Add event\n\t4.Search species\n\t5.Wetlands information\n\t6.Annual maintenance per wetland\n\t7.Less species of flora\n\t8.Greater number of animals\n\t9.Exit\n");
		String select = sc.nextLine();
		return select;
	}


	/**
	* Start menu
	* @param select String
	* @return void
	*/
	public void menu(String select){
		switch (select){

			case "1":
				createNewWetland();
			break;

			case "2":

			break;

			case "3":

			break;

			case "4":

			break;

			case "5":

			break;

			case "6":

			break;

			case "7":

			break;

			case "8":

			break;

			case "9":
				System.out.println("Bye!");
			break;
		}
	}

	/**
	* Request inputs and create the new wetland
	* @return void
	*/
	public void createNewWetland (){

		System.out.println("\nWetland name:"); //Request name
		String name = sc.nextLine();
		name = name.toLowerCase();

		String zoneType = "0"; //Request area
		while (zoneType.equals("0")){
			System.out.println("\nZone:\n 1.Urban area\n 2.Rural area");
			zoneType = sc.nextLine();
			if (!zoneType.equals("1") && !zoneType.equals("2")){
				zoneType = "0";
				System.out.println ();
				typo();
			}
		}
		
		String zone = "";

		switch (zoneType){ //Request zone
			case "1":
				zone = "urban";
			break;

			case "2":
				zone = "rural";
			break;
		}

		String securityType = "0"; //Request the security
		while (securityType.equals("0")){
			System.out.println("\nSecurity:\n 1.Public\n 2.Private");
			securityType = sc.nextLine();
			if (!securityType.equals("1") && !securityType.equals("2")){
				securityType = "0";
				System.out.println ();
				typo();
			}
		}

		String security = "";

		switch (securityType){ //Request security
			case "1":
				security = "urban";
			break;

			case "2":
				security = "rural";
			break;
		}

		System.out.println("\nKm2:"); //Km2
		double km2 = sc.nextDouble();
		sc.nextLine();

		System.out.println("\nPhoto URL:"); //Photo Url
		String photoUrl = sc.nextLine();

		String typeArea = "0";
		while (typeArea.equals("0")){
			System.out.println("\nProtected area:\n 1.Yes\n 2.NO");
			typeArea = sc.nextLine();
			if (!typeArea.equals("1") && !typeArea.equals("2")){
				typeArea = "0";
				System.out.println ();
				typo();
			}
		}

		boolean protectedArea = false; //protected area
		switch (typeArea){
			case "1":
				protectedArea = true;
			break;

			case "2":
				protectedArea = false;
			break;
		}

		System.out.println("\nName neighborhood");
		String nameNeighborhood = sc.nextLine(); // Neighborhood

		String plan = "0";
		while (plan.equals("0")){
			System.out.println("\n¿has an environmental plan?:\n 1.Yes\n 2.NO");
			plan = sc.nextLine();
			if (!plan.equals("1") && !plan.equals("2")){
				plan = "0";
				System.out.println ();
				typo();
			}
		}

		boolean enviromentalPlan = false; //Enviromental plan
		switch (plan){
			case "1":
				enviromentalPlan = true;
			break;

			case "2":
				enviromentalPlan = false;
			break;
		}

		String planPercentage = "0%";
		if (enviromentalPlan == true){
			System.out.println("\nEnviromental plan percentaje:");
			planPercentage = sc.nextLine();
		}

		boolean lessSpecies = false; //less species
		boolean moreSpecies = false; //more species

		int emptyPos = dagma.getEmptyPositionWetland();
		if (emptyPos == -1){ // array full
			full();
		} else{ // array has space
			dagma.addWetland(emptyPos, name, zone, security, km2, photoUrl, protectedArea, nameNeighborhood, lessSpecies, moreSpecies, enviromentalPlan, planPercentage);
		}
	}

	/**
	* Request inputs and create the new specie
	* @return void
	*/
	public void createNewSpecie(){

		boolean exist = false;
		while (exist == false){
			System.out.println("Type the westland name");
			String westlandName = sc.nextLine();
			westlandName = westlandName.toLowerCase();

			for (int i = 0; i < MAX_WESTLANDS; i++){
				if(westlandName.equals(westlands[i])){
					int westlandIndicator = i; 
					exist = true;
				}
			}
			if(exist==false){
				typo();
			}
		}
     
		String categoryType = "0"; //Request category
		while (categoryType.equals("0")){
			System.out.println("\nSelect the category:\n"+
								" 1.Fauna\n"+
								" 2.Flora");
			categoryType = sc.nextLine();
			if (!categoryType.equals("1") && !categoryType.equals("2")){
				categoryType = "0";
				System.out.println ();
				typo();
			}
		}

		String category = "";

		switch (categoryType){
		case "1":
			category = "fauna";
		break;

		case "2":
			category = "flora";
		break;
		}

		System.out.println("\nSpecie name:"); //Request name
		String name = sc.nextLine();
		name = name.toLowerCase();

		System.out.println("\nScientific name:"); //Request scientific name
		String scientificName = sc.nextLine();
		scientificName = scientificName.toLowerCase();

		String migratory = "0"; //Migratory specie
		while (migratory.equals("0")){
			System.out.println("¿Migratory specie?:\n"+
								" 1.Yes\n"+
								" 2.No");
			migratory = sc.nextLine();
			if (!migratory.equals("1") && !migratory.equals("2")){
				migratory = "0";
				System.out.println ();
				typo();
			}
		}

		boolean migratorySpecie = false;
		switch (migratory){
			case "1":
				migratorySpecie = true;
			break;

			case "2":
				migratorySpecie = false;
			break;
		}

		String specieType = ""; // Specie type

		if (category=="fauna"){ //for wildlife

			String faunaType = "0";
			while (faunaType.equals("0")){
				System.out.println("Select fauna type :\n"+
									" 1.Bird\n"+
									" 2.Mammal\n"+
									" 3.Aquatic");
				faunaType = sc.nextLine();
				if (!faunaType.equals("1") && !faunaType.equals("2") && !faunaType.equals("3")){
					faunaType = "0";
					System.out.println ();
					typo();
				}
			}

			switch (faunaType){
				case "1":
					specieType = "bird";
				break;

				case "2":
					specieType = "mammal";
				break;

				case "3":
					specieType = "aquaticwildlife";
				break;
			}

		}else if (category=="flora"){ //for plants

			String floraType = "0";
			while (floraType.equals("0")){
				System.out.println("Select flora type :\n"+
									" 1.Terrestrial\n"+
									" 2.Aquatic");
				floraType = sc.nextLine();
				if (!floraType.equals("1") && !floraType.equals("2")){
					floraType = "0";
					System.out.println ();
					typo();
				}
			}

			switch (floraType){
				case "1":
					specieType = "terrestrialplant";
				break;

				case "2":
					specieType = "aquaticplant";
				break;
			}
		}

		int emptyPos = dagma.getEmptyPositionSpecies();
		if (emptyPos == -1){ // array full
			System.out.println("\nArray is full");
		} else{ // array has space
			dagma.addSpecie(emptyPos, westlandIndicator, category, name, scientificName, migratorySpecie, specieType);
		} //Preguntar el wetland
	}

	/**
	* Request inputs and create the new event
	* @return void
	*/
	public void createNewEvent(){
		System.out.println("\nName:"); //Request event name
		String name = sc.nextLine();
		name = name.toLowerCase();

		String type = "0"; //Request category
		while (type.equals("0")){
			System.out.println("\nSelect the category:\n"+
								" 1.Maintenance\n"+
								" 2.School visit\n"+
								" 3.Improvement activity\n"+
								" 4.Celebration");
			type = sc.nextLine();
			if (!type.equals("1") && !type.equals("2") && !type.equals("3") && !type.equals("4")){
				type = "0";
				System.out.println ();
				typo();
			}
		}

		String typeEvent = "";

		switch (type){
			case "1":
				typeEvent = "maintenance";
			break;

			case "2":
				typeEvent = "school";
			break;

			case "3":
				typeEvent = "improvement";
			break;
			case "4":
				typeEvent = "celebration";
			break;
		}

		System.out.println("\nEvent manager:"); //Request event name or description
		String nameCustomer = sc.nextLine();
		nameCustomer = nameCustomer.toLowerCase();

		System.out.println("\nPrice:"); //Request the value
		double value = sc.nextDouble();
		sc.nextLine();

		System.out.println("\nDescription:"); //Requesting write the description 
		String description = sc.nextLine();
		description = description.toLowerCase();

		int emptyPos = dagma.getEmptyPositionEvents();
		if (emptyPos == -1){ // array full
			full();
		} else{ // array has space
			dagma.addEvent(emptyPos, name, typeEvent, nameCustomer, value, description);
		}  //Preguntar el wetland
	}

	/**
	* Show typo
	* @return void
	*/
	public void typo(){
		System.out.println ("\nERROR\nWe have a typo, please try again.");
	}

	/**
	* Show error by array length
	* @return void
	*/
	public void full(){
		System.out.println("\nERROR\nArray is full");
	}

	/**
	* Calculates the wetland with the least number of plant species </br>
	* @return Wetland Class,
	*/
	public String lessSpecies(){
		String wetlandLessSpecies = "";
		return wetlandLessSpecies;
	}


	/**
	* Calculates the wetland with the most animal species </br>
	* @return Wetland Class,
	*/
	public String moreSpecies(){
		String wetlandMoreSpecies = "";
		return wetlandMoreSpecies;
	}


	/**
	* Counts the repetition of maintenance
	* @return repeats int
	*/
	public int findRepeatsYear(int repeatsYear){
		int repeats = 0;
		return repeats;
	}


	/**
	* Print all the Wetlands
	* @return void
	*/
	public void infoWetlands(){
	}


	/**
	* print the wetlands where the species you are looking for is found
	* @param scientificName String
	* @return void
	*/
	public void searchSpecie(String scientificName){
	}
}
