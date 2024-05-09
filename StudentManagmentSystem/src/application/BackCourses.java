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

public class BackCourses {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}
	
	public void Back(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./CourseBook.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	
	public void Back2(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./AdminPanel.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		TextField header = (TextField) scene.lookup("#admin_name_surname");
		header.setText(Admin.username + " : " + Admin.adminID);
		stage.show();


	}


	public void OOP(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_OOP.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	
	public void ComputerOrganization(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_ComputerOrganization.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void CProgramming(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_CProgramming.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void Calculus(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_Calculus.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void EEC(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_EEC.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void Italian(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_Italian.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void LinearAlgebra(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_LinearAlgebra.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void Probability(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_Probability.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	public void ParallelProgramming(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_ParallelProgramming.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	
	public void Physics(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Syllabus_Physics.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();


	}
	
}
