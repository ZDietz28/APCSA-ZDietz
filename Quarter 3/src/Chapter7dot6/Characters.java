package Chapter7dot6;
import java.io.*;
public class Characters {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\871265\\Desktop\\Characters.txt");
		FileWriter writer = new FileWriter(file);
		String[][] str = new String[][] {{"Mickey", "Mouse"}, {"Donald", "Duck"}, {"Goofy", "Goofy"}, {"Minne", "Mouse"}, {"Daisy", "Duck"}, {"Max", "Goofy"}};
		final int ROWS = 2;
		final int COLS = 6;
		writer.write("First and Last: \r\n");
		for(int i = 0; i < COLS; i++) {
			writer.write("Row " + i + ": ");
			for(int j = 0; j < ROWS; j ++) {
				
				writer.write(str[i][j] + " ");
			}
			writer.write("\r\n");
		}
		writer.write("\r\n");
		writer.write("Last names only: \r\n");
		for(int i = 0; i < 6; i ++) {
			writer.write("Row " + i + ": ");
			writer.write(str[i][1] + "\r\n");
		}
		writer.flush();
		writer.close();
	}

}
