import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Principal extends Application implements EventHandler<ActionEvent>{

    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception  {
        primaryStage.setTitle("Titulo da Janela");

        button = new Button();
        button2 = new Button("Ou aqui");
        button.setText("Pressione aqui");
        button2.setOnAction(this);
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2);

        Scene scene = new Scene(layout, 300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    // Este metodo sempre deve ser chamado quando um Event é gerado
    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button){
            System.out.println("Testando ");
        }
        if(event.getSource() == button2){
            System.out.println("Testando botao 2");
        }
    }
}
