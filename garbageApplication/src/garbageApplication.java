import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;


public class garbageApplication extends Application implements Initializable{
	
	@FXML
	Button trashBTN;
	
	@FXML
	Button recycleBTN;
	
	@FXML
	Button lookupButton;
	
	@FXML
	Button restartButton;
	
	@FXML
	TextArea textArea;
	
	@FXML
	TextField points; 
	
	WordInformation wi = new WordInformation();
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/garbageApplication.fxml"));
		final Parent p = loader.load();
		Scene scene = new Scene(p);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

			lookupButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle (ActionEvent event) {
					textArea.setText(wi.lookupMethod());				
				}
			});
			
			restartButton.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle (ActionEvent event) {
					textArea.setText("");	
					points.setText("");
					//fix up method 
					
					wi.restartMethod();
				}
			});
			
			recycleBTN.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle (ActionEvent event) {
					points.setText(wi.recycleMethod());
					textArea.setText(wi.lookupMethod());											
				}
			});

			trashBTN.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle (ActionEvent event) {
					points.setText(wi.trashMethod());
					textArea.setText(wi.lookupMethod());						
				}
			});	 
	}
		
		public static void main(String[] args) {
			launch(args);	
		}


}
