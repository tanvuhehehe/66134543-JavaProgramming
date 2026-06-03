package tanvu.app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeView {

    public Scene createScene(Stage primaryStage) {

        VBox root = new VBox(30);

        Label title = new Label("QUẢN LÝ THƯ VIỆN");

        Button btnThem = new Button("Thêm sách");
        Button btnDS = new Button("Danh sách sách");
        Button btnLogout = new Button("Đăng xuất");

        HBox menu = new HBox(20);
        menu.getChildren().addAll(btnThem, btnDS, btnLogout);

        root.getChildren().addAll(title, menu);

        // Design
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        menu.setAlignment(Pos.CENTER);

        title.setStyle(
                "-fx-font-size: 28px;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: #0D47A1;"
        );

        btnThem.setPrefSize(150, 80);
        btnDS.setPrefSize(150, 80);
        btnLogout.setPrefSize(150, 80);

        btnThem.setStyle(
                "-fx-font-size:16px;" +
                "-fx-font-weight:bold;"
        );

        btnDS.setStyle(
                "-fx-font-size:16px;" +
                "-fx-font-weight:bold;"
        );

        btnLogout.setStyle(
                "-fx-font-size:16px;" +
                "-fx-font-weight:bold;"
        );

        // Sự kiện Đăng xuất
        btnLogout.setOnAction(e -> {
            LoginView lg = new LoginView();

            primaryStage.setTitle("Đăng nhập");
            primaryStage.setScene(lg.createScene(primaryStage));
        });

        // Chưa làm
        btnThem.setOnAction(e -> {

        });

        btnDS.setOnAction(e -> {

        });

        return new Scene(root, 700, 400);
    }
}