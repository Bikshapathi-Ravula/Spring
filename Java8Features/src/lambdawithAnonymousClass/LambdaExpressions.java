package lambdawithAnonymousClass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LambdaExpressions {

	public static void main(String[] args) {
		Map<String,Properties>  collection= new LinkedHashMap<String,Properties>();     
		collection.put("XIAOMI", new Properties("XIAOMI", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 18000.96));
		collection.put("VIVO",   new Properties("VIVO", "Sanpdragon-770, 6-gb Ram, 128-gb storage ", 28000.96));
		collection.put("IPHONE PRO",new Properties("IPHONE PRO", "Sanpdragon-570, 6-gb Ram, 128-gb storage", 38000.96));
		collection.put("SAMSUNG",new Properties("SAMSUNG Z", "Sanpdragon-470, 6-gb Ram, 128-gb storage ", 8000.96));
		collection.put("REDMI NOTE-4",new Properties("REDMI NOTE-4", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 10000.96));
		collection.put("Realme c3",new Properties("Realme c3", "Sanpdragon-470, 6-gb Ram, 128-gb storage ", 12000.96));
		collection.put("Honour",new Properties("Honour", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 15000.96));
		collection.put("Appo",new Properties("Appo", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 9000.96));
		collection.put("OnePlus lite",new Properties("OnePlus lite", "Sanpdragon-670, 6-gb Ram, 128-gb storage", 25000.96));
		collection.put("redmi A1",new Properties("redmi A1", "Sanpdragon-670, 6-gb Ram, 128-gb storage  ", 8800.96));			
		collection.put("realtek",new Properties("realtek", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 88000.96));
		collection.put("One Plues + Nord7",new Properties("One Plues + Nord7", "Sanpdragon-670, 6-gb Ram, 128-gb storage  ", 78000.96));
		collection.put("IQOO lite",new Properties("IQOO lite", "Sanpdragon-670, 6-gb Ram, 128-gb storage  ", 58000.96));
		collection.put("IQOO NEO PRO",new Properties("IQOO NEO PRO", "Sanpdragon-670, 6-gb Ram, 128-gb storage  ", 38000.96));
		collection.put("POCO",new Properties("POCO", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 28000.96));
		collection.put("XIAOMI",new Properties("XIAOMI", "Sanpdragon-670, 6-gb Ram, 128-gb storage  ", 38000.96));
		collection.put("MI NOte-10",new Properties("MI NOte-10", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 48000.96));
		collection.put("Samsung S-series",new Properties("Samsung S-series", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 88000.96));
		collection.put("Samsung F-series",new Properties("Samsung F-series", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 38000.96));
		collection.put("Samsung A-series",new Properties("Samsung A-series", "Sanpdragon-670, 6-gb Ram, 128-gb storage ", 48000.96));

	Mobilitys ref=new Mobilitys() {

		@Override
		public String brand(String name) {
			return name;
		}

		@Override
		public String features(String features) {
			return features;
		}

		@Override
		public double price(double price) {
			return price;
		}
		
	};
	//	ref.brand(null)
	Scanner t=new Scanner(System.in);
	System.out.println("ENTER PRODUCT BRAND");
String key=t.nextLine();
	collection.forEach((a,p)->{
		if(a.equalsIgnoreCase(key))
		{
			System.out.println(ref.brand(p.getBrand())+"\t"+ref.features(p.getFeatures())+"\t"+ref.price(p.getPrice()));
		}
		
		
		
		
	});
	
	}
}
