package Chatper7dot2;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListWordList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> wordlist1 = new ArrayList<String>();
		ArrayList<String> wordlist2 = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		String word = "";
		System.out.println("Enter the first wordlist: ");
		while(!word.equals("xxx") && !word.equals("XXX")) {
			System.out.print("Please enter a word (\"XXX\" to quit): ");
			word = input.next();
			if(word.equals("xxx") || word.equals("XXX")) {
				break;
			} else {
				wordlist1.add(word);
			}
		}
		word = "";
		System.out.println("Enter the second wordlist: ");
		while(!word.equals("xxx") && !word.equals("XXX")) {
			System.out.print("Please enter a word (\"XXX\" to quit): ");
			word = input.next();
			if(word.equals("xxx") || word.equals("XXX")) {
				break;
			} else {
				wordlist2.add(word);
			}
		}
		System.out.println("Wordlist 1");
		System.out.println("-----------");
		displayList(wordlist1);
		System.out.println("Wordlist 2");
		System.out.println("-----------");
		displayList(wordlist2);
		list = mergeLists(wordlist1, wordlist2);
		System.out.println("Wordlist 1 merged with Wordlist2");
		System.out.println("-----------");
		displayList(list);
		list = mergeLists(wordlist2, wordlist1);
		System.out.println("Wordlist 2 merged with Wordlist1");
		System.out.println("-----------");
		displayList(list);
	}
	private static void displayList(ArrayList wordlist) {
		for(int i = 0; i<wordlist.size(); i++) {
			System.out.println(i + ": " + wordlist.get(i));
		}
	}
	private static ArrayList mergeLists(ArrayList list1, ArrayList list2) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i<(Math.max(list1.size(), list2.size())); i++) {
			if(i > list1.size()-1) {
				
			}
			else{
				list.add(list1.get(i).toString());
			}
			if(i > list2.size()-1) {
				
			}
			else{
				list.add(list2.get(i).toString());
			}
		}
		return list;
	}
}
