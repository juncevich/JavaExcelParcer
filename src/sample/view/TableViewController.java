package sample.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.model.Person;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class TableViewController {
    private ObservableList<Person> usersData = FXCollections.observableArrayList();
    @FXML
    private TableView<Person> tablePerson;
    @FXML
    private TableColumn<Person, Integer> codeSMO;
    @FXML
    private TableColumn<Person, Integer> polisVersion;
    @FXML
    private TableColumn<Person, Integer> polisNumber;
    @FXML
    private TableColumn<Person, String> firstName;
    @FXML
    private TableColumn<Person, String> secondName;
    @FXML
    private TableColumn<Person, String> lastName;
    @FXML
    private TableColumn<Person, LocalDate> birthday;
    @FXML
    private Button openFile;



    // инициализируем форму данными
    @FXML
    private void initialize() {
        initData();



        // устанавливаем тип и значение которое должно хранится в колонке
        codeSMO.setCellValueFactory(cellData -> cellData.getValue().codeSMOProperty().asObject());
        polisVersion.setCellValueFactory(cellData -> cellData.getValue().polisVersionProperty().asObject());
        polisNumber.setCellValueFactory(cellData -> cellData.getValue().polisNumberProperty().asObject());
        firstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        secondName.setCellValueFactory(cellData -> cellData.getValue().secondNameProperty());
        lastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        birthday.setCellValueFactory(cellData -> cellData.getValue().birthdayProperty());

        // заполняем таблицу данными
        tablePerson.setItems(usersData);


    }

    // подготавливаем данные для таблицы
    // вы можете получать их с базы данных
    private void initData() {
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));
        usersData.add(new Person(74, 3, 555555, "firstName", "secondName", "lastName", LocalDate.of(1999, 2, 21)));

    }



    public void handleOpenButtonAction(ActionEvent actionEvent) {
        System.out.println("Test");
    }
}
