// Initialize the Object Using Methods
public class Animal {
	String colour;
	int age;
    void initObj(String c,int a)
    {
    	colour=c;
    	age=a;
    }
void Display()
{
	System.out.println(colour+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Animal();
		dog.initObj("Black",10);
		dog.Display();

	}

}
