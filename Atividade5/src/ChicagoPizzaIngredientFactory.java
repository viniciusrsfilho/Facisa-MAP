import Interfaces.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();

	}
	public Sauce createSauce() {
		return new MarinaraSauce();

	}
	public Cheese createCheese() {
		return new ReggianoCheese();

	}
	public Veggies createVeggies() {
		return new VeggiesA();
	}
	public Pepperoni createPepperoni() {
		return new PepperoniA();
	}
	public Clams createClam() {
		return new FreshClams();

	}
}
