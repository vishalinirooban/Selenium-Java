package vishalini.home.testprograms;

public class Mobile {
	
	//Attributes or properties of Mobile--->
	private int size;
	
	private int price;
	
	private int weight;
	
	private String model;
	
	private String brand;
	
	private String oS;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	
	
	//behaviors or functionalities of Mobile
	public void makecall(Long phoneNum)
	{
		System.out.println("number dialed:: "+phoneNum);
	}
	
	public void sendSMS(String message)
	{
		System.out.println("Send sms:: "+message);
	}
	
	public boolean shutdown()
	{
		System.out.println("mobile shutdowned");
		return true;
	}
	
	public static void main(String[] args) {
		Mobile oppoF11 = new Mobile();
		oppoF11.setBrand("OPPO");
		oppoF11.setPrice(15000);
		oppoF11.setoS("Android");
		oppoF11.setSize(5);
		oppoF11.setWeight(1);
		oppoF11.setModel("F11");
		System.out.println(oppoF11.getBrand());
	}
	
}
