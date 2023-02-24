module com.nationclicks.nationclicks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nationclicks.nationclicks to javafx.fxml;
    exports com.nationclicks.nationclicks;
}