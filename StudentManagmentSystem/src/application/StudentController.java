package application;

import java.io.IOException;

import database.GlobalVariable;
import database.Student;
import javafx.event.EventHandler;
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

public class StudentController {

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void onMousePressed(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;");

	}

	public void PersonalInfo(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./StudentPersonalInfo.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();
		
		Student student = GlobalVariable.getCurrentUser();

		TextField name_field = (TextField) scene.lookup("#student_name");
		name_field.setText(student.getName());
		
		TextField surname_field = (TextField) scene.lookup("#student_surname");
		surname_field.setText(student.getSurname());
		
		TextField id_field = (TextField) scene.lookup("#student_id");
		id_field.setText(student.getStudentID());
		
		TextField reg_field = (TextField) scene.lookup("#student_regdate");
		reg_field.setText(student.getReg_date());
		
		TextField birthday_field = (TextField) scene.lookup("#student_birthday");
		birthday_field.setText(student.getBirthday());
		
		TextField gender_field = (TextField) scene.lookup("#student_gender");
		gender_field.setText(student.getGender());
		
		TextField status_field = (TextField) scene.lookup("#student_status");
		status_field.setText(student.getStatus());
		
		TextField citizenship_field = (TextField) scene.lookup("#student_citizenship");
		citizenship_field.setText(student.getCitizenship());
		
		TextField father_field = (TextField) scene.lookup("#student_dad");
		father_field.setText(student.getDad());
		
		TextField mother_field = (TextField) scene.lookup("#student_mom");
		mother_field.setText(student.getMom());
		
		TextField degree_field = (TextField) scene.lookup("#student_degree");
		degree_field.setText(student.getDegree());
		
		TextField department_field = (TextField) scene.lookup("#student_department");
		department_field.setText(student.getDepartament());
		
		TextField faculty_field = (TextField) scene.lookup("#student_faculty");
		faculty_field.setText(student.getFaculty());
		
		TextField program_field = (TextField) scene.lookup("#student_program");
		program_field.setText(student.getProgram());
	}

