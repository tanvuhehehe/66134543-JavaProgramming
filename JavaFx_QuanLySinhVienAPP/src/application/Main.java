package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// tạo hàng dọc
		VBox hangdoc1 = new VBox(10);
		Label lb1 = new Label("Ma SV: ");
		Label lb2 = new Label("Ten SV: ");
		//Nhap du lieu
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		// Them do hang
		HBox hangngang1 = new HBox(10);
		HBox hangngang2 = new HBox(10);
		// them cho giong bai
		hangngang1.getChildren().addAll(lb1, tf1);
		hangngang2.getChildren().addAll(lb2, tf2);
		
		Button btn1 = new Button("Them");
		Button btn2 = new Button("Xoa");
		btn1.setStyle("-fx-background-color: green; -fx-text-fill: white;");
		btn2.setStyle("-fx-background-color: red; -fx-text-fill: white;");
		HBox hangngang3 = new HBox(10);
		hangngang3.getChildren().addAll(btn1, btn2);
		hangdoc1.getChildren().addAll(hangngang1, hangngang2, hangngang3);
		// tao cua so nhin
		Scene scn = new Scene(hangdoc1, 500, 500);
		primaryStage.setTitle("Quan Ly Sinh Vien");
		primaryStage.setScene(scn);
		primaryStage.show();
}
	public static void main(String[] args) {
		launch(args);
	}
}
