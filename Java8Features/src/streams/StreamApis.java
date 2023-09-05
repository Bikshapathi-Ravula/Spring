package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamApis {

	public static void main(String[] args) {

		List<Demo> obj = new ArrayList<>();

		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Adidas", "shirt", 1900));
		obj.add(new Demo("Levi's", "Jeans", 2500));
		obj.add(new Demo("Diesel", "Jeans", 4100));
		obj.add(new Demo("puma", "hoodies", 1100));
		obj.add(new Demo("Adidas", "shirt", 1900));
		obj.add(new Demo("Levi's", "Jeans", 2500));
		obj.add(new Demo("Diesel", "Jeans", 4100));
		obj.add(new Demo("puma", "hoodies", 1500));
		obj.add(new Demo("Adidas", "shirt", 1900));
		obj.add(new Demo("Levi's", "Jeans", 2500));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Diesel", "Jeans", 4100));
		obj.add(new Demo("puma", "hoodies", 1100));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Adidas", "shirt", 1900));
		obj.add(new Demo("Levi's", "Jeans", 2500));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Diesel", "Jeans", 4100));
		obj.add(new Demo("puma", "hoodies", 1100));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Adidas", "shirt", 1900));
		obj.add(new Demo("Levi's", "Jeans", 2500));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Diesel", "Jeans", 4100));
		obj.add(new Demo("puma", "hoodies", 1100));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Adidas", "shirt", 1900));
		obj.add(new Demo("Levi's", "Jeans", 2500));
		obj.add(new Demo("puma", "T-shirt", 900));
		obj.add(new Demo("Diesel", "Jeans", 4100));
		obj.add(new Demo("puma", "hoodies", 1100));
		Set<Demo> set = new HashSet<>(obj);
		// Create a new list and add elements from the set
		List<Demo> newList = new ArrayList<>(set);
		int c = 0;

		for (Demo o : newList) {
			c++;
		}
		System.out.println(c);
	}
}

class Demo {
	private String brand;
	private String category;
	private int retailPrice;

	public Demo(String brand, String category, int retailPrice) {
		super();
		this.brand = brand;
		this.category = category;
		this.retailPrice = retailPrice;
	}

	/*
	 * @Override public String toString() { return "[brand=" + brand + ", category="
	 * + category + ", retailPrice=" + retailPrice + "]"; }
	 */
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}

}
