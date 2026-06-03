package tanvu.app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView {

	public Scene createScene(Stage primaryStage) {
		HBox root = new HBox(10);
		VBox vb1 = new VBox(10);
		Image img1 = new Image("file:htvimg/logo.jpg");
		ImageView imgv1 = new ImageView(img1);
		imgv1.setFitHeight(150);
		imgv1.setFitWidth(150);
		
		Label lb1 = new Label("ĐĂNG NHẬP HỆ THỐNG");
		Label lb2  = new Label("Tên đăng nhập: ");
		TextField tf1 = new TextField();
		Label lb3 = new Label("Mật khẩu: ");
		PasswordField pw1 = new PasswordField();
		GridPane gp = new GridPane();
		gp.add(lb2, 0, 0);
		gp.add(tf1, 1, 0);
		gp.add(lb3, 0, 1);
		gp.add(pw1, 1, 1);
		
		
		
		Button btn = new Button("Đăng Nhập");
		
		vb1.getChildren().addAll(lb1, gp, btn);
		root.getChildren().addAll(imgv1, vb1);
		//Sự kiện
		btn.setOnAction(e ->{
			if(tf1.getText().equals("admin") && pw1.getText().equals("123")) {
				HomeView hv = new HomeView();
				primaryStage.setTitle("Trang chủ");
				primaryStage.setScene(hv.createScene(primaryStage));
			}else {
					Alert alert1 = new Alert(Alert.AlertType.ERROR);
					alert1.setContentText("Thông tin đăng nhập không hợp lệ !!!");
					alert1.showAndWait();
					return;
			}	
		});
		//Design
		gp.setHgap(30);
		gp.setVgap(10);
		lb1.setStyle("-fx-font-weight: bold;-fx-font-size: 27px;-fx-text-fill: blue");
		lb2.setStyle("-fx-font-weight: bold");
		lb3.setStyle("-fx-font-weight: bold");	
		vb1.setPadding(new Insets(10));
		btn.setStyle(
			    "-fx-background-color: blue;" + "-fx-text-fill: white;" +"-fx-font-weight: bold;" + "-fx-background-radius: 10;"
			);
		tf1.setPrefWidth(190);
		pw1.setPrefWidth(190);
		return new Scene(root, 600, 300);
	}

}
