package tanvu.app;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GameView gv = new GameView();

        primaryStage.setTitle("Caro 3x3");
        primaryStage.setScene(gv.createScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}