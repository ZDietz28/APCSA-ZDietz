package Chapter6;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Gimme a positive integer: ");
		int posInt = input.nextInt();
		int posInt2;
		int numb = 0;
		int hold;
		String posIntStr = "";
		for(int i = 2; i < posInt; i += 2) {
			numb += i;
		}
		System.out.println("The sum of all even numbers between 2 and 135 = " + numb);
		numb = 0;
		for(int i = 0; Math.pow(i, 2) < posInt; i++) {
			numb += Math.pow(i, 2);
		}
		System.out.println("The sum of squares between 1 and 135 = " + numb);
		numb = 0;
		System.out.print("Gimme a positive integer greater " + posInt + ": ");
		posInt2 = input.nextInt();
		System.out.print("The sum of all odd number between " + posInt + " and " + posInt2 + " = ");
		numb = 0;
		if(posInt % 2 == 0) {
			//numb = posInt+1;
			for(int i = posInt+1; i <= posInt2; i += 2) {
				numb += i;
			}
		}else {
			for(int i = posInt; i <= posInt2; i += 2) {
				numb += i;
			}
		}
		System.out.println(numb);
		
		System.out.print("The sum of all odd digits of " + posInt + " = ");
		
		numb = 0;
		hold = 0;
		posIntStr += posInt;
		for(int i = 0; i <= posIntStr.length()-1; i++) {
			if((Integer.parseInt(posIntStr.charAt(i)+"") % 2) == 1) {
				hold +=  Integer.parseInt(posIntStr.charAt(i)+"");
			}
		}
		System.out.println(hold);
	}

}
