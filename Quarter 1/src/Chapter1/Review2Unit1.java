package Chapter1;
import java.util.Scanner;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Review2Unit1 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("");

		System.out.println("----E1.2----");

		System.out.println("");
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		System.out.println("");

		System.out.println("----E1.5----");

		System.out.println("");
		System.out.println("----------");
		System.out.println("| Zander |");
		System.out.println("----------");
		System.out.println("");

		System.out.println("----E1.7----");

		System.out.println("");
		System.out.println("--.. .- -. -.. . .-.");
		System.out.println("");

		System.out.println("");

		System.out.println("----E1.10---");

		System.out.println("");
		System.out.println("   +   ");
		System.out.println("  + +  ");
		System.out.println(" +   + ");
		System.out.println("+-----+");
		System.out.println("| .-. |");
		System.out.println("| | | |");
		System.out.println("+-+-+-+");
		System.out.println("");

		System.out.println("----E1.16---");

		System.out.println("");
		//String name;
		System.out.print("What is your name?: ");
		String name = JOptionPane.showInputDialog("What is your name?");
		//name = input.next();
		System.out.println("Hello " + name + "!");
		System.out.println("");

		System.out.println("----E1.17---");

		System.out.println("");
		String answer = JOptionPane.showInputDialog(" Hi my name is Hal! What would you like me to do?:");
		System.out.println("I'm sorry, " + name + " I'm afraid I can't " + answer);
		System.out.println("");

		System.out.println("----E1.18---");

		System.out.println("");
		URL imageLocation = new URL(
	            "https://images2.minutemediacdn.com/image/upload/c_crop,h_1193,w_2121,x_0,y_64/f_auto,q_auto,w_1100/v1565279671/shape/mentalfloss/578211-gettyimages-542930526.jpg");
	    JOptionPane.showMessageDialog(null, "What is up!", "Title",
	            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));


	}
}
