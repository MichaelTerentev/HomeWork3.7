public class Phone implements Comparable<Phone> {
	private final int price;
	private final String model;
	
	public Phone(int price, String model) {
		this.price = price;
		this.model = model;
	}
	public int compareTo(Phone p) {
		return price - p.price;
	}
	public int getPrice() {
		return price;
	}
	public String getModel() {
		return model;
	}
	@Override
	public String toString() {
		return model + ", " + price;
	}
}
