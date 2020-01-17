package Chapter7dot6;
import java.io.File;
import java.util.Scanner;
public class ReadingExternalFile {

	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\871265\\Desktop\\testData.txt");
		Scanner sc = new Scanner(file);
		int rows = 0;
		int cols = 0;
		if(sc.hasNextInt()) {
			rows = sc.nextInt();
			cols = sc.nextInt();
		}
		int[][] arr = new int[rows][cols];
		while(sc.hasNextInt()) {
			
		}
	}

}
