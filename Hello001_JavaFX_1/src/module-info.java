module Hello001_JavaFX_1 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
