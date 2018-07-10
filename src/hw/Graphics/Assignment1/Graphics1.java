package hw.Graphics.Assignment1;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.shape.ArcType;

public class Graphics1 extends Application {

	// 1. Make the Length and Height values the same.
	// 2. use the strokeArc.OPEN with the start angle at 0 and arc angle 180
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root);
		Canvas canvas = new Canvas(420, 200);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.strokeOval(50, 25, 100, 100);
		gc.strokeOval(110, 75, 100, 100);
		gc.strokeOval(160, 25, 100, 100);
		gc.strokeOval(220, 75, 100, 100);
		gc.strokeOval(270, 25, 100, 100);
		root.getChildren().add(canvas);
		primaryStage.setTitle("Olymic Rings");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
