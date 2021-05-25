import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
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
		label.setText("This is the hangman game!");
		label.setIcon(null);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(123,0,0));
		label.setFont(new Font("MV Boli", Font.PLAIN, 50));
		label.setIconTextGap(-25);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 500, 500);
		
		 JFrame frame = new JFrame();
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setSize(1000,500);
	     frame.setVisible(true);
	     frame.add(label);

		
		 
		
		
		
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
				label.setIcon(image1);
				label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 6) {
				label.setIcon(image2);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 5) {
				label.setIcon(image3);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 4) {
				label.setIcon(image4);
				frame.setVisible(true);label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 3) {
				label.setIcon(image5);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 2) {
				label.setIcon(image6);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 1) {
				label.setIcon(image7);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (numberOfChances == 0) {
				label.setIcon(image8);
				frame.setVisible(true);
				label.setText("You loose! Try again!");
			}
			
			frame.pack();
				
		}
		System.out.println("Perdu");
		
	}
	

}
