package tanvu.app;
	


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
		Label title = new Label("CONPUTER SIMPLE CALCULATOR");
		title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
		Label lb1 = new Label("Number 1: ");
		TextField tf1 = new TextField();
		Label lb2 = new Label("Number 2: ");
		TextField tf2 = new TextField();
		Label lb3 = new Label("Result: ");
		TextField tf3 = new TextField();
		
		HBox hb1 = new HBox(10);
		hb1.getChildren().addAll(lb1, tf1, lb2, tf2, lb3, tf3);
		Button btn1 = new Button(" + ");
		Button btn2 = new Button(" - ");
		Button btn3 = new Button(" x ");
		Button btn4 = new Button(" / ");
		
		HBox vb2 = new HBox(10);
		vb2.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		VBox vb1 = new VBox(10);
		vb1.getChildren().addAll(title, hb1, vb2);
		
		btn1.setOnAction(e -> {
		    try {
		        double a = Double.parseDouble(tf1.getText());
		        double b = Double.parseDouble(tf2.getText());

		        double kq = a + b;

		        tf3.setText(String.valueOf(kq));
		    } catch (Exception ex) {
		        tf3.setText("ERROR");
		    }
		});

		btn2.setOnAction(e -> {
		    try {
		        double a = Double.parseDouble(tf1.getText());
		        double b = Double.parseDouble(tf2.getText());

		        double kq = a - b;

		        tf3.setText(String.valueOf(kq));
		    } catch (Exception ex) {
		        tf3.setText("ERROR");
		    }
		});

		btn3.setOnAction(e -> {
		    try {
		        double a = Double.parseDouble(tf1.getText());
		        double b = Double.parseDouble(tf2.getText());

		        double kq = a * b;

		        tf3.setText(String.valueOf(kq));
		    } catch (Exception ex) {
		        tf3.setText("ERROR");
		    }
		});

		btn4.setOnAction(e -> {
		    try {
		        double a = Double.parseDouble(tf1.getText());
		        double b = Double.parseDouble(tf2.getText());

		        if (b == 0) {
		            tf3.setText("Khong chia duoc cho 0");
		        } else {
		            double kq = a / b;
		            tf3.setText(String.valueOf(kq));
		        }
		    } catch (Exception ex) {
		        tf3.setText("ERROR");
		    }
		});
		//màn hình
		Scene scn = new Scene(vb1, 1000, 500);
		primaryStage.setTitle("Simple Calculator ");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
