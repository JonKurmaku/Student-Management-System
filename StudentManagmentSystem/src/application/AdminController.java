package application;

import java.io.IOException;
import java.util.Set;

import database.Student;
import database.StudentsDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class AdminController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	
	public void onMousePressed(MouseEvent event) throws IOException
	{
		Button button = (Button) event.getSource();
		button.setStyle("-fx-background-color: #002e73;"); 
		
		
	}
	
	public void DisplayStudents(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./DisplayStudents.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 1200, 700);
		stage.setScene(scene);
		stage.centerOnScreen();
		
		
		TableView<Student> table = new TableView<>();
		ObservableList<Student> observableArrayList = 
		           FXCollections.observableArrayList(StudentsDatabase.getStudents());
		setUpTableColumns(table);
		table.setItems(observableArrayList);
		table.setMaxWidth(1200);
		table.setMinHeight(525);
		table.setTranslateY(85);
		
		ScrollBar table1HorizontalScrollBar = findScrollBar( table, Orientation.HORIZONTAL);
		ScrollBar table1VerticalScrollBar = findScrollBar( table, Orientation.VERTICAL);
		
		
		VBox vbox = new VBox(table);
		((Pane) scene.getRoot()).getChildren().add(vbox);
		
		
		stage.show();
		
		
		
		

	}
	
	@SuppressWarnings("unused")
	private ScrollBar findScrollBar(TableView<?> table, Orientation orientation) {

        // this would be the preferred solution, but it doesn't work. it always gives back the vertical scrollbar
        //      return (ScrollBar) table.lookup(".scroll-bar:horizontal");
        //      
        // => we have to search all scrollbars and return the one with the proper orientation

        Set<Node> set = table.lookupAll(".scroll-bar");
        for( Node node: set) {
            ScrollBar bar = (ScrollBar) node;
            if( bar.getOrientation() == orientation) {
                return bar;
            }
        }

        return null;

    }
	
	@SuppressWarnings("unchecked")
	private void setUpTableColumns(TableView<Student> table) {
		TableColumn<Student, String> dateCol = new TableColumn<>("Name");
        dateCol.setPrefWidth(100);
        dateCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Student, String> value1Col = new TableColumn<>("Surname");
        value1Col.setPrefWidth(100);
        value1Col.setCellValueFactory(new PropertyValueFactory<>("surname"));

        TableColumn<Student, String> value2Col = new TableColumn<>("Birthday");
        value2Col.setPrefWidth(100);
        value2Col.setCellValueFactory(new PropertyValueFactory<>("birthday"));

        TableColumn<Student, String> value3Col = new TableColumn<>("Gender");
        value3Col.setPrefWidth(100);
        value3Col.setCellValueFactory(new PropertyValueFactory<>("gender"));
        
        TableColumn<Student, String> value4Col = new TableColumn<>("Nationality");
        value4Col.setPrefWidth(100);
        value4Col.setCellValueFactory(new PropertyValueFactory<>("citizenship"));
        
        TableColumn<Student, String> value5Col = new TableColumn<>("Birthplace");
        value5Col.setPrefWidth(100);
        value5Col.setCellValueFactory(new PropertyValueFactory<>("birthplace"));
        
        TableColumn<Student, String> value6Col = new TableColumn<>("Student ID");
        value6Col.setPrefWidth(100);
        value6Col.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        
        TableColumn<Student, String> value7Col = new TableColumn<>("Father");
        value7Col.setPrefWidth(100);
        value7Col.setCellValueFactory(new PropertyValueFactory<>("dad"));
        
        TableColumn<Student, String> value8Col = new TableColumn<>("Mother");
        value8Col.setPrefWidth(100);
        value8Col.setCellValueFactory(new PropertyValueFactory<>("mom"));
        
        TableColumn<Student, String> value9Col = new TableColumn<>("Registration Date");
        value9Col.setPrefWidth(100);
        value9Col.setCellValueFactory(new PropertyValueFactory<>("reg_date"));
        
        TableColumn<Student, String> value10Col = new TableColumn<>("Status");
        value10Col.setPrefWidth(100);
        value10Col.setCellValueFactory(new PropertyValueFactory<>("status"));
        
        TableColumn<Student, String> value11Col = new TableColumn<>("Faculty");
        value11Col.setPrefWidth(100);
        value11Col.setCellValueFactory(new PropertyValueFactory<>("faculty"));
        
        TableColumn<Student, String> value12Col = new TableColumn<>("Department");
        value12Col.setPrefWidth(100);
        value12Col.setCellValueFactory(new PropertyValueFactory<>("departament"));
        
        TableColumn<Student, String> value13Col = new TableColumn<>("Program");
        value13Col.setPrefWidth(100);
        value13Col.setCellValueFactory(new PropertyValueFactory<>("program"));
        
        TableColumn<Student, String> value14Col = new TableColumn<>("Degree");
        value14Col.setPrefWidth(100);
        value14Col.setCellValueFactory(new PropertyValueFactory<>("degree"));
        
        TableColumn<Student, Double> value15Col = new TableColumn<>("GPA");
        value15Col.setPrefWidth(100);
        value15Col.setCellValueFactory(new PropertyValueFactory<>("GPA"));

        table.getColumns().addAll( value6Col,dateCol, value1Col, value2Col, value3Col,value4Col,value5Col,value7Col,
        		value8Col,value9Col,value10Col,value11Col,value12Col,value13Col,value14Col,value15Col);
	}
	
	public void AddStudent(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./AddStudent.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	
	public void ModifyStudent(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./AdminStudentSelectorEdit.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	
	public void RemoveStudent(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./AdminStudentSelectorDelete.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	
	public void Coursebook(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./Coursebook.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}
	
	public void LogOut(MouseEvent event) throws IOException {
		Button button = (Button) event.getSource();

		root = FXMLLoader.load(getClass().getResource("./LogIn.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.show();

	}

}
