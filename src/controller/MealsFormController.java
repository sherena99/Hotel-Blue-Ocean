package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MealsFormController {
    public AnchorPane mealsFormContext;
    public AnchorPane mealDetailsContext;

    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void addOrEdit(ActionEvent actionEvent) {
    }

    public void SaveUpdates(ActionEvent actionEvent) {
    }

    public void nextPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReservationForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void previousPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void localMeals(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewMeals/LocalMealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealDetailsContext.getChildren().clear();
        mealDetailsContext.getChildren().add(load);
    }

    public void chineseMeals(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewMeals/ChineseMealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealDetailsContext.getChildren().clear();
        mealDetailsContext.getChildren().add(load);
    }

    public void frenchMeals(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../viewMeals/FrenchMealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealDetailsContext.getChildren().clear();
        mealDetailsContext.getChildren().add(load);

    }
}
