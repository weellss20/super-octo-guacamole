package cos1.cos2;
import java.util.Random;

public class Cos8 {
	public Cos8() {
		Random  randValue = new Random();
		int value1 = randValue.nextInt(10);
		int value2 = randValue.nextInt(10);
		int value3 = randValue.nextInt(10);
		if (value1>=value2){
		    if(value1>=value3){
		             if(value3>=value2){
		                System.out.println("liczby w kolejnosci : " + value1 + " " + value3 + " " + value2);
		             }
		            else{
		               System.out.println("liczby w kolejnosci : " + value1 + " " + value2 + " " + value3);
		            }
		        }else{
		           System.out.println("liczby w kolejnosci : " + value3 + " " + value1 + " " + value2); 
		       }
		    }else{
		     if(value1>=value3){
		         if(value3>=value2){
		              System.out.println("liczby w kolejnosci : " + value3 + " " + value2 + " " + value1);
		         }else{
		              System.out.println("liczby w kolejnosci : " + value2 + " " + value3 + " " + value1);
		         }
		        }else{
		           System.out.println("liczby w kolejnosci : " + value2 + " " + value1 + " " + value3);
		     }
		   }
	}
}
