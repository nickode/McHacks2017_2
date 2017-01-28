package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {
	
	Button button1,button2,button3;
	Label label1,label2;

	
	public void start(Stage primaryStage) {
		try {
			//scene 1
			primaryStage.setTitle("Picture Game");
			StackPane layout = new StackPane();
			Scene scene = new Scene(layout,400,400);
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
			StackPane layout2 = new StackPane();
			Scene scene2 = new Scene(layout2,400,400);
			
			ImageView pic1 = new ImageView(new Image(getClass().getResourceAsStream("/res/salt.jpg")));
			layout2.getChildren().add(pic1);
			button3 = new Button("Quit Game");
			layout2.getChildren().add(button3);
			
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

