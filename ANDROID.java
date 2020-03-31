package week1day1assignment;

public class ANDROID {
	
	//Mobile features
	//Check mobile is Android
	boolean isandroid = true;
	
	//check mobile pixel
	long pixelsize = -92236565;
	
	//check mobileweight in gms
	float weight = 3.254328989f;
	
	//mobile price in dollars
	int price = 999;
	
	//mobile model name 
	String model = "IphoneXS";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//delaring sub class
		ANDROID mob = new ANDROID();
		
	//Print mobile features
	//os type
	boolean os = mob.isandroid;
	System.out.println(os);
		
	//pixelsize
	long pixel = mob.pixelsize;
	System.out.println(pixel);
	
	//check mobileweight in gms
	float gms = mob.weight;
	System.out.println(gms);
	
	//mobile price in dollars
	int prize =mob.price;
	System.out.println(prize);
		
	//mobile model name 
	String mobileversion = mob.model;
	System.out.println(mobileversion);
	
	
	
	
	
	
		
		
		
		

	}

}
