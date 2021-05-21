import java.util.*;
public class Main {
	public static void DisplayHiddenWord (String selectedWord, ArrayList<Character> chosenLetters) 
	{
		int i=0;
		
		while(i<selectedWord.length()) {
			if(chosenLetters.contains(selectedWord.charAt(i))) {
				System.out.print(selectedWord.charAt(i));
			}
			else 
				{
				System.out.print(" _");
				}
			i++;
		}
		return;
	}

	public static void main(String[] args) {

		//test
		

		ArrayList<String> words = new ArrayList<String>();
		
		words.add("voiture");
		words.add("bicyclette");
		words.add("anticonstitutionnellement");
		words.add("jazz");
		words.add("ecole");
		
		int listLength = words.size();
		int wordIndex;
		
		wordIndex = (int) Math.random()*listLength;
		
		System.out.println(wordIndex);
		
		wordIndex = (int) (Math.random()*listLength);
		
		System.out.println(wordIndex);

		String selectedWord = words.get(wordIndex);

		int numberOfChances = 8;
		ArrayList<Character> chosenLetters = new ArrayList<Character>();
		chosenLetters.add('a');
		chosenLetters.add('b');
		String myWord= "abc";
		DisplayHiddenWord(myWord,chosenLetters);
		

	}

}
