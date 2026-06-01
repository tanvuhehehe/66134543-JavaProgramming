package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// tạo hàng dọc
		Label title = new Label("DAY LA APP QUAN LY SINH VIEN");
		title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
		VBox hangdoc1 = new VBox(10);
		Label lb1 = new Label("Ma SV: ");
		Label lb2 = new Label("Ten SV: ");
		
		//Nhap du lieu
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		//Design
		tf1.setPromptText("Nhap ma sinh vien");
		tf2.setPromptText("Nhap ten sinh vien");
		tf1.setPrefWidth(250);
		tf2.setPrefWidth(250);
		lb1.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
		lb2.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
		hangdoc1.setPadding(new Insets(20));
		title.setStyle(
			    "-fx-font-size: 20px; " +
			    "-fx-font-weight: bold; " +
			    "-fx-text-fill: blue;"
			);
		// Them do hang
		HBox hangngang1 = new HBox(10);
		HBox hangngang2 = new HBox(10);
		// them cho giong bai
		hangngang1.getChildren().addAll(lb1, tf1);
		hangngang2.getChildren().addAll(lb2, tf2);
		
		Button btn1 = new Button("+ Them");
		Button btn2 = new Button("- Xoa");
		btn1.setStyle(
			    "-fx-background-color: #4CAF50; " +
			    "-fx-text-fill: white; " +
			    "-fx-font-weight: bold;"
			);

			btn2.setStyle(
			    "-fx-background-color: #F44336; " +
			    "-fx-text-fill: white; " +
			    "-fx-font-weight: bold;"
			);

			btn1.setPrefWidth(100);
			btn2.setPrefWidth(100);
		HBox hangngang3 = new HBox(10);
		hangngang3.getChildren().addAll(btn1, btn2);
		
	
		Label lbDanhSach = new Label("DANH SACH SINH VIEN");
		lbDanhSach.setStyle(
			"-fx-font-size: 16px; " +
			"-fx-font-weight: bold;"
		);
		ListView<String> list = new ListView<>();
		list.setPrefHeight(250);
		btn1.setOnAction(e -> {
			
			if(tf1.getText().trim().isEmpty() || tf1.getText().trim().isEmpty()) {
				Alert alert1 = new Alert(Alert.AlertType.ERROR);
				alert1.setContentText("Khong duoc de trong");
				alert1.showAndWait();
				return;
			}
		    String ma = tf1.getText();
		    String ten = tf2.getText();

		    list.getItems().add(ma + " - " + ten);
		    tf1.clear();
		    tf2.clear();
		});
		
		btn2.setOnAction(e -> {
			String hangdangchonxoa = list.getSelectionModel().getSelectedItem();
			list.getItems().remove(hangdangchonxoa);
		});
		list.setStyle(
				"-fx-border-color: lightgray; " +
				"-fx-border-radius: 5;"
			);
		hangdoc1.getChildren().addAll(title, hangngang1, hangngang2, hangngang3,lbDanhSach,list);
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
