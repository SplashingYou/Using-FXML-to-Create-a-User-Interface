module com.mycompany.mavenproject8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject8 to javafx.fxml;
    exports com.mycompany.mavenproject8;
}
