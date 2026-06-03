package tanvu.app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DanhSachSachView {

    public Scene createScene(Stage primaryStage) {

        VBox root = new VBox(20);

        Label title = new Label("DANH SÁCH SÁCH");

        ListView<String> lvSach = new ListView<>();

        ObservableList<String> dsSach = FXCollections.observableArrayList(
                "MS01 - Harry Potter - Tiểu thuyết - Còn hàng",
                "MS02 - Dế Mèn phiêu lưu ký - Văn học - Còn hàng",
                "MS03 - Java cơ bản - CNTT - Hết hàng"
        );

        lvSach.setItems(dsSach);

        Button btnXoa = new Button("Xóa");
        Button btnBack = new Button("Quay lại");

        HBox hb = new HBox(20);
        hb.getChildren().addAll(btnXoa, btnBack);

        root.getChildren().addAll(title, lvSach, hb);

        // Xóa sách được chọn
        btnXoa.setOnAction(e -> {
            int index = lvSach.getSelectionModel().getSelectedIndex();

            if(index >= 0) {
                dsSach.remove(index);
            }
        });

        // Quay lại
        btnBack.setOnAction(e -> {
            HomeView hv = new HomeView();
            primaryStage.setScene(hv.createScene(primaryStage));
        });

        root.setPadding(new Insets(20));
        root.setAlignment(Pos.TOP_CENTER);

        title.setStyle(
                "-fx-font-size:24px;" +
                "-fx-font-weight:bold;" +
                "-fx-text-fill:blue;"
        );

        lvSach.setPrefSize(600, 300);

        return new Scene(root, 700, 500);
    }
}