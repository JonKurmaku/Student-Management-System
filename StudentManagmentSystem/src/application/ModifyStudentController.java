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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ModifyStudentController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	
	public void CheckByID(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		scene = button.getScene();
		
		TextField header = (TextField) scene.lookup("#IdSelector");
		Student student = StudentsDatabase.getStudentById(header.getText());
	    GlobalVariable.currentStudent = StudentsDatabase.getStudentById(header.getText());
	
		if(student == null) {

			root = FXMLLoader.load(getClass().getResource("./Error.fxml"));
			stage = new Stage(StageStyle.UNDECORATED);
			stage.initModality(Modality.APPLICATION_MODAL);
			scene = new Scene(root, 250, 150);
			stage.setScene(scene);
			stage.showAndWait();			
		}else {
			
			root = FXMLLoader.load(getClass().getResource("./AdminGradesModify.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root, 700, 700);
			stage.setScene(scene);
			
			Student user = GlobalVariable.getCurrentStudent();
			TextField name1 = (TextField) scene.lookup("#courseName1");
			name1.setText(user.course1.name);
			TextField name2 = (TextField) scene.lookup("#courseName2");
			name2.setText(user.course2.name);
			TextField name3 = (TextField) scene.lookup("#courseName3");
			name3.setText(user.course3.name);
			
			TextField course1Grade1 = (TextField) scene.lookup("#course1MEg");
			course1Grade1.setText(Integer.toString(user.course1.midterm_exam));
			TextField course1Grade2 = (TextField) scene.lookup("#course1FEg");
			course1Grade2.setText(Integer.toString(user.course1.final_exam));
			TextField course1Grade3 = (TextField) scene.lookup("#course1HWg");
			course1Grade3.setText(Integer.toString(user.course1.homework));
			TextField course1Grade4 = (TextField) scene.lookup("#course1Fg");
			course1Grade4.setText(Integer.toString(user.course1.final_grade));
			TextField course1Grade5 = (TextField) scene.lookup("#course1FgL");
			course1Grade5.setText(user.course1.letter_grade);
			
			
			TextField course2Grade1 = (TextField) scene.lookup("#course2MEg");
			course2Grade1.setText(Integer.toString(user.course2.midterm_exam));
			TextField course2Grade2 = (TextField) scene.lookup("#course2FEg");
			course2Grade2.setText(Integer.toString(user.course2.final_exam));
			TextField course2Grade3 = (TextField) scene.lookup("#course2HWg");
			course2Grade3.setText(Integer.toString(user.course2.homework));
			TextField course2Grade4 = (TextField) scene.lookup("#course2Fg");
			course2Grade4.setText(Integer.toString(user.course2.final_grade));
			TextField course2Grade5 = (TextField) scene.lookup("#course2FgL");
			course2Grade5.setText(user.course2.letter_grade);

			TextField course3Grade1 = (TextField) scene.lookup("#course3MEg");
			course3Grade1.setText(Integer.toString(user.course3.midterm_exam));
			TextField course3Grade2 = (TextField) scene.lookup("#course3FEg");
			course3Grade2.setText(Integer.toString(user.course3.final_exam));
			TextField course3Grade3 = (TextField) scene.lookup("#course3HWg");
			course3Grade3.setText(Integer.toString(user.course3.homework));
			TextField course3Grade4 = (TextField) scene.lookup("#course3Fg");
			course3Grade4.setText(Integer.toString(user.course3.final_grade));
			TextField course3Grade5 = (TextField) scene.lookup("#course3FgL");
			course3Grade5.setText(user.course3.letter_grade);
			
			stage.show();
		}
		
	}
	
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
