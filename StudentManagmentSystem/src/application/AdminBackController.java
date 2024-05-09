package application;

import java.io.IOException;

import database.Admin;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AdminBackController {

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}

	public void Back(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		root = FXMLLoader.load(getClass().getResource("./AdminPanel.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.centerOnScreen();
		
		TextField header = (TextField) scene.lookup("#admin_name_surname");
		header.setText(Admin.username + " : " + Admin.adminID);
		
		stage.show();
	}
}
