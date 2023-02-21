package _02_boolean._3_game_over;

import javax.management.openmbean.OpenDataException;
import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		
		boolean game0ver=false;
		while(game0ver==false) {
			
		// 1. Ask the user if the game is over and save their answer.
		String userResponse = JOptionPane.showInputDialog("is the game over?");
		// 2. If they answer "yes" c {hange gameOver to true.
		if(userResponse.equals("yes")) {
			 game0ver=true;
		}
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		
		}
		// 4. Tell the user the game is over outside the while loop.
		if(game0ver==true) {
			JOptionPane.showMessageDialog(null, "the game is over");
		}
	}

}