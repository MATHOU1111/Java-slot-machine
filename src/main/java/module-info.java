module com.example.slotmachine {
    requires javafx.controls;
    requires javafx.fxml;


    opens slotMachine to javafx.fxml;
    exports slotMachine;
}