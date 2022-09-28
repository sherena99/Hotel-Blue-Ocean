package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class packagesFormController {
    public AnchorPane packageFormContext;
    public AnchorPane fullBoardPackageContext;


    public void previousPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) packageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void addOrEdit(ActionEvent actionEvent) {
    }

    public void SaveUpdate(ActionEvent actionEvent) {
    }

    public void nextPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) packageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }



    public void openPackageDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewPackages/FullBoardPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        fullBoardPackageContext.getChildren().clear();
        fullBoardPackageContext.getChildren().add(load);
    }

    public void halfBoardContext(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewPackages/HalfBoardPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        fullBoardPackageContext.getChildren().clear();
        fullBoardPackageContext.getChildren().add(load);
    }

    public void HoneymoonPackageContext(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewPackages/HoneymoonPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        fullBoardPackageContext.getChildren().clear();
        fullBoardPackageContext.getChildren().add(load);
    }

    public void familyPackageContext(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewPackages/FamilyPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        fullBoardPackageContext.getChildren().clear();
        fullBoardPackageContext.getChildren().add(load);
    }
}
