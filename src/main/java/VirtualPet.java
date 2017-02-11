
public class VirtualPet {
	private int hunger = 10;
	private int thirst = 10;
	private int waste=10;
	private int boredom = 10;
	private int illness = 10;
	private int hygiene = 10;
	private int tired = 10;
	private int ageInTicks;

	public void tick() {
		hunger = hunger + 4;
		thirst = thirst + 5;
		hygiene = hygiene - 1;
		boredom = boredom + 2;
		ageInTicks = ageInTicks + 1;
	}

	public void feed() {
		hunger = hunger - 10;
		thirst = thirst + 1;
		waste = waste + 6;
		boredom = boredom - 2;
		tired = tired + 2;
	}

	public boolean isHungry() {
		boolean hungry = (hunger > 24);
		return hungry;

	}

	public void water() {
		thirst = thirst - 15;
		waste = waste + 5;
		hygiene = hygiene + 1;
	}

	public boolean isThirsty() {
		boolean thirsty = (thirst > 27);
		return thirsty;
	}

	public void play() {
		boredom = boredom - 20;
		thirst = thirst + 18;
		hunger = hunger + 8;
		tired = tired + 9;
		illness = illness - 1;
		hygiene = hygiene + 2;
	}

	public boolean isBored() {
		boolean bored = (boredom > 26);
		return bored;
	}

	public void takeToVet() {
		illness = illness - 18;
		hygiene = hygiene - 2;
		tired = tired + 5;
	}

	public boolean isSick() {
		boolean sick = (illness > 37);
		return sick;
	}

	public void goPotty() {
		waste = waste - 11;
		hygiene = hygiene - 1;
	}

	public boolean needsToGo() {
		boolean yapping = (waste > 15);
		return yapping;
	}

	public void bathe() {
		hygiene = hygiene - 17;
		illness = illness - 2;
		thirst = thirst - 1;
	}

	public boolean isFilthy() {
		boolean filthy = (hygiene > 37);
		return filthy;
	}

	public void nap() {
		tired = tired - 9;
		illness = illness - 1;
		hunger = hunger + 8;
		boredom = boredom + 6;
		thirst = thirst - 2;
	}

	public boolean isSleepy() {
		boolean sleepy = (tired > 37);
		return sleepy;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getIllness() {
		return illness;
	}

	public int getHygiene() {
		return hygiene;
	}

	public int getTired() {
		return tired;
	}

	public void walk() {
		boredom = boredom - 14;
		thirst = thirst + 11;
		hunger = hunger + 2;
		tired = tired + 5;
		illness = illness - 4;
	}

	public void eatSocks() {
		illness = illness + 8;
		hygiene = hygiene + 3;
		hunger = hunger - 14;
		thirst = thirst + 10;
	}

	public int getAge() {
		return ageInTicks;
	}

}
