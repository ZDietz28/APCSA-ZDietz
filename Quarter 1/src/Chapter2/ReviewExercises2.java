package Chapter2;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ReviewExercises2{
	public static void main(String[] args) throws Exception{
		System.out.println("***P2.2***");
		Rectangle square = new Rectangle(100,100,50,50);
		System.out.println(square);
		square.translate((int) square.getWidth()/2, (int) square.getHeight()/2);
		square.grow(((int) square.getWidth())/2, ((int) square.getHeight())/2);
		System.out.println(square);
		System.out.println("");
		System.out.println("***P2.3***");
		Rectangle sqre = new Rectangle(100,100,200,200);
		System.out.println(sqre);
		sqre.grow((int) (-1*(sqre.getWidth()/4)), (int) (-1*(sqre.getHeight()/4)));
		sqre.translate((int) (-1*square.getWidth()/2), (int) (-1*square.getHeight()/2));
		System.out.println(sqre);
		System.out.println("");
		System.out.println("***P2.5***");
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    Rectangle jSquare = new Rectangle(500,500,300,300);
	    frame.setBounds(jSquare);
	    
	    JOptionPane.showMessageDialog(frame, "Click OK to continue");
	    jSquare.translate(0, -300);
	    frame.setBounds(jSquare);
	   
	    
	}
}