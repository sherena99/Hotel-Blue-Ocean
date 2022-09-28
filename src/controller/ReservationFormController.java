package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customer;
import view.tm.CustomerTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class ReservationFormController {
    public AnchorPane reservationFormContext;
    public JFXTextField txtName;
    public JFXTextField txtNicNumber;
    public JFXTextField txtEmail;
    public JFXTextField txtMobileNumber;
    public JFXTextField txtAddress;
    public JFXTextField txtId;
    public JFXTextField txtAge;
    public JFXTextField txtDate;
    public JFXTextField txtTime;
    public JFXTextField txtDuration;
    public JFXTextField txtSelectedPackage;
    public JFXTextField txtSelectedRoom;
    public JFXTextField txtSelectedMeals;
    public JFXTextField txtCost;

    public TableView tblCustomers;
    public TableColumn colID;
    public TableColumn colName;
    public TableColumn colAge;
    public TableColumn colEmail;
    public TableColumn colNic;
    public TableColumn colAddress;
    public TableColumn colMNum;
    public TableColumn colDate;
    public TableColumn colTime;
    public TableColumn colDuration;
    public TableColumn colPackage;
    public TableColumn colRoom;
    public TableColumn colMeal;
    public TableColumn colCost;
    public TableColumn colDelete;

    static ArrayList<Customer> customerList = new ArrayList();
    public TextField txtSearch;

    public void initialize() {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nicNumber"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("mobileNumber"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("date"));
        colDuration.setCellValueFactory(new PropertyValueFactory<>("time"));
        colPackage.setCellValueFactory(new PropertyValueFactory<>("selectedPackage"));
        colRoom.setCellValueFactory(new PropertyValueFactory<>("selectedRoom"));
        colMeal.setCellValueFactory(new PropertyValueFactory<>("selectedMeal"));
        colCost.setCellValueFactory(new PropertyValueFactory<>("totalCost"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));

        txtSearch.textProperty().addListener((observable, oldValue, txt) -> {
            for (Customer c : customerList
            ) {
                if (c.getId().contains(txt)
                        ||
                        c.getEmail().contains(txt)
                        ||
                        c.getName().contains(txt)
                        ||
                        c.getNicNumber().contains(txt)
                ) {
                    System.out.println(c);
                }
            }

        });
    }



    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reservationFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void previousPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reservationFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void addOrEdit(ActionEvent actionEvent) {
    }

    public void PrintForm(ActionEvent actionEvent) {
    }

    public void EmailForm(ActionEvent actionEvent) {
    }

    public boolean isExists(Customer customer){
        for (Customer t: customerList
             ) {
            if (t.getId().equalsIgnoreCase(customer.getId())){
                return false;
            }
        }
        return true;
    }

    public void SaveUpdate(ActionEvent actionEvent) {

        Customer customer=new Customer(txtId.getText(),txtName.getText(),txtAge.getText(),txtEmail.getText(),txtNicNumber.getText(),txtAddress.getText(),txtMobileNumber.getText(),
                txtDate.getText(),txtTime.getText(),txtDuration.getText(),txtSelectedPackage.getText(),txtSelectedRoom.getText(),txtSelectedMeals.getText(),txtCost.getText());

        txtId.clear(); txtName.clear(); txtAge.clear(); txtEmail.clear(); txtNicNumber.clear(); txtAddress.clear(); txtMobileNumber.clear();
        txtDate.clear(); txtTime.clear(); txtDuration.clear(); txtSelectedPackage.clear(); txtSelectedRoom.clear(); txtSelectedMeals.clear(); txtCost.clear(); 


        if (isExists(customer)) {
            if (customerList.add(customer)) {
                loadAllCustomers();
                new Alert(Alert.AlertType.CONFIRMATION, "Successfully Saved...!", ButtonType.CLOSE).show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again...!", ButtonType.CLOSE).show();
            }
        }else {
            new Alert(Alert.AlertType.WARNING, "Already Exists...!", ButtonType.CLOSE).show();
        }

    }
    private void loadAllCustomers() {
        ObservableList<CustomerTM> tmObservableList = FXCollections.observableArrayList();
        for (Customer temp : customerList
        ) {
            Button btn = new Button("Delete");
            tmObservableList.add(
                    new CustomerTM(temp.getId(), temp.getName(), temp.getAge(), temp.getEmail(), temp.getNicNumber(), temp.getAddress(), temp.getMobileNumber(), temp.getDate(), temp.getTime(), temp.getDuration(), temp.getSelectedPackage(), temp.getSelectedRoom(), temp.getSelectedMeals(), temp.getTotalCost(), btn)
            );

            btn.setOnAction((e) -> {

                ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                        , "Do you want to delete this Customer?", yes, no);
                alert.setTitle("Confirmation Alert");

                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no) == yes) {
                    customerList.remove(temp);
                    loadAllCustomers();
                } else {

                }
            });

            tblCustomers.setItems(tmObservableList);

        }
    }

    public void searchCustomer(ActionEvent actionEvent) {

    }
}
