package Whileloop;

public class Arrays {

	public static void main(String[] args) {
	String str[]= new String[5];
	str[0]="Murugan";
	str[2]="Padmini";
	str[1]="Prajeesh";
	str[3]="Aadhav";
	System.out.println(str.length);
	
	
	for(int i=0;i<=str.length;i++)
	{
		System.out.println(str[i]);
	}
}
}