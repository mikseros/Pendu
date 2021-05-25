import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	
	public static ArrayList<String> createList()
	{
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
		System.out.println("Type your letter! you still have "+(i) +" chances left");
		Scanner sc =  new Scanner(System.in);
		String answer = sc.nextLine().toLowerCase();
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
		
		ImageIcon image1 = new ImageIcon("1.png");
		ImageIcon image2 = new ImageIcon("2.png");
		ImageIcon image3 = new ImageIcon("3.png");
		ImageIcon image4 = new ImageIcon("4.png");
		ImageIcon image5 = new ImageIcon("5.png");
		ImageIcon image6 = new ImageIcon("6.png");
		ImageIcon image7 = new ImageIcon("7.png");
		ImageIcon image8 = new ImageIcon("8.png");
		JLabel label = new JLabel();
		JFrame frame = new JFrame();
		frame.add(label);
		frame.setSize(500,500);
		 
		
		
		
		ArrayList words = createList();
		int numberOfChances = 8;
		int listLength = words.size();
		int wordIndex;
		
		wordIndex = (int) (Math.random()*listLength);
		System.out.println(wordIndex);
		String selectedWord = (String) words.get(wordIndex);
		ArrayList<Character> chosenLetters = new ArrayList<Character>();
		DisplayHiddenWord(selectedWord,chosenLetters);
		
		int i = 0;
		while (0<numberOfChances) {
			char ValeurSaisie = GetLetter(numberOfChances);
			System.out.println("Vous avez saisi "+ ValeurSaisie);
			chosenLetters.add(ValeurSaisie);
			DisplayHiddenWord(selectedWord,chosenLetters);
			if (!containsChar(selectedWord,ValeurSaisie))
				numberOfChances--;
			i++;
			if (numberOfChances == 7) {
				frame.setVisible(true);
				frame.setSize(500,500);
				label.setIcon(image1);
			}
			else if (numberOfChances == 6) {
				label.setIcon(image2);
				frame.setVisible(true);
			}
			else if (numberOfChances == 5) {
				label.setIcon(image3);
				frame.setVisible(true);
			}
			else if (numberOfChances == 4) {
				label.setIcon(image4);
				frame.setVisible(true);
			}
			else if (numberOfChances == 3) {
				label.setIcon(image5);
				frame.setVisible(true);
			}
			else if (numberOfChances == 2) {
				label.setIcon(image6);
				frame.setVisible(true);
			}
			else if (numberOfChances == 1) {
				label.setIcon(image7);
				frame.setVisible(true);
			}
			else if (numberOfChances == 0) {
				label.setIcon(image8);
				frame.setVisible(true);
			}
			
			frame.pack();
				
		}
		System.out.println("Perdu");
		
	}
	

}
