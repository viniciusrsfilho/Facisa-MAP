import Interfaces.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThinCrustDough();
	}
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	public Veggies createVeggies() {
		return new VeggiesA();
	}
	public Pepperoni createPepperoni() {
		return new PepperoniA();
	}
	public Clams createClam() {
		return new FrozenClams();
	}

}
