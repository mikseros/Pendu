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

		DisplayHiddenWord(selectedWord,chosenLetters);
		
		Scanner sc = new Scanner(System.in);
		while (numberOfChances > 0) {
			char cValeurSaisie = sc.next().charAt(0);
			System.out.println("Vous avez saisi "+ cValeurSaisie);
			chosenLetters.add(cValeurSaisie);

			DisplayHiddenWord(selectedWord,chosenLetters);

			numberOfChances--;
			if (numberOfChances == 0) {
				System.out.println("perdu");
				break;
			}
		}
	}
}
