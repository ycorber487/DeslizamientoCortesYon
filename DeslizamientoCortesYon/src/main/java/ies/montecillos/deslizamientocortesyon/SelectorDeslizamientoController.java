package ies.montecillos.deslizamientocortesyon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class SelectorDeslizamientoController {

    @FXML
    private SelectorDeslizamiento selectorUp;

    @FXML
    private SelectorDeslizamiento selectorDown;

    @FXML
    private Label messageLabel;

    // Maneja la acción del primer SelectorDeslizamiento
    @FXML
    private void handleSelectorUp(MouseEvent event) {
        messageLabel.setText("Seleccionaste el Selector de Arriba");
    }

    // Maneja la acción del segundo SelectorDeslizamiento
    @FXML
    private void handleSelectorDown(MouseEvent event) {
        messageLabel.setText("Seleccionaste el Selector de Abajo");
    }
}
