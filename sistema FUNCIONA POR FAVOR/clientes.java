import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Clientes extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Cadastro de Clientes");
        titulo.setFont(Font.font("Times New Roman", 28));

        TextField nome = new TextField();
        nome.setPromptText("Nome");

        TextField email = new TextField();
        email.setPromptText("E-mail");

        PasswordField senha = new PasswordField();
        senha.setPromptText("Senha");

        Button cadastrar = new Button("Cadastrar");

        VBox root = new VBox(15);

        root.getChildren().addAll(
                titulo,
                nome,
                email,
                senha,
                cadastrar);

        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 450, 420);

        stage.setTitle("Clientes");
        stage.setScene(scene);
        stage.show();
    }
}
