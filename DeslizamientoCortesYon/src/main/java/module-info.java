module ies.montecillos.deslizamientocortesyon {
    requires javafx.controls;
    requires javafx.fxml;


    opens ies.montecillos.deslizamientocortesyon to javafx.fxml;
    exports ies.montecillos.deslizamientocortesyon;
}