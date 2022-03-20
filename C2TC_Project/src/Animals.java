class Dog {
  void run()
{
	System.out.println("I am running");
}
}
class Lion extends Dog {
	void roar()
	{
		System.out.println("I am Roaring");
	}
}
public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		l.run();
		l.roar();
		

	}

}
