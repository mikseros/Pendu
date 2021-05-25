import java.util.*;
public class Main {
<<<<<<< HEAD
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

=======
	
	public static ArrayList createList()
	{
>>>>>>> Amal
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("voiture");
		words.add("bicyclette");
		words.add("anticonstitutionnellement");
		words.add("jazz");
		words.add("ecole");
		return words;
	}
	public static char GetLetter(int i) 
	{
		System.out.println("Type your letter! you still have "+(8-i) +" chances left");
		Scanner sc =  new Scanner(System.in);
		String answer = sc.nextLine();
		char carac = answer.charAt(0);	
		return carac;
	}
    public static boolean containsChar (String input, char charSaisi)
    {
        boolean containsResult = false;
        for (int i = 0 ; i < input.length () ; i++)
        {
            if (input.charAt (i) == charSaisi)
            {
                containsResult = true;
                break;
            }
        }
        return containsResult;
    }
	
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

		
	public static void main(String[] args) {
		
		ArrayList words = createList();
		int numberOfChances = 8;
		int listLength = words.size();
		int wordIndex;
		
		wordIndex = (int) (Math.random()*listLength);
		System.out.println(wordIndex);
		int i = 0;
		String selectedWord = (String) words.get(wordIndex);
		ArrayList<Character> chosenLetters = new ArrayList<Character>();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 1fe10b73edb9c00776e55979bd15bc93fbfb9d12
		chosenLetters.add('c');
		//chosenLetters.add('b');
		String myWord= "cabcc";
		DisplayHiddenWord(myWord,chosenLetters);

		//chosenLetters.add('a');
		//chosenLetters.add('b');
		//String myWord= "abc";
=======

>>>>>>> Dominique
		DisplayHiddenWord(selectedWord,chosenLetters);

		
		Scanner sc = new Scanner(System.in);
		while (numberOfChances > 0) {
			char cValeurSaisie = sc.next().charAt(0);
			System.out.println("Vous avez saisi "+ cValeurSaisie);
			chosenLetters.add(cValeurSaisie);
<<<<<<< HEAD
=======
			//if(contains_char(selectedWord,cValeurSaisie)) {
				DisplayHiddenWord(selectedWord,chosenLetters);
			//}
			
=======
		DisplayHiddenWord(selectedWord,chosenLetters);
		
		while (i<numberOfChances) {
			char ValeurSaisie = GetLetter(i);
			System.out.println("Vous avez saisi "+ ValeurSaisie);
			chosenLetters.add(ValeurSaisie);
			DisplayHiddenWord(selectedWord,chosenLetters);
			if (!containsChar(selectedWord,ValeurSaisie))
				i++;

		}

>>>>>>> Amal

		}numberOfChances--;
>>>>>>> 1fe10b73edb9c00776e55979bd15bc93fbfb9d12

			DisplayHiddenWord(selectedWord,chosenLetters);

			numberOfChances--;
			if (numberOfChances == 0) {
				System.out.println("perdu");
				break;
			}
		}
	}
}
