package ies.montecillos.deslizamientocortesyon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class APPUsoSelector extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Carga el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ies/montecillos/deslizamientocortesyon/appuso_selector.fxml"));

        // Crea la escena y asignar la escena cargada desde FXML
        Scene scene = new Scene(loader.load());

        // Muestra la ventana
        stage.setScene(scene);
        stage.setTitle("APP Uso Selector");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
