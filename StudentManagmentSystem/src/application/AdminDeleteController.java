package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import database.Admin;
import database.StudentsDatabase;

public class AdminDeleteController {
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}

	public void submit(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		TextField id = (TextField) button.getScene().lookup("#IdSelector");
		if (StudentsDatabase.removeStudent(id.getText()) == false) {

			root = FXMLLoader.load(getClass().getResource("./Error.fxml"));
			stage = new Stage(StageStyle.UNDECORATED);
			stage.initModality(Modality.APPLICATION_MODAL);
			scene = new Scene(root, 250, 150);
			stage.setScene(scene);
			stage.showAndWait();
		} else {
			root = FXMLLoader.load(getClass().getResource("./Successful.fxml"));
			stage = new Stage(StageStyle.UNDECORATED);
			stage.initModality(Modality.APPLICATION_MODAL);
			scene = new Scene(root, 250, 150);
			stage.setScene(scene);
			stage.showAndWait();
		}

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
}