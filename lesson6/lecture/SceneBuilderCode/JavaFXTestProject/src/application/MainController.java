package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	@FXML
	private Label num;
	
		public void generateRandom(ActionEvent event){
		Random rand = new Random();
		int myInt = rand.nextInt(50);
		num.setText(Integer.toString(myInt));
				
	}
		
}
