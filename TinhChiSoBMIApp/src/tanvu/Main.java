package tanvu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

    	
        VBox root = new VBox(15);

        Label title = new Label("TÍNH CHỈ SỐ BMI");

        Label lb1 = new Label("Chiều cao (m):");
        TextField tfHeight = new TextField();

        Label lb2 = new Label("Cân nặng (kg):");
        TextField tfWeight = new TextField();

        Button btnTinh = new Button("TÍNH BMI");

        Label lbBMI = new Label("BMI: ");
        Label lbLoai = new Label("Phân loại: ");

        btnTinh.setOnAction(e -> {

            try {

                double h = Double.parseDouble(tfHeight.getText());
                double w = Double.parseDouble(tfWeight.getText());

                double bmi = w / (h * h);

                lbBMI.setText(String.format("BMI: %.2f", bmi));

                if (bmi < 18.5) {
                    lbLoai.setText("Phân loại: Thiếu cân");
                } else if (bmi < 25) {
                    lbLoai.setText("Phân loại: Bình thường");
                } else if (bmi < 30) {
                    lbLoai.setText("Phân loại: Thừa cân");
                } else {
                    lbLoai.setText("Phân loại: Béo phì");
                }

            } catch (Exception ex) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập số hợp lệ!");
                alert.showAndWait();
            }
        });

        root.getChildren().addAll(
                title,
                lb1, tfHeight,
                lb2, tfWeight,
                btnTinh,
                lbBMI,
                lbLoai
        );

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        title.setStyle(
                "-fx-font-size: 28px;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: #1565C0;"
        );

        btnTinh.setStyle(
                "-fx-background-color: #2196F3;" +
                "-fx-text-fill: white;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 10;"
        );

        btnTinh.setPrefSize(150, 40);

        Scene scene = new Scene(root, 450, 400);

        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}