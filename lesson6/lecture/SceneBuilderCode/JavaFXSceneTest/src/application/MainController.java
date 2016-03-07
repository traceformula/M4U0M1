package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {
	@FXML
	private Label l1;
	@FXML
	private TextField t1;
	@FXML
	private PasswordField p1;
	@FXML public void Clicked(ActionEvent Event){
		System.out.println("Button Pressed");
		String s1 = t1.getText();
		if (s1.equals("Renuka")&& p1.getText().equals("12345"))
		System.out.println("Valid User");
		else
			System.out.println("InValid User");
			
	}

}
