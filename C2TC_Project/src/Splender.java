class Bike {
	void run()
	{
		System.out.println("running");
	}
}
public class Splender extends Bike {
	void run() 
	{
		System.out.println("running safely with 60km");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Splender();
		b.run();

	}

}
