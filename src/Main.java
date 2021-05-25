import java.awt.Color;
import java.awt.Font;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {
	
	public static ArrayList <String>createList()
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
		System.out.println("Type your letter! you still have "+(8-i) +" chances left");
		Scanner sc =  new Scanner(System.in);
		String answer = sc.nextLine();
		String answerConverted = answer.toLowerCase();
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
	
	public static String DisplayHiddenWord (String selectedWord, ArrayList<Character> chosenLetters) 
	{
		int i = 0;
		char[] wordTab = new char[selectedWord.length()];
		while(i<selectedWord.length()) {
			if(chosenLetters.contains(selectedWord.charAt(i))) {
				System.out.print(selectedWord.charAt(i)+" ");
				wordTab[i]=selectedWord.charAt(i);
			}
			else 
				{
				System.out.print("_ ");
				wordTab[i]= '_';
				}
			i++;
		}
		String charFound = new String (wordTab);
		return charFound;
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
		int i = 0;
		String selectedWord = (String) words.get(wordIndex);
		ArrayList<Character> chosenLetters = new ArrayList<Character>();
		DisplayHiddenWord(selectedWord,chosenLetters);
		//String charFound = new String (DisplayHiddenWord(selectedWord,chosenLetters));
		while (i<numberOfChances) {
			char ValeurSaisie = GetLetter(i);
			System.out.println("Vous avez saisi "+ ValeurSaisie);
			chosenLetters.add(ValeurSaisie);
			
			if (!containsChar(selectedWord,ValeurSaisie))
			i++;
			
			if (i == 1) {
				frame.setVisible(true);
				label.setIcon(image1);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 2) {
				label.setIcon(image2);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 3) {
				label.setIcon(image3);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 4) {
				label.setIcon(image4);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 5) {
				label.setIcon(image5);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 6) {
				label.setIcon(image6);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 7) {
				label.setIcon(image7);
				frame.setVisible(true);
				label.setText("This letter isn't contained in the word!");
			}
			else if (i == 8) {
				label.setIcon(image8);
				frame.setVisible(true);
				label.setText("You loose! Try again!");
			}
			
			frame.pack();
			
			//System.out.println(DisplayHiddenWord(selectedWord,chosenLetters));
			
			if (!containsChar(DisplayHiddenWord(selectedWord,chosenLetters),'_')) 
			{
				System.out.println("Good Job!");
				break;
			}
		}
		
		if (i>=numberOfChances) 
		{
			System.out.println("You Loose! Press T to try again, Q to quit");
		}



	}

}