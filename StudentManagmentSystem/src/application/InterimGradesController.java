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

public class InterimGradesController {

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

	public void Back2(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./AdminGradesModify.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		//////////////////////////////////////////////// ****************
		Student user = GlobalVariable.getCurrentStudent();
		//////////////////////////////////////////////// **************
		TextField name1 = (TextField) scene.lookup("#courseName1");
		name1.setText(user.course1.name);
		TextField name2 = (TextField) scene.lookup("#courseName2");
		name2.setText(user.course2.name);
		TextField name3 = (TextField) scene.lookup("#courseName3");
		name3.setText(user.course3.name);
		stage.show();
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

	}

	public void ExtraCourses(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./AdminExtraGradeModify.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);

		Student user = GlobalVariable.getCurrentStudent();
		TextField name4 = (TextField) scene.lookup("#courseName4");
		name4.setText(user.e_course1.name);
		TextField name5 = (TextField) scene.lookup("#courseName5");
		name5.setText(user.e_course2.name);

		stage.show();

	}

	public void CalcGPA(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		scene = button.getScene();

		TextField course1 = (TextField) scene.lookup("#course1MEg");
		TextField course2 = (TextField) scene.lookup("#course1FEg");
		TextField course3 = (TextField) scene.lookup("#course1HWg");
		TextField grade = (TextField) scene.lookup("#course1Fg");
		TextField gradeLetter = (TextField) scene.lookup("#course1FgL");

		if (course1.getText().equals("") || course2.getText().equals("") || course3.getText().equals("")) {

		} else {
			int c1 = Integer.parseInt(course1.getText());
			int c2 = Integer.parseInt(course2.getText());
			int c3 = Integer.parseInt(course3.getText());

			Student student = GlobalVariable.getCurrentStudent();
			
			if(student.course1.dropped == true) {
				
			}else {
			
				double result = c1 * 0.3 + c2 * 0.5 + c3 * 0.2;
				grade.setText(String.valueOf(result));
				if (result == 0) {
					gradeLetter.setText("NA");
					student.course1.letter_grade = "NA";
				} else if (result < 50) {
					gradeLetter.setText("FF");
					student.course1.letter_grade = "FF";
				} else if (result < 60) {
					gradeLetter.setText("FD");
					student.course1.letter_grade = "FD";
				} else if (result < 65) {
					gradeLetter.setText("DD");
					student.course1.letter_grade = "DD";
				} else if (result < 70) {
					gradeLetter.setText("DC");
					student.course1.letter_grade = "DC";
				} else if (result < 75) {
					gradeLetter.setText("CC");
					student.course1.letter_grade = "CC";
				} else if (result < 80) {
					gradeLetter.setText("CB");
					student.course1.letter_grade = "CB";
				} else if (result < 85) {
					gradeLetter.setText("BB");
					student.course1.letter_grade = "BB";
				} else if (result < 90) {
					gradeLetter.setText("BA");
					student.course1.letter_grade = "BA";
				} else if (result <= 100) {
					gradeLetter.setText("AA");
					student.course1.letter_grade = "AA";
				}
				
				student.course1.midterm_exam = Integer.parseInt(course1.getText());
				student.course1.homework = Integer.parseInt(course3.getText());
				student.course1.final_exam = Integer.parseInt(course2.getText());
				student.course1.final_grade = (int) Math.floor(result);
			}
		}

	}

	public void CalcGPA1(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		scene = button.getScene();
		
		Student student = GlobalVariable.getCurrentStudent();
		//student.course.dropped == false

		TextField course1 = (TextField) scene.lookup("#course2MEg");
		TextField course2 = (TextField) scene.lookup("#course2FEg");
		TextField course3 = (TextField) scene.lookup("#course2HWg");
		TextField grade = (TextField) scene.lookup("#course2Fg");
		TextField gradeLetter = (TextField) scene.lookup("#course2FgL");

		if (course1.getText().equals("") || course2.getText().equals("") || course3.getText().equals("")) {

		} else {
			int c1 = Integer.parseInt(course1.getText());
			int c2 = Integer.parseInt(course2.getText());
			int c3 = Integer.parseInt(course3.getText());

			double result = c1 * 0.3 + c2 * 0.5 + c3 * 0.2;
			grade.setText(String.valueOf(result));
			if (result == 0) {
				gradeLetter.setText("NA");
				student.course2.letter_grade = "NA";
			} else if (result < 50) {
				gradeLetter.setText("FF");
				student.course2.letter_grade = "FF";
			} else if (result < 60) {
				gradeLetter.setText("FD");
				student.course2.letter_grade = "FD";
			} else if (result < 65) {
				gradeLetter.setText("DD");
				student.course2.letter_grade = "DD";
			} else if (result < 70) {
				gradeLetter.setText("DC");
				student.course2.letter_grade = "DC";
			} else if (result < 75) {
				gradeLetter.setText("CC");
				student.course2.letter_grade = "CC";
			} else if (result < 80) {
				gradeLetter.setText("CB");
				student.course2.letter_grade = "CB";
			} else if (result < 85) {
				gradeLetter.setText("BB");
				student.course2.letter_grade = "BB";
			} else if (result < 90) {
				gradeLetter.setText("BA");
				student.course2.letter_grade = "BA";
			} else if (result <= 100) {
				gradeLetter.setText("AA");
				student.course2.letter_grade = "AA";
			}
			
			student.course2.midterm_exam = Integer.parseInt(course1.getText());
			student.course2.homework = Integer.parseInt(course3.getText());
			student.course2.final_exam = Integer.parseInt(course2.getText());
			student.course2.final_grade = (int) Math.floor(result);
			
			

		}
		
		
	}

	public void CalcGPA2(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		scene = button.getScene();

		TextField course1 = (TextField) scene.lookup("#course3MEg");
		TextField course2 = (TextField) scene.lookup("#course3FEg");
		TextField course3 = (TextField) scene.lookup("#course3HWg");
		TextField grade = (TextField) scene.lookup("#course3Fg");
		TextField gradeLetter = (TextField) scene.lookup("#course3FgL");
		
		Student student = GlobalVariable.getCurrentStudent();

		if (course1.getText().equals("") || course2.getText().equals("") || course3.getText().equals("")) {

		} else {
			int c1 = Integer.parseInt(course1.getText());
			int c2 = Integer.parseInt(course2.getText());
			int c3 = Integer.parseInt(course3.getText());

			double result = c1 * 0.3 + c2 * 0.5 + c3 * 0.2;
			grade.setText(String.valueOf(result));
			if (result == 0) {
				gradeLetter.setText("NA");
				student.course3.letter_grade = "NA";
			} else if (result < 50) {
				gradeLetter.setText("FF");
				student.course3.letter_grade = "FF";
			} else if (result < 60) {
				gradeLetter.setText("FD");
				student.course3.letter_grade = "FD";
			} else if (result < 65) {
				gradeLetter.setText("DD");
				student.course3.letter_grade = "DD";
			} else if (result < 70) {
				gradeLetter.setText("DC");
				student.course3.letter_grade = "DC";
			} else if (result < 75) {
				gradeLetter.setText("CC");
				student.course3.letter_grade = "CC";
			} else if (result < 80) {
				gradeLetter.setText("CB");
				student.course3.letter_grade = "CB";
			} else if (result < 85) {
				gradeLetter.setText("BB");
				student.course3.letter_grade = "BB";
			} else if (result < 90) {
				gradeLetter.setText("BA");
				student.course3.letter_grade = "BA";
			} else if (result <= 100) {
				gradeLetter.setText("AA");
				student.course3.letter_grade = "AA";
			}
			
			student.course3.midterm_exam = Integer.parseInt(course1.getText());
			student.course3.homework = Integer.parseInt(course3.getText());
			student.course3.final_exam = Integer.parseInt(course2.getText());
			student.course3.final_grade = (int) Math.floor(result);
		}

	}

	public void CalcGPA3(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		scene = button.getScene();

		TextField course1 = (TextField) scene.lookup("#course4MEg");
		TextField course2 = (TextField) scene.lookup("#course4FEg");
		TextField course3 = (TextField) scene.lookup("#course4HWg");
		TextField grade = (TextField) scene.lookup("#course4Fg");
		TextField gradeLetter = (TextField) scene.lookup("#course4FgL");
		
		Student student = GlobalVariable.getCurrentStudent();

		if (course1.getText().equals("") || course2.getText().equals("") || course3.getText().equals("")) {

		} else {
			int c1 = Integer.parseInt(course1.getText());
			int c2 = Integer.parseInt(course2.getText());
			int c3 = Integer.parseInt(course3.getText());

			
			
			double result = c1 * 0.3 + c2 * 0.5 + c3 * 0.2;
			grade.setText(String.valueOf(result));
			if (result == 0) {
				gradeLetter.setText("NA");
				student.e_course1.letter_grade = "NA";
			} else if (result < 50) {
				gradeLetter.setText("FF");
				student.e_course1.letter_grade = "FF";
			} else if (result < 60) {
				gradeLetter.setText("FD");
				student.e_course1.letter_grade = "FD";
			} else if (result < 65) {
				gradeLetter.setText("DD");
				student.e_course1.letter_grade = "DD";
			} else if (result < 70) {
				gradeLetter.setText("DC");
				student.e_course1.letter_grade = "DC";
			} else if (result < 75) {
				gradeLetter.setText("CC");
				student.e_course1.letter_grade = "CC";
			} else if (result < 80) {
				gradeLetter.setText("CB");
				student.e_course1.letter_grade = "CB";
			} else if (result < 85) {
				gradeLetter.setText("BB");
				student.e_course1.letter_grade = "BB";
			} else if (result < 90) {
				gradeLetter.setText("BA");
				student.e_course1.letter_grade = "BA";
			} else if (result <= 100) {
				gradeLetter.setText("AA");
				student.e_course1.letter_grade = "AA";
			}
			
			student.e_course1.midterm_exam = Integer.parseInt(course1.getText());
			student.e_course1.homework = Integer.parseInt(course3.getText());
			student.e_course1.final_exam = Integer.parseInt(course2.getText());
			student.e_course1.final_grade = (int) Math.floor(result);

		}

	}

	public void CalcGPA4(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		scene = button.getScene();

		TextField course1 = (TextField) scene.lookup("#course5MEg");
		TextField course2 = (TextField) scene.lookup("#course5FEg");
		TextField course3 = (TextField) scene.lookup("#course5HWg");
		TextField grade = (TextField) scene.lookup("#course5Fg");
		TextField gradeLetter = (TextField) scene.lookup("#course5FgL");

		Student student = GlobalVariable.getCurrentStudent();
		
		if (course1.getText().equals("") || course2.getText().equals("") || course3.getText().equals("")) {

		} else {
			int c1 = Integer.parseInt(course1.getText());
			int c2 = Integer.parseInt(course2.getText());
			int c3 = Integer.parseInt(course3.getText());

			double result = c1 * 0.3 + c2 * 0.5 + c3 * 0.2;
			grade.setText(String.valueOf(result));
			if (result == 0) {
				gradeLetter.setText("NA");
				student.e_course2.letter_grade = "NA";
			} else if (result < 50) {
				gradeLetter.setText("FF");
				student.e_course2.letter_grade = "FF";
			} else if (result < 60) {
				gradeLetter.setText("FD");
				student.e_course2.letter_grade = "FD";
			} else if (result < 65) {
				gradeLetter.setText("DD");
				student.e_course2.letter_grade = "DD";
			} else if (result < 70) {
				gradeLetter.setText("DC");
				student.e_course2.letter_grade = "DC";
			} else if (result < 75) {
				gradeLetter.setText("CC");
				student.e_course2.letter_grade = "CC";
			} else if (result < 80) {
				gradeLetter.setText("CB");
				student.e_course2.letter_grade = "CB";
			} else if (result < 85) {
				gradeLetter.setText("BB");
				student.e_course2.letter_grade = "BB";
			} else if (result < 90) {
				gradeLetter.setText("BA");
				student.e_course2.letter_grade = "BA";
			} else if (result <= 100) {
				gradeLetter.setText("AA");
				student.e_course2.letter_grade = "AA";
			}
			
			student.e_course2.midterm_exam = Integer.parseInt(course1.getText());
			student.e_course2.homework = Integer.parseInt(course3.getText());
			student.e_course2.final_exam = Integer.parseInt(course2.getText());
			student.e_course2.final_grade = (int) Math.floor(result);

		}

	}

}
