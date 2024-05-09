package application;

import java.io.IOException;

import database.Student;
import database.Course;
import database.GlobalVariable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class UnselectedCorsesController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}
	
	public void Back(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("./LogIn.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	
	public void Submit(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		scene = button.getScene();
		
		SplitMenuButton dropdown1 = (SplitMenuButton) scene.lookup("#selectcourse1");
		SplitMenuButton dropdown2 = (SplitMenuButton) scene.lookup("#selectcourse2");
		SplitMenuButton dropdown3 = (SplitMenuButton) scene.lookup("#selectcourse3");
		SplitMenuButton dropdown4 = (SplitMenuButton) scene.lookup("#selectcourse4");
		SplitMenuButton dropdown5 = (SplitMenuButton) scene.lookup("#selectcourse5");
		
		
		Student user = GlobalVariable.getCurrentUser();
		
		Course course1 = new Course();
		course1.name = dropdown1.getText();
		user.course1 = course1;
		Course course2 = new Course();
		course2.name = dropdown2.getText();
		user.course2 = course2;
		Course course3 = new Course();
		course3.name = dropdown3.getText();
		user.course3 = course3;
		Course course4 = new Course();
		course4.name = dropdown4.getText();
		user.e_course1 = course4;
		Course course5 = new Course();
		course5.name = dropdown5.getText();
		user.e_course2 = course5;
		
		root = FXMLLoader.load(getClass().getResource("./StudentPanel.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.show();
		scene = new Scene(root, 700, 700);
		TextField header = (TextField) scene.lookup("#student_name_surname");
		header.setText(user.getName() + " " + user.getSurname() + " : " + user.getStudentID());
		stage.setScene(scene);
		stage.show();
		user.firstLogin = true;
	}
	
	

}
