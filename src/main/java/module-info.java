module es.tierno.dam {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.tierno.dam to javafx.fxml;
    exports es.tierno.dam;
}
