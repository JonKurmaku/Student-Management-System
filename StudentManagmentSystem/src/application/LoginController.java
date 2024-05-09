package application;

import database.StudentsDatabase;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import database.Admin;
import database.GlobalVariable;
import database.Student;

public class LoginController {

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}

	public void onMouseReleased(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #3392FF;");

		TextField username = (TextField) button.getScene().lookup("#usernameField");
		TextField password = (TextField) button.getScene().lookup("#passwordField");
		Student user = StudentsDatabase.getStudentByUsername(username.getText());

		if (Admin.isAdmin(username.getText(), password.getText())) {
			Stage stage;
			Scene scene;
			Parent root;
			root = FXMLLoader.load(getClass().getResource("./AdminPanel.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root, 700, 700);
			stage.setScene(scene);
			stage.show();

			TextField header = (TextField) scene.lookup("#admin_name_surname");
			header.setText(Admin.username + " : " + Admin.adminID);

		} else if (user != null) {

			if (password.getText().equals(user.getPassword())) {
				Stage stage;
				Scene scene;
				Parent root;
				if(user.firstLogin == false) {
					root = FXMLLoader.load(getClass().getResource("./UnselectedCourses.fxml"));
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					scene = new Scene(root, 700, 700);
					stage.setScene(scene);
					stage.show();
					GlobalVariable.setCurrentUser(user);
					////////////////////////////////////////////////////////////////////////////////////
					SplitMenuButton dropdown1 = (SplitMenuButton) scene.lookup("#selectcourse1");
					SplitMenuButton dropdown2 = (SplitMenuButton) scene.lookup("#selectcourse2");
					SplitMenuButton dropdown3 = (SplitMenuButton) scene.lookup("#selectcourse3");
					SplitMenuButton dropdown4 = (SplitMenuButton) scene.lookup("#selectcourse4");
					SplitMenuButton dropdown5 = (SplitMenuButton) scene.lookup("#selectcourse5");
					////////////////////////////////////////////////////////////////////////////////////
					MenuItem d1choice1 = new MenuItem("Calculus");
					d1choice1.setOnAction((e)-> {
					    dropdown1.setText("Calculus");
					});
					MenuItem d1choice2 = new MenuItem("Computer Organization");
					d1choice2.setOnAction((e)-> {
						dropdown1.setText("Computer Organization");
					});
					MenuItem d1choice3 = new MenuItem("C Programming");
					d1choice3.setOnAction((e)-> {
						dropdown1.setText("C Programming");
					});
					MenuItem d1choice4 = new MenuItem("Electronics");
					d1choice4.setOnAction((e)-> {
						dropdown1.setText("Electronics");
					});
					MenuItem d1choice5 = new MenuItem("Italian");
					d1choice5.setOnAction((e)-> {
						dropdown1.setText("Italian");
					});
					MenuItem d1choice6 = new MenuItem("Linear Algebra");
					d1choice6.setOnAction((e)-> {
						dropdown1.setText("Linear Algebra");
					});
					MenuItem d1choice7 = new MenuItem("Object Oriented Programming");
					d1choice7.setOnAction((e)-> {
						dropdown1.setText("Object Oriented Programming");
					});
					MenuItem d1choice8 = new MenuItem("Parallel Programming");
					d1choice8.setOnAction((e)-> {
						dropdown1.setText("Parallel Programming");
					});
					MenuItem d1choice9 = new MenuItem("Physics");
					d1choice9.setOnAction((e)-> {
						dropdown1.setText("Physics");
					});
					MenuItem d1choice10 = new MenuItem("Probability");
					d1choice10.setOnAction((e)-> {
						dropdown1.setText("Probability");
					});
					dropdown1.getItems().remove(0);
					dropdown1.getItems().remove(0);
					dropdown1.getItems().addAll(d1choice1,d1choice2,d1choice3,d1choice4,d1choice5,d1choice6,
							d1choice7,d1choice8,d1choice9,d1choice10);
					////////////////////////////////////////////////////////////////////////////////////
					MenuItem d2choice1 = new MenuItem("Calculus");
					d2choice1.setOnAction((e)-> {
					    dropdown2.setText("Calculus");
					});
					MenuItem d2choice2 = new MenuItem("Computer Organization");
					d2choice2.setOnAction((e)-> {
						dropdown2.setText("Computer Organization");
					});
					MenuItem d2choice3 = new MenuItem("C Programming");
					d2choice3.setOnAction((e)-> {
						dropdown2.setText("C Programming");
					});
					MenuItem d2choice4 = new MenuItem("Electronics");
					d2choice4.setOnAction((e)-> {
						dropdown2.setText("Electronics");
					});
					MenuItem d2choice5 = new MenuItem("Italian");
					d2choice5.setOnAction((e)-> {
						dropdown2.setText("Italian");
					});
					MenuItem d2choice6 = new MenuItem("Linear Algebra");
					d2choice6.setOnAction((e)-> {
						dropdown2.setText("Linear Algebra");
					});
					MenuItem d2choice7 = new MenuItem("Object Oriented Programming");
					d2choice7.setOnAction((e)-> {
						dropdown2.setText("Object Oriented Programming");
					});
					MenuItem d2choice8 = new MenuItem("Parallel Programming");
					d2choice8.setOnAction((e)-> {
						dropdown2.setText("Parallel Programming");
					});
					MenuItem d2choice9 = new MenuItem("Physics");
					d2choice9.setOnAction((e)-> {
						dropdown2.setText("Physics");
					});
					MenuItem d2choice10 = new MenuItem("Probability");
					d2choice10.setOnAction((e)-> {
						dropdown2.setText("Probability");
					});
					dropdown2.getItems().remove(0);
					dropdown2.getItems().remove(0);
					dropdown2.getItems().addAll(d2choice1,d2choice2,d2choice3,d2choice4,d2choice5,d2choice6,
							d2choice7,d2choice8,d2choice9,d2choice10);
					////////////////////////////////////////////////////////////////////////////////////
					MenuItem d3choice1 = new MenuItem("Calculus");
					d3choice1.setOnAction((e)-> {
					    dropdown3.setText("Calculus");
					});
					MenuItem d3choice2 = new MenuItem("Computer Organization");
					d3choice2.setOnAction((e)-> {
						dropdown3.setText("Computer Organization");
					});
					MenuItem d3choice3 = new MenuItem("C Programming");
					d3choice3.setOnAction((e)-> {
						dropdown3.setText("C Programming");
					});
					MenuItem d3choice4 = new MenuItem("Electronics");
					d3choice4.setOnAction((e)-> {
						dropdown3.setText("Electronics");
					});
					MenuItem d3choice5 = new MenuItem("Italian");
					d3choice5.setOnAction((e)-> {
						dropdown3.setText("Italian");
					});
					MenuItem d3choice6 = new MenuItem("Linear Algebra");
					d3choice6.setOnAction((e)-> {
						dropdown3.setText("Linear Algebra");
					});
					MenuItem d3choice7 = new MenuItem("Object Oriented Programming");
					d3choice7.setOnAction((e)-> {
						dropdown3.setText("Object Oriented Programming");
					});
					MenuItem d3choice8 = new MenuItem("Parallel Programming");
					d3choice8.setOnAction((e)-> {
						dropdown3.setText("Parallel Programming");
					});
					MenuItem d3choice9 = new MenuItem("Physics");
					d3choice9.setOnAction((e)-> {
						dropdown3.setText("Physics");
					});
					MenuItem d3choice10 = new MenuItem("Probability");
					d3choice10.setOnAction((e)-> {
						dropdown3.setText("Probability");
					});
					dropdown3.getItems().remove(0);
					dropdown3.getItems().remove(0);
					dropdown3.getItems().addAll(d3choice1,d3choice2,d3choice3,d3choice4,d3choice5,d3choice6,
							d3choice7,d3choice8,d3choice9,d3choice10);
					////////////////////////////////////////////////////////////////////////////////////
					MenuItem d4choice1 = new MenuItem("Calculus");
					d4choice1.setOnAction((e)-> {
					    dropdown4.setText("Calculus");
					});
					MenuItem d4choice2 = new MenuItem("Computer Organization");
					d4choice2.setOnAction((e)-> {
						dropdown4.setText("Computer Organization");
					});
					MenuItem d4choice3 = new MenuItem("C Programming");
					d4choice3.setOnAction((e)-> {
						dropdown4.setText("C Programming");
					});
					MenuItem d4choice4 = new MenuItem("Electronics");
					d4choice4.setOnAction((e)-> {
						dropdown4.setText("Electronics");
					});
					MenuItem d4choice5 = new MenuItem("Italian");
					d4choice5.setOnAction((e)-> {
						dropdown4.setText("Italian");
					});
					MenuItem d4choice6 = new MenuItem("Linear Algebra");
					d4choice6.setOnAction((e)-> {
						dropdown4.setText("Linear Algebra");
					});
					MenuItem d4choice7 = new MenuItem("Object Oriented Programming");
					d4choice7.setOnAction((e)-> {
						dropdown4.setText("Object Oriented Programming");
					});
					MenuItem d4choice8 = new MenuItem("Parallel Programming");
					d4choice8.setOnAction((e)-> {
						dropdown4.setText("Parallel Programming");
					});
					MenuItem d4choice9 = new MenuItem("Physics");
					d4choice9.setOnAction((e)-> {
						dropdown4.setText("Physics");
					});
					MenuItem d4choice10 = new MenuItem("Probability");
					d4choice10.setOnAction((e)-> {
						dropdown4.setText("Probability");
					});
					dropdown4.getItems().remove(0);
					dropdown4.getItems().remove(0);
					dropdown4.getItems().addAll(d4choice1,d4choice2,d4choice3,d4choice4,d4choice5,d4choice6,
							d4choice7,d4choice8,d4choice9,d4choice10);
					////////////////////////////////////////////////////////////////////////////////////
					MenuItem d5choice1 = new MenuItem("Calculus");
					d5choice1.setOnAction((e)-> {
					    dropdown5.setText("Calculus");
					});
					MenuItem d5choice2 = new MenuItem("Computer Organization");
					d5choice2.setOnAction((e)-> {
						dropdown5.setText("Computer Organization");
					});
					MenuItem d5choice3 = new MenuItem("C Programming");
					d5choice3.setOnAction((e)-> {
						dropdown5.setText("C Programming");
					});
					MenuItem d5choice4 = new MenuItem("Electronics");
					d5choice4.setOnAction((e)-> {
						dropdown5.setText("Electronics");
					});
					MenuItem d5choice5 = new MenuItem("Italian");
					d5choice5.setOnAction((e)-> {
						dropdown5.setText("Italian");
					});
					MenuItem d5choice6 = new MenuItem("Linear Algebra");
					d5choice6.setOnAction((e)-> {
						dropdown5.setText("Linear Algebra");
					});
					MenuItem d5choice7 = new MenuItem("Object Oriented Programming");
					d5choice7.setOnAction((e)-> {
						dropdown5.setText("Object Oriented Programming");
					});
					MenuItem d5choice8 = new MenuItem("Parallel Programming");
					d5choice8.setOnAction((e)-> {
						dropdown5.setText("Parallel Programming");
					});
					MenuItem d5choice9 = new MenuItem("Physics");
					d5choice9.setOnAction((e)-> {
						dropdown5.setText("Physics");
					});
					MenuItem d5choice10 = new MenuItem("Probability");
					d5choice10.setOnAction((e)-> {
						dropdown5.setText("Probability");
					});
					dropdown5.getItems().remove(0);
					dropdown5.getItems().remove(0);
					dropdown5.getItems().addAll(d5choice1,d5choice2,d5choice3,d5choice4,d5choice5,d5choice6,
							d5choice7,d5choice8,d5choice9,d5choice10);
					////////////////////////////////////////////////////////////////////////////////////

				}else {
					root = FXMLLoader.load(getClass().getResource("./StudentPanel.fxml"));
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					scene = new Scene(root, 700, 700);
					stage.setScene(scene);
					stage.show();
					GlobalVariable.setCurrentUser(user);
					TextField header = (TextField) scene.lookup("#student_name_surname");
					header.setText(user.getName() + " " + user.getSurname() + " : " + user.getStudentID());
				}
				
				
				
			} else {
				Stage stage;
				Scene scene;
				Parent root;
				root = FXMLLoader.load(getClass().getResource("./Error.fxml"));
				stage = new Stage(StageStyle.UNDECORATED);
				stage.initModality(Modality.APPLICATION_MODAL);
				scene = new Scene(root, 250, 150);
				stage.setScene(scene);
				stage.showAndWait();
			}

		}

		else {
			Stage stage;
			Scene scene;
			Parent root;
			root = FXMLLoader.load(getClass().getResource("./Error.fxml"));
			stage = new Stage(StageStyle.UNDECORATED);
			stage.initModality(Modality.APPLICATION_MODAL);
			scene = new Scene(root, 250, 150);
			stage.setScene(scene);
			stage.showAndWait();
		}

	}

	/*
	 * public void onMouseReleased(MouseEvent event) throws IOException { Button
	 * button = (Button) event.getSource();
	 * button.setStyle("-fx-background-color: #3392FF;");
	 * 
	 * root = FXMLLoader.load(getClass().getResource("./StudentPanel.fxml")); stage
	 * = (Stage) ((Node) event.getSource()).getScene().getWindow(); scene = new
	 * Scene(root,600,400); stage.setScene(scene); stage.show(); }
	 */
}