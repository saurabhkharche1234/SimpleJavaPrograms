package Classes_Programs;

 class Constructor
{
	double w,h,d;
	Constructor()
	{
		System.out.println("Constructor without parameter");
		w = 10;h = 10; d = 10;
		
	}
	Constructor(int a,int b,int c)
	{
		System.out.println("Constructor with parameter");
		w=a;
		h=b;
		d=c;
	}
	double volume()
	{
		return w*h*d;
	}
}

public class Constructor_demo {

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		double vol;
		vol = c1.volume();
		System.out.println("Volume is "+vol);
		Constructor c2 = new Constructor(7,7,7);
		vol = c2.volume();
		System.out.println("Volume is"+ vol);

	}

}
