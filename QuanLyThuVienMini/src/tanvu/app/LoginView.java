package tanvu.app;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginView {

	public Scene createScene(Stage primaryStage) {
		HBox root = new HBox(10);
		
		Image img1 = new Image("file:htvimg/logo.jpg");
		ImageView imgv1 = new ImageView(img1);
		imgv1.setFitHeight(150);
		imgv1.setFitWidth(150);
		
		root.getChildren().addAll(imgv1);
		Label lb1 = new Label("ĐĂNG NHẬP HỆ THỐNG");
		Label lb2  = new Label("Tên đăng nhập: ");
		PasswordField pw1 = new PasswordField();
		
		
		
		
		
		
		
		return new Scene(root, 700, 500);
	}

}
