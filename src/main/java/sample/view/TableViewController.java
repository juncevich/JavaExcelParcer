package sample.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Main;
import sample.model.Person;
import sample.util.ExcelDataReader;

import java.io.File;
import java.io.IOException;

public class TableViewController {
    private final ObservableList<Person> usersData = FXCollections.observableArrayList();
    @FXML
    private TableView<Person> tablePerson;
    @FXML
    private TableColumn<Person, String> codeSMO;
    @FXML
    private TableColumn<Person, String> polisVersion;
    @FXML
    private TableColumn<Person, String> polisNumber;
    @FXML
    private TableColumn<Person, String> firstName;
    @FXML
    private TableColumn<Person, String> secondName;
    @FXML
    private TableColumn<Person, String> lastName;
    @FXML
    private TableColumn<Person, String> birthday;



    // инициализируем форму данными
    @FXML
    private void initialize() {


        // устанавливаем тип и значение которое должно хранится в колонке
        codeSMO.setCellValueFactory(cellData -> cellData.getValue().codeSMOProperty());
        polisVersion.setCellValueFactory(cellData -> cellData.getValue().polisVersionProperty());
        polisNumber.setCellValueFactory(cellData -> cellData.getValue().polisNumberProperty());
        firstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        secondName.setCellValueFactory(cellData -> cellData.getValue().secondNameProperty());
        lastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        birthday.setCellValueFactory(cellData -> cellData.getValue().birthdayProperty());

        // заполняем таблицу данными
        tablePerson.setItems(usersData);

//        openFile.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                openFile.setText("Thanks!");
//            }
//        });


    }



    public void handleOpenButtonAction() {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All files", "*.*"),
                new FileChooser.ExtensionFilter("XLS", "*.xls"));

        File file = fileChooser.showOpenDialog(null);
        usersData.addAll(ExcelDataReader.readFile(file.getPath()));
    }

    @FXML
    private void handleOptionsButtonAction(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent root1 = FXMLLoader.load(getClass().getResource("/fxml/test.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root1);
        stage.setTitle("ABC");
        stage.setScene(scene);
        stage.show();


    }
}
