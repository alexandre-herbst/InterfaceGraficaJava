import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Principal extends Application {

    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception  {
        primaryStage.setTitle("Titulo da Janela");
        button = new Button();
        button.setText("Pressione aqui");

//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Testando");
//            }
//        });

        button.setOnAction(event -> System.out.println("teste"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        Scene scene = new Scene(layout, 300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



}
