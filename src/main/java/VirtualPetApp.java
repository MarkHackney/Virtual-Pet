import java.util.Scanner;

public class VirtualPetApp {


	public static void main(String[] args) {
		System.out.println("Welcome to Samson's Realm\n");
			
		
		VirtualPet samson = new VirtualPet();
		Scanner input = new Scanner(System.in);
	
	
	while(1<2){
	
	System.out.println("What should Samson do?\n");
	System.out.println("1. Eat                2. Drink                    3. Go Potty\n"
		+ "4. Nap                5. Take a walk              6. Take a Bath\n"
		+ "7. Play outside       8. Go to the Vet            9. Eat Dad's Socks\n"
		+ "\n0. Exit Samson's Realm\n");
	int userChoice = input.nextInt();
	
	if(userChoice ==1){
		samson.feed();
	}else if (userChoice==2){
		samson.water();
	}else if (userChoice==3){
		samson.goPotty();
	}else if (userChoice==4){
		samson.nap();
	}else if (userChoice==5){
		samson.walk();
	}else if (userChoice==6){
		samson.bathe();
	}else if (userChoice==7){
		samson.play();
	}else if (userChoice==8){
		samson.takeToVet();
	}else if (userChoice==9){
		samson.eatSocks();
	}else if (userChoice==0){
		System.out.println("Thank You for visiting Samson's Realm.");
		System.exit(0);
		
	}
	
	if(samson.isHungry()==true){
		System.out.println("WARNING!!! Samson is Hungry!");
	}
	if(samson.isThirsty()==true){
		System.out.println("WARNING!!! Samson is Thirsty!");
	}
	if(samson.needsToGo()==true){
		System.out.println("WARNING!!! Samson needs to POOP!");
	}
	if(samson.isSleepy()==true){
		System.out.println("WARNING!!! Samson is Sleepy!");
	}
	if(samson.isFilthy()==true){
		System.out.println("WARNING!!! Samson is Filthy!");
	}
	if(samson.isBored()==true){
		System.out.println("WARNING!!! Samson is Bored");
	}
	if(samson.isSick()==true){
		System.out.println("WARNING!!! Samson isn't feeling well");
	}
	
	samson.tick();

	
	System.out.println("Samson is now " + samson.getAge() + " ticks old and has the following attribute levels:");
	System.out.println("Hunger: " + samson.getHunger() + "          Thirst: " + samson.getThirst());
	System.out.println("Waste:  " + samson.getWaste() + "          Boredom: " + samson.getBoredom());
	System.out.println("Illness: " + samson.getIllness() + "          Hygiene: " + samson.getHygiene());
	System.out.println("Tired: " + samson.getTired()+"\n");
	
	}
	}
}
