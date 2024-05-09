package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import database.StudentsDatabase;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StudentsDatabase.load();
		
		Parent root = FXMLLoader.load(getClass().getResource("./LogIn.fxml"));
		
		Scene scene = new Scene(root,700,700);
		
	    
		primaryStage.setTitle("Student Management System");
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("student.png")));
	    primaryStage.setScene(scene);
	    
	    
	    
	    primaryStage.show();
	    
	   // UserDatabaseController.initialize();
	}
	
	@Override
    public void stop() {
		StudentsDatabase.save();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
