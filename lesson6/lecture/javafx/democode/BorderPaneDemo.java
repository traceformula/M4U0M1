package lesson6.lecture.javafx.democode; 

import java.awt.Color;

import javafx.application.Application; 
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.ColorPicker; 
import javafx.scene.control.Label; 
import javafx.scene.image.ImageView; 
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage; 

public class BorderPaneDemo extends Application { 
    
    @Override 
    public void start(Stage stage) { 
        Button okButton = new Button("OK"); 
        okButton.setDefaultButton(true); 
        Scene scene = null;
        
        Button  btn2 = new Button("Exit"); 
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
		        Platform.exit();	        
		    }
		});
        HBox hBox = new HBox(); 
        hBox.setPadding(new Insets(15, 12, 15, 12)); 
        hBox.setSpacing(10); 
        hBox.setStyle("-fx-background-color: #886699;"); 
        hBox.getChildren().addAll(okButton,  btn2); 
        BorderPane root = new BorderPane(); 
        root.setTop(hBox); 
        
        ImageView imageView = new ImageView("1.jpg"); 
        root.setCenter(imageView); 
        
        VBox vBox = new VBox(); 
        vBox.setStyle("-fx-background-color: " + 
                "#ddeeff;-fx-padding:10px"); 
        
        ColorPicker cp = new ColorPicker();
        vBox.getChildren().addAll( 
                new Label("Select Color:"), 
               cp); 
        
       
             cp.setOnAction(new EventHandler() {
         	@Override
			public void handle(Event arg0) {
				// TODO Auto-generated method stub
				  javafx.scene.paint.Color c = cp.getValue();
				  root.backgroundProperty().set(new Background(new BackgroundFill(c, CornerRadii.EMPTY, Insets.EMPTY)));
				
			}
        });
        
        root.setLeft(vBox); 
         
        root.setStyle("-fx-background-color: #6680e6;"); 
        scene = new Scene(root, 740, 530); 
        
        stage.setTitle("HBox, VBox, BorderPane Demo"); 
        stage.setScene(scene); 
        stage.show(); 
    } 

    public static void main(String[] args) { 
        launch(args); 
    } 
}