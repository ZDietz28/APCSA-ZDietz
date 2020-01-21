package Chapter7dot6;
import java.io.File;
import java.util.Scanner;
public class ReadingExternalFile {

	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\871265\\Desktop\\testData.txt");
		Scanner sc = new Scanner(file);
		int rows = 0;
		int cols = 0;	
		boolean flag = true;
		
			if(sc.hasNextInt()) {
				rows = sc.nextInt();
				cols = sc.nextInt();
			} else {
				System.out.println("Oops thats not an integer");
				flag = false;
			}
		
		int[][] arr = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(sc.hasNextInt()) {
					arr[i][j] = sc.nextInt();
				} else {
					System.out.println("Oops thats not a integer");
					flag = false;
				}
				
			}
		}
		if(flag) {
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		
			for(int i = 0; i < rows; i ++) {
				double average = 0;
				for(int j = 0; j < cols; j++) {
					average += arr[i][j];
				}
				System.out.println("Average of row " + i + ": " + (average/cols));
			}
		}
	}
}
