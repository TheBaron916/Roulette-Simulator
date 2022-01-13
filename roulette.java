import java.util.Random;
import java.io.*;

class Roulette{

public static void main(String[] args){
	//setup
	int startingBalance = 1000;
	int numSpins = 100;

	int currentBalance = startingBalance;
	for(int i = 0;i<100;i++){
		currentBalance-=30;
		int number = spin();
		int result = checkResult(number);
		currentBalance += result;
	}
	System.out.println("Ran "+numSpins+" times. Net: "+(currentBalance-startingBalance));
	return;
}
public static int spin(){
	Random rand = new Random();
	int randInt = rand.nextInt(37);
	return randInt;
}
public static int checkResult(int num){
	int result = 0;
	if(num == 0){
		return 0;
	}
	else if (num > 0 && num <13) {
		return 30;
	}
	else if(num == 37){return 0;}
	else if(num > 24){
		return 30;
	}
	else if (num > 12 && num < 25) {
		if (num == 16 || num == 19) {
			return 0;
		}
		else return 36;
	}
	System.out.println("Did not check result properly. Num: "+num);
	return result;
}
}