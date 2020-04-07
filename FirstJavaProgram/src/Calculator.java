
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x");
		int x,y,z;
		x=10;
		y=20;
		z=10;
		System.out.println("Print x"+ x);
		
		System.out.println(("Print new X" +x));
		
		if(x > y & x > z){
			System.out.println("Print x");
		}
		else if (y > z)
		{
		System.out.println("Print y");
		}
		else if (x==y) {
		System.out.println("Print X and Y are equal");
		}
		else if (y==z){
		System.out.println("Print Y and Z are equal");
		}
		else if (z==x){
			System.out.println("Print X and z are equal");
		}
	}
}