	public void Course(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("./StudentCourses.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		Student user = GlobalVariable.getCurrentUser();
		TextField name1 = (TextField) scene.lookup("#course1");
		name1.setText(user.course1.name);
		TextField name2 = (TextField) scene.lookup("#course2");
		name2.setText(user.course2.name);
		TextField name3 = (TextField) scene.lookup("#course3");
		name3.setText(user.course3.name);
		TextField name4 = (TextField) scene.lookup("#course4");
		name4.setText(user.e_course1.name);
		TextField name5 = (TextField) scene.lookup("#course5");
		name5.setText(user.e_course2.name);
		
		Button drop1 = (Button) scene.lookup("#drop1");
		drop1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
		    public void handle(MouseEvent t) {
				if(user.course1.dropped == false) {
					user.course1.dropped = true;
					user.course1.name += " (Dropped)";
					name1.setText(user.course1.name);
				}
			}
		});
		Button drop2 = (Button) scene.lookup("#drop2");
		drop2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
		    public void handle(MouseEvent t) {
				if(user.course2.dropped == false) {
					user.course2.dropped = true;
					user.course2.name += " (Dropped)";
					name2.setText(user.course2.name);
				}
			}
		});
		Button drop3 = (Button) scene.lookup("#drop3");
		drop3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
		    public void handle(MouseEvent t) {
				if(user.course3.dropped == false) {
					user.course3.dropped = true;
					user.course3.name += " (Dropped)";
					name3.setText(user.course3.name);
				}
			}
		});
		Button drop4 = (Button) scene.lookup("#drop4");
		drop4.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
		    public void handle(MouseEvent t) {
				if(user.e_course1.dropped == false) {
					user.e_course1.dropped = true;
					user.e_course1.name += " (Dropped)";
					name4.setText(user.e_course1.name);
				}
			}
		});
		Button drop5 = (Button) scene.lookup("#drop5");
		drop5.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
		    public void handle(MouseEvent t) {
				if(user.e_course2.dropped == false) {
					user.e_course2.dropped = true;
					user.e_course2.name += " (Dropped)";
					name5.setText(user.e_course2.name);
				}
			}
		});
		Button syllabus1 = (Button) scene.lookup("#syllabusc1");
		
		syllabus1.setOnMouseClicked(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(MouseEvent t) {
		      String n1 = name1.getText();
		      //System.out.println("Clicked");
		      try {
			      if(n1.equals("Calculus")) {
			    	root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Calculus.fxml"));
			  		stage = new Stage();
			  		stage.initModality(Modality.APPLICATION_MODAL);
			  		scene = new Scene(root, 700, 700);
			  		stage.setScene(scene);
			  		stage.showAndWait();
			      }
			      if(n1.equals("Computer Organization")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ComputerOrganization.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("C Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_CProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Electronics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_EEC.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
			      if(n1.equals("Italian")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Italian.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Linear Algebra")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_LinearAlgebra.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Object Oriented Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_OOP.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();			  
			      }
			      if(n1.equals("Physics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Physics.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait(); 
			      }
			      if(n1.equals("Probability")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Probability.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();	  
			      }
			      if(n1.equals("Parallel Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ParallelProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
		      }catch(Exception e){
		    	  
		      }
		    }
		 });
		
Button syllabus2 = (Button) scene.lookup("#syllabusc2");
		
		syllabus2.setOnMouseClicked(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(MouseEvent t) {
		      String n1 = name2.getText();
		      try {
			      if(n1.equals("Calculus")) {
			    	root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Calculus.fxml"));
			  		stage = new Stage();
			  		stage.initModality(Modality.APPLICATION_MODAL);
			  		scene = new Scene(root, 700, 700);
			  		stage.setScene(scene);
			  		stage.showAndWait();
			      }
			      if(n1.equals("Computer Organization")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ComputerOrganization.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("C Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_CProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Electronics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_EEC.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
			      if(n1.equals("Italian")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Italian.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Linear Algebra")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_LinearAlgebra.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Object Oriented Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_OOP.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();			  
			      }
			      if(n1.equals("Physics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Physics.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait(); 
			      }
			      if(n1.equals("Probability")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Probability.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();	  
			      }
			      if(n1.equals("Parallel Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ParallelProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
		      }catch(Exception e){
		    	  
		      }
		    }
		 });
		
Button syllabus3 = (Button) scene.lookup("#syllabusc3");
		
		syllabus3.setOnMouseClicked(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(MouseEvent t) {
		      String n1 = name3.getText();
		      try {
			      if(n1.equals("Calculus")) {
			    	root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Calculus.fxml"));
			  		stage = new Stage();
			  		stage.initModality(Modality.APPLICATION_MODAL);
			  		scene = new Scene(root, 700, 700);
			  		stage.setScene(scene);
			  		stage.showAndWait();
			      }
			      if(n1.equals("Computer Organization")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ComputerOrganization.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("C Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_CProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Electronics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_EEC.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
			      if(n1.equals("Italian")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Italian.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Linear Algebra")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_LinearAlgebra.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Object Oriented Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_OOP.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();			  
			      }
			      if(n1.equals("Physics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Physics.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait(); 
			      }
			      if(n1.equals("Probability")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Probability.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();	  
			      }
			      if(n1.equals("Parallel Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ParallelProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
		      }catch(Exception e){
		    	  
		      }
		    }
		 });
		
Button syllabus4 = (Button) scene.lookup("#syllabusc4");
		
		syllabus4.setOnMouseClicked(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(MouseEvent t) {
		      String n1 = name4.getText();
		      try {
			      if(n1.equals("Calculus")) {
			    	root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Calculus.fxml"));
			  		stage = new Stage();
			  		stage.initModality(Modality.APPLICATION_MODAL);
			  		scene = new Scene(root, 700, 700);
			  		stage.setScene(scene);
			  		stage.showAndWait();
			      }
			      if(n1.equals("Computer Organization")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ComputerOrganization.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("C Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_CProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Electronics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_EEC.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
			      if(n1.equals("Italian")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Italian.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Linear Algebra")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_LinearAlgebra.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Object Oriented Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_OOP.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();			  
			      }
			      if(n1.equals("Physics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Physics.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait(); 
			      }
			      if(n1.equals("Probability")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Probability.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();	  
			      }
			      if(n1.equals("Parallel Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ParallelProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
		      }catch(Exception e){
		    	  
		      }
		    }
		 });
		
Button syllabus5 = (Button) scene.lookup("#syllabusc5");
		
		syllabus5.setOnMouseClicked(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(MouseEvent t) {
		      String n1 = name5.getText();
		      try {
			      if(n1.equals("Calculus")) {
			    	root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Calculus.fxml"));
			  		stage = new Stage();
			  		stage.initModality(Modality.APPLICATION_MODAL);
			  		scene = new Scene(root, 700, 700);
			  		stage.setScene(scene);
			  		stage.showAndWait();
			      }
			      if(n1.equals("Computer Organization")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ComputerOrganization.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("C Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_CProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Electronics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_EEC.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
			      if(n1.equals("Italian")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Italian.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Linear Algebra")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_LinearAlgebra.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();
			      }
			      if(n1.equals("Object Oriented Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_OOP.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();			  
			      }
			      if(n1.equals("Physics")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Physics.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait(); 
			      }
			      if(n1.equals("Probability")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_Probability.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();	  
			      }
			      if(n1.equals("Parallel Programming")) {
			    	  root = FXMLLoader.load(getClass().getResource("./Pop_Syllabus_ParallelProgramming.fxml"));
				  		stage = new Stage();
				  		stage.initModality(Modality.APPLICATION_MODAL);
				  		scene = new Scene(root, 700, 700);
				  		stage.setScene(scene);
				  		stage.showAndWait();  
			      }
		      }catch(Exception e){
		    	  
		      }
		    }
		 });
		
		stage.show();
		

	}

	public void InterimGrades(MouseEvent event) throws IOException {
		
		root = FXMLLoader.load(getClass().getResource("./InterimGrades.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		
		Student user = GlobalVariable.getCurrentUser();
		
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
		
		
		stage.show();
		

	}

	public void Transcript(MouseEvent event) throws IOException {

		
		root = FXMLLoader.load(getClass().getResource("./Transcript.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

		TextField cgpa = (TextField) scene.lookup("#tf_cgpa");
		Student user = GlobalVariable.getCurrentUser();
		double gpa = user.course1.final_grade+user.course2.final_grade+user.course3.final_grade+user.e_course1.final_grade+user.e_course2.final_grade;
		cgpa.setText(Double.toString((gpa)/5));
		
	}
	
	public void LogOut(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("./LogIn.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	public void BackToMain(MouseEvent event) throws IOException {
		

		root = FXMLLoader.load(getClass().getResource("./StudentPanel.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		Student user = GlobalVariable.getCurrentUser();
		TextField header = (TextField) scene.lookup("#student_name_surname");
		header.setText(user.getName() + " " + user.getSurname() + " : " + user.getStudentID());
		stage.show();

	}
	
	public void BackToNewCourses(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("./StudentCourses.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	
	
	
	
	

	
}
