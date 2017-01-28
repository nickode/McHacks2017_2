package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {
	
	Button button1,button2,button3;
	Label label1,label2;
	int rowNum = 6;
	int colNum = 6;
	int gridHeight = 6;
	int gridWidth = 6;

	
	public void start(Stage primaryStage) {
		try {
			//scene 1
			primaryStage.setTitle("Picture Game");
			StackPane layout = new StackPane();
			Scene scene = new Scene(layout,600,4000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			button1 = new Button();
			button2 = new Button();
			label1 = new Label("Welcome to the picture game!");
			label1.setTranslateY(-150);
			label2 = new Label("(random pic)");
			label2.setTranslateY(-10);
			button1.setTranslateX(-75);
			button1.setTranslateY(100);
			button2.setTranslateY(100);
			button2.setTranslateX(75);
			layout.getChildren().addAll(button1,button2,label1,label2);
			button1.setText("Start Game");
			button2.setText("Options");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			//scene 2
			GridPane grid = new GridPane();
			
			for (int row=0;row<rowNum;row++){
				for(int col=0;col<colNum;col++){
					Rectangle r = new Rectangle();
					r.setWidth(100);
					r.setHeight(100);
					r.setFill(Color.ALICEBLUE);
					r.setStroke(Color.BLACK);
					GridPane.setRowIndex(r, row);
					GridPane.setColumnIndex(r, col);
					grid.getChildren().addAll(r);
					r.widthProperty().bind(grid.widthProperty().divide(rowNum));
				}
			}
			//StackPane layout2 = new StackPane();
			Scene scene2 = new Scene(grid,600,4000);
			
			//ImageView pic1 = new ImageView(new Image(getClass().getResourceAsStream("/res/salt.jpg")));
			//grid.getChildren().add(pic1);
			button3 = new Button("Quit Game");
			grid.getChildren().add(button3);
			
			button3.setOnAction(e -> primaryStage.setScene(scene));
			
			//button1
			button1.setOnAction(e -> primaryStage.setScene(scene2));
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

