package cos1;

import java.util.Random;

import cos1.cos2.Cos12;
import cos1.cos2.Cos8;

public class cos11
{
	public static void main(String[] args) {
	Random  randValue = new Random();
	int value = randValue.nextInt(20);
	System.out.println("Wylosowana liczba " + value);
	if ((value>=2)&&(value <=10)){
	    System.out.println("liczba zawiera sie w przedziale <2,10>");
	}
	else{
	    System.out.println("liczba nie zawiera sie w przediale <2,10>");
	}
	Cos12 in1 = new Cos12();
	Cos8 in2 = new Cos8();
	}
	
}
