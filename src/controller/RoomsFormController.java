package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomsFormController {
    public AnchorPane roomFormContext;
    public AnchorPane availableRoomContext;

    public void backToPackages(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void addOrEdit(ActionEvent actionEvent) {
    }

    public void saveUpdates(ActionEvent actionEvent) {
    }

    public void nextPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void previousPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackagesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void availableRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewRoom/AvailableRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        availableRoomContext.getChildren().clear();
        availableRoomContext.getChildren().add(load);
    }
}
