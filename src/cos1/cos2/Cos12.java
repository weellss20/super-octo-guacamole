package cos1.cos2;
import java.util.Random;

public class Cos12 {
	public Cos12() {
		Random  randValue = new Random();
		for(int i=0; i<20;){
		    int value = randValue.nextInt(20);
		   if((value%6==0)&&(value != 0)){
		       i++;
		    System.out.print(value + "  ");
		   }
		}
	}
}