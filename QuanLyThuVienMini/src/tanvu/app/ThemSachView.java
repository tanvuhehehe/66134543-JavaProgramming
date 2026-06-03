package tanvu.app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ThemSachView {
    public Scene createScene(Stage primaryStage) {

        VBox root = new VBox(20);

        Label title = new Label("THÊM SÁCH MỚI");

        GridPane gp = new GridPane();

        Label lbMa = new Label("Mã sách:");
        TextField tfMa = new TextField();

        Label lbTen = new Label("Tên sách:");
        TextField tfTen = new TextField();

        Label lbLoai = new Label("Thể loại:");
        ComboBox<String> cbLoai = new ComboBox<>();
        cbLoai.getItems().addAll(
                "CNTT",
                "Tiểu thuyết",
                "Văn học",
                "Khoa học"
        );

        Label lbTinhTrang = new Label("Tình trạng:");

        RadioButton rdCon = new RadioButton("Còn hàng");
        RadioButton rdHet = new RadioButton("Hết hàng");

        ToggleGroup tg = new ToggleGroup();
        rdCon.setToggleGroup(tg);
        rdHet.setToggleGroup(tg);

        rdCon.setSelected(true);

        HBox hbTinhTrang = new HBox(20);
        hbTinhTrang.getChildren().addAll(rdCon, rdHet);

        Label lbGhiChu = new Label("Ghi chú:");
        TextArea taGhiChu = new TextArea();

        gp.add(lbMa, 0, 0);
        gp.add(tfMa, 1, 0);

        gp.add(lbTen, 0, 1);
        gp.add(tfTen, 1, 1);

        gp.add(lbLoai, 0, 2);
        gp.add(cbLoai, 1, 2);

        gp.add(lbTinhTrang, 0, 3);
        gp.add(hbTinhTrang, 1, 3);

        gp.add(lbGhiChu, 0, 4);
        gp.add(taGhiChu, 1, 4);

        Button btnLuu = new Button("Lưu");
        Button btnBack = new Button("Quay lại");

        HBox buttonBox = new HBox(20);
        buttonBox.getChildren().addAll(btnLuu, btnBack);

        root.getChildren().addAll(
                title,
                gp,
                buttonBox
        );

        // Sự kiện quay lại
        btnBack.setOnAction(e -> {
            HomeView hv = new HomeView();
            primaryStage.setScene(hv.createScene(primaryStage));
        });

        // Design
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.TOP_CENTER);

        gp.setHgap(15);
        gp.setVgap(15);

        title.setStyle(
                "-fx-font-size:24px;" +
                "-fx-font-weight:bold;" +
                "-fx-text-fill:#0D47A1;"
        );

        tfMa.setPrefWidth(300);
        tfTen.setPrefWidth(300);
        cbLoai.setPrefWidth(300);

        taGhiChu.setPrefRowCount(3);

        btnLuu.setStyle(
                "-fx-background-color:#2196F3;" +
                "-fx-text-fill:white;" +
                "-fx-font-weight:bold;"
        );

        btnBack.setStyle(
                "-fx-font-weight:bold;"
        );

        return new Scene(root, 700, 500);
    }
}
