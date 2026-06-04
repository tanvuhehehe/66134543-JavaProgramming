package tanvu.app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class GameView {

    private Button[][] btn = new Button[3][3];
    private boolean xTurn = true;
    private Label lbTurn = new Label("Lượt hiện tại: X");

    public Scene createScene() {

        VBox root = new VBox(20);

        Label title = new Label("CARO 3x3");

        GridPane gp = new GridPane();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                btn[i][j] = new Button();

                btn[i][j].setPrefSize(100, 100);

                btn[i][j].setStyle(
                        "-fx-font-size:30px;" +
                        "-fx-font-weight:bold;"
                );

                int row = i;
                int col = j;

                btn[row][col].setOnAction(e -> {

                    if (btn[row][col].getText().isEmpty()) {

                        String player;

                        if (xTurn) {
                            player = "X";
                        } else {
                            player = "O";
                        }

                        btn[row][col].setText(player);

                        if (checkWin(player)) {

                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setHeaderText(null);
                            alert.setContentText(player + " thắng!");
                            alert.showAndWait();

                            resetGame();
                            return;
                        }

                        xTurn = !xTurn;

                        if (xTurn) {
                            lbTurn.setText("Lượt hiện tại: X");
                        } else {
                            lbTurn.setText("Lượt hiện tại: O");
                        }
                    }
                });

                gp.add(btn[i][j], j, i);
            }
        }

        Button btnReset = new Button("Chơi lại");

        btnReset.setOnAction(e -> resetGame());

        title.setStyle(
                "-fx-font-size:28px;" +
                "-fx-font-weight:bold;" +
                "-fx-text-fill:#1565C0;"
        );

        btnReset.setStyle(
                "-fx-background-color:#2196F3;" +
                "-fx-text-fill:white;" +
                "-fx-font-weight:bold;"
        );

        gp.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                gp,
                lbTurn,
                btnReset
        );

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color:#F5F7FA;");

        return new Scene(root, 450, 500);
    }

    private boolean checkWin(String p) {

        for (int i = 0; i < 3; i++) {

            if (btn[i][0].getText().equals(p)
                    && btn[i][1].getText().equals(p)
                    && btn[i][2].getText().equals(p))
                return true;

            if (btn[0][i].getText().equals(p)
                    && btn[1][i].getText().equals(p)
                    && btn[2][i].getText().equals(p))
                return true;
        }

        if (btn[0][0].getText().equals(p)
                && btn[1][1].getText().equals(p)
                && btn[2][2].getText().equals(p))
            return true;

        if (btn[0][2].getText().equals(p)
                && btn[1][1].getText().equals(p)
                && btn[2][0].getText().equals(p))
            return true;

        return false;
    }

    private void resetGame() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                btn[i][j].setText("");
            }
        }

        xTurn = true;
        lbTurn.setText("Lượt hiện tại: X");
    }
}