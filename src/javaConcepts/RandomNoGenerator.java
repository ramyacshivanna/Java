package javaConcepts;
import java.util.Random;
public class RandomNoGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random_dice=new Random();
		int number;
		for(int i=1;i<10;i++)
		{
			number=1+random_dice.nextInt(6);
			System.out.println("number " + number);
		}
		

	}

}
