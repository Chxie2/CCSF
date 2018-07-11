package hw.Graphics.Assignment3;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class WeirdLookinThing extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		int Outside_Arc_Size = 130, Inside_Outside_Circle_Size = 90, Inside_Circle_Size = 45;
		int Top_Arc_X = 30, Top_Arc_Y = -80; 
		int Right_Arc_X = 140, Right_Arc_Y = 40;
		int Left_Arc_X = -80, Left_Arc_Y = 40;
		int Bottom_Arc_X = 30, Bottom_Arc_Y = 140;
		int Outer_Inside_Circle_X = 50, Outer_Inside_Circle_Y = 50;
		int Inside_Circle_X = 73, Inside_Circle_Y = 73;
		Group root = new Group();
		Scene scene = new Scene(root);
		Canvas canvas = new Canvas(200, 200);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setStroke(Color.GREEN);
		gc.strokeArc(Top_Arc_X, Top_Arc_Y, Outside_Arc_Size, Outside_Arc_Size, 180, 180, ArcType.ROUND);
		gc.strokeArc(Right_Arc_X, Right_Arc_Y, Outside_Arc_Size, Outside_Arc_Size, 90, 180, ArcType.ROUND);
		gc.strokeArc(Left_Arc_X, Left_Arc_Y, Outside_Arc_Size, Outside_Arc_Size, 270, 180, ArcType.ROUND);
		gc.strokeArc(Bottom_Arc_X, Bottom_Arc_Y, Outside_Arc_Size, Outside_Arc_Size, 0, 180, ArcType.ROUND);
		gc.setStroke(Color.RED);
		gc.strokeOval(Outer_Inside_Circle_X, Outer_Inside_Circle_Y, Inside_Outside_Circle_Size, Inside_Outside_Circle_Size);
		gc.setFill(Color.BLUE);
		gc.fillOval(Inside_Circle_X, Inside_Circle_Y, Inside_Circle_Size, Inside_Circle_Size);
		root.getChildren().add(canvas);
		primaryStage.setTitle("Weird Lookin Thing");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
