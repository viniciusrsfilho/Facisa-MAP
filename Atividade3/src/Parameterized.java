
public class Parameterized {
	
	private interface Car {
		
		String showInfo();
	}
	
	private enum Type {
		HATCH, SEDAN;
	}
	
	private abstract static class CarFactory {
		
		abstract Car createCar(Type type);
		void deliver(Car car, String place) {
			System.out.println("Delivering " + car.showInfo() + " to " + place);
		}
	}
	
	private static class Hyundai extends CarFactory {
		
		Car createCar(Type type) {
			switch (type) {
				case HATCH:
					return new Hb20();
				case SEDAN:
					return new Sonata();
				default:
					throw new IllegalArgumentException();
				
			}
		}
	}
	
	private static class Hb20 implements Car {
		
		public String showInfo() {
			return "Hb20. Hatch from Hyundai";
		}
	}
	
	private static class Sonata implements Car {
		
		public String showInfo() {
			return "Sonata. Sedan from Hyundai";
		}
	}
	
	public static void main(String[] args) {
		Parameterized.CarFactory hyundai = new Parameterized.Hyundai();
		System.out.println("Hyundai factory creates " + hyundai.createCar(Type.HATCH).showInfo());
		System.out.println("Hyundai factory creates " + hyundai.createCar(Type.SEDAN).showInfo());
	}
}
