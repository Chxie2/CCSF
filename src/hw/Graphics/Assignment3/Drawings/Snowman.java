package hw.Graphics.Assignment3.Drawings;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Snowman extends Application{

	public static void main(String[] args) {
		launch(args);
	}	
	@Override
	public void start(Stage primaryStage) throws Exception {
		int HeadSize = 100, BodySize = 150, BottomSize = 200;
		int Head_X = 200, Head_Y = 25;
		int Body_X = 175, Body_Y = 125;
		int Bottom_X = 150, Bottom_Y = 275;
		int Eye_Width = 10, Eye_Height = 30;
		Group root = new Group();
		Scene scene = new Scene(root);
		Canvas canvas = new Canvas(500, 500);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.strokeOval(Head_X, Head_Y, HeadSize, HeadSize);
		gc.strokeOval(Body_X, Body_Y, BodySize, BodySize);
		gc.strokeOval(Bottom_X, Bottom_Y, BottomSize, BottomSize);
		gc.setStroke(Color.BLACK);
		gc.fillOval(220, 40, Eye_Width, Eye_Height);
		gc.fillOval(270, 40, Eye_Width, Eye_Height);
		gc.setFill(Color.ORANGE);
		gc.fillArc(230, 90, 40, 20, 180, 180, ArcType.ROUND);
		gc.setFill(Color.BLACK);
		gc.strokeLine(177, 177, 125, 125);
		gc.strokeLine(322, 177, 375, 125);
		root.getChildren().add(canvas);
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
