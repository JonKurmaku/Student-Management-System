package application;

import java.io.IOException;

import database.Admin;
import database.GlobalVariable;
import database.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StudentInterimGradesController {
	
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
	public void Back2(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		Student user = GlobalVariable.getCurrentUser();
		root = FXMLLoader.load(getClass().getResource("./InterimGrades.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
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
		TextField course1Grade5 = (TextField) scene.lookup("#course1Lg");
		course1Grade5.setText(user.course1.letter_grade);
		
		
		TextField course2Grade1 = (TextField) scene.lookup("#course2MEg");
		course2Grade1.setText(Integer.toString(user.course2.midterm_exam));
		TextField course2Grade2 = (TextField) scene.lookup("#course2FEg");
		course2Grade2.setText(Integer.toString(user.course2.final_exam));
		TextField course2Grade3 = (TextField) scene.lookup("#course2HWg");
		course2Grade3.setText(Integer.toString(user.course2.homework));
		TextField course2Grade4 = (TextField) scene.lookup("#course2Fg");
		course2Grade4.setText(Integer.toString(user.course2.final_grade));
		TextField course2Grade5 = (TextField) scene.lookup("#course2Lg");
		course2Grade5.setText(user.course2.letter_grade);

		TextField course3Grade1 = (TextField) scene.lookup("#course3MEg");
		course3Grade1.setText(Integer.toString(user.course3.midterm_exam));
		TextField course3Grade2 = (TextField) scene.lookup("#course3FEg");
		course3Grade2.setText(Integer.toString(user.course3.final_exam));
		TextField course3Grade3 = (TextField) scene.lookup("#course3HWg");
		course3Grade3.setText(Integer.toString(user.course3.homework));
		TextField course3Grade4 = (TextField) scene.lookup("#course3Fg");
		course3Grade4.setText(Integer.toString(user.course3.final_grade));
		TextField course3Grade5 = (TextField) scene.lookup("#course3Lg");
		course3Grade5.setText(user.course3.letter_grade);

		
		//TextField header = (TextField) scene.lookup("#admin_name_surname");
		//header.setText(Admin.username + " : " + Admin.adminID);
		stage.show();

	}
	public void ExtraCourses(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./ExtraGrades.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		
		Student user = GlobalVariable.getCurrentUser();
		
		System.out.println(user.course1.midterm_exam);
		
		TextField name4 = (TextField) scene.lookup("#courseName4");
		name4.setText(user.e_course1.name);
		TextField name5 = (TextField) scene.lookup("#courseName5");
		name5.setText(user.e_course2.name);
		
		TextField course4Grade1 = (TextField) scene.lookup("#retakecourse1MEg");
		course4Grade1.setText(Integer.toString(user.e_course1.midterm_exam));
		TextField course4Grade2 = (TextField) scene.lookup("#retakecourse1FEg");
		course4Grade2.setText(Integer.toString(user.e_course1.final_exam));
		TextField course4Grade3 = (TextField) scene.lookup("#retakecourse1HWg");
		course4Grade3.setText(Integer.toString(user.e_course1.homework));
		TextField course4Grade4 = (TextField) scene.lookup("#retakeFg1");
		course4Grade4.setText(Integer.toString(user.e_course1.final_grade));
		TextField course4Grade5 = (TextField) scene.lookup("#retakeLg1");
		course4Grade5.setText(user.e_course1.letter_grade);

		TextField course5Grade1 = (TextField) scene.lookup("#retakecourse2MEg");
		course5Grade1.setText(Integer.toString(user.e_course2.midterm_exam));
		TextField course5Grade2 = (TextField) scene.lookup("#retakecourse2FEg");
		course5Grade2.setText(Integer.toString(user.e_course2.final_exam));
		TextField course5Grade3 = (TextField) scene.lookup("#retakecourse2HWg");
		course5Grade3.setText(Integer.toString(user.e_course2.homework));
		TextField course5Grade4 = (TextField) scene.lookup("#retakeFg2");
		course5Grade4.setText(Integer.toString(user.e_course2.final_grade));
		TextField course5Grade5 = (TextField) scene.lookup("#retakeLg2");
		course5Grade5.setText(user.e_course2.letter_grade);
		
		stage.show();

	}
}
