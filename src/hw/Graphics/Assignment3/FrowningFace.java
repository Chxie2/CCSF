package hw.Graphics.Assignment3;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class FrowningFace extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		int Face_Size = 450, Face_X = 25, Face_Y = 25;
		int Eye_Height = 75, Eye_Width = 50, Eye_Y = 100, R_Eye_X = 100, L_Eye_X = 325;
		int Smile_Start = 0, Smile_Angle = 180, Smile_X = 100, Smile_Y = 300, Smile_Width = 300, Smile_Height = 75;
		Group root = new Group();
		Scene scene = new Scene(root);
		Canvas canvas = new Canvas(500, 500);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.YELLOW);
		gc.fillOval(Face_X, Face_Y, Face_Size, Face_Size);
		gc.setStroke(Color.BLUE);
		gc.strokeOval(R_Eye_X, Eye_Y, Eye_Width, Eye_Height);
		gc.strokeOval(L_Eye_X, Eye_Y, Eye_Width, Eye_Height);
		gc.setStroke(Color.RED);
		gc.strokeArc(Smile_X, Smile_Y, Smile_Width, Smile_Height, Smile_Start, Smile_Angle, ArcType.OPEN);
		root.getChildren().add(canvas);
		primaryStage.setTitle("Frowning Face");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
