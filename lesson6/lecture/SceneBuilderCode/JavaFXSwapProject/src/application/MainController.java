package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
	@FXML
	private TextField t1;
	@FXML
	private TextField t2;

	public void Swap(ActionEvent event){
		String left = t1.getText();
		System.out.println(left);
		String right = t2.getText();
		System.out.println(right);
		t1.setText(right);
		t2.setText(left);

	}
}
