import java.util.*;
public class Main {
	public static void DisplayHiddenWord (String selectedWord, ArrayList<Character> chosenLetters) 
	{
		int i=0;
		
		while(i<selectedWord.length()) {
			if(chosenLetters.contains(selectedWord.charAt(i))) {
				System.out.print(selectedWord.charAt(i)+" ");
			}
			else 
				{
				System.out.print("_ ");
				}
			i++;
		}

		return;
	}

	public static void GetLetter(int i) 
	{
		System.out.println("Type your letter! It's your "+ i +" chance" );
		Scanner sc =  new Scanner(System.in);
		String answer = sc.nextLine();
		char carac = answer.charAt(0);	
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
<<<<<<< HEAD
<<<<<<< HEAD
		chosenLetters.add('c');
		//chosenLetters.add('b');
		String myWord= "cabcc";
		DisplayHiddenWord(myWord,chosenLetters);
=======
		//chosenLetters.add('a');
		//chosenLetters.add('b');
		//String myWord= "abc";
=======

>>>>>>> Dominique
		DisplayHiddenWord(selectedWord,chosenLetters);
>>>>>>> Dominique
		
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
