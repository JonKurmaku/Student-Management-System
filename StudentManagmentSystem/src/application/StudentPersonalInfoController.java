package application;

import java.io.IOException;

import database.Admin;
import database.GlobalVariable;
import database.Student;
import database.StudentsDatabase;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StudentPersonalInfoController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}

	public void Back(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./StudentPanel.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		Student user = GlobalVariable.getCurrentUser();
		TextField header = (TextField) scene.lookup("#student_name_surname");
		header.setText(user.getName() + " " + user.getSurname() + " : " + user.getStudentID());
		stage.show();

	}
	
}
