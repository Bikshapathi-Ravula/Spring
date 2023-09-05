package lambdawithAnonymousClass;
public class Properties {
private String brand;
private String features;
private double price;
public Properties(String brand, String features, double price) {
	super();
	this.brand = brand;
	this.features = features;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getFeatures() {
	return features;
}
public void setFeatures(String features) {
	this.features = features;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
