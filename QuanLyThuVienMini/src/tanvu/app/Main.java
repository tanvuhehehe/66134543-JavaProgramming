package tanvu.app;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		LoginView lg = new LoginView();
		primaryStage.setTitle("Đăng nhập");
		primaryStage.setScene(lg.createScene(primaryStage));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
