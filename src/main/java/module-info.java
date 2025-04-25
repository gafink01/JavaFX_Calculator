module calculator.app.javafx_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens calculator.app.javafx_calculator to javafx.fxml;
    exports calculator.app.javafx_calculator;
}