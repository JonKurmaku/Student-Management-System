package application;

import java.io.IOException;

import database.Admin;
import database.Student;
import database.StudentsDatabase;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AddStudentController {

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
		TextField header = (TextField) scene.lookup("#admin_name_surname");
		header.setText(Admin.username + " : " + Admin.adminID);
		stage.show();

	}

	public void Submit(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		
		
		
		TextField name = (TextField) button.getScene().lookup("#name");
		TextField surname = (TextField) button.getScene().lookup("#surname");
		TextField birthday = (TextField) button.getScene().lookup("#birthday");
		TextField nationality = (TextField) button.getScene().lookup("#nationality");
		TextField birthplace = (TextField) button.getScene().lookup("#birthplace");
		TextField gender = (TextField) button.getScene().lookup("#gender");
		TextField enrollment = (TextField) button.getScene().lookup("#enrollment");
		TextField father = (TextField) button.getScene().lookup("#father");
		TextField mother = (TextField) button.getScene().lookup("#mother");
		TextField studentId = (TextField) button.getScene().lookup("#studentId");
		TextField faculty = (TextField) button.getScene().lookup("#faculty");
		TextField department = (TextField) button.getScene().lookup("#department");
		TextField status = (TextField) button.getScene().lookup("#status");
		TextField program = (TextField) button.getScene().lookup("#program");
		TextField degree = (TextField) button.getScene().lookup("#degree");
		TextField username = (TextField) button.getScene().lookup("#username");
		TextField password = (TextField) button.getScene().lookup("#password");
		
		Student newStudent = new Student(name.getText(),surname.getText(),gender.getText(),birthday.getText(),
				nationality.getText(),birthplace.getText(),studentId.getText(),father.getText(),mother.getText(),
				0,enrollment.getText(),status.getText(),faculty.getText(),department.getText(),program.getText(),
				degree.getText(),username.getText(),password.getText());
		
		StudentsDatabase.addStudent(newStudent);
		
		
		root = FXMLLoader.load(getClass().getResource("./Successful.fxml"));
		stage = new Stage(StageStyle.UNDECORATED);
		stage.initModality(Modality.APPLICATION_MODAL);
		scene = new Scene(root, 250, 150);
		stage.setScene(scene);
		stage.showAndWait();

	}

}
