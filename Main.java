import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
public void start(Stage stage) {
Label label = new Label("Welcome to JavaFX!");

Image image = new Image(  
        "https://placehold.co/250x150/png"  
    );  

    ImageView imageView = new ImageView(image);  
    imageView.setFitWidth(250);  
    imageView.setFitHeight(150);  

    VBox root = new VBox(15, label, imageView);  
    Scene scene = new Scene(root, 350, 250);  

    stage.setTitle("JavaFX GUI");  
    stage.setScene(scene);  
    stage.show();  
}  

public static void main(String[] args) {  
    launch(args);  
}

}
give output screen and filename
