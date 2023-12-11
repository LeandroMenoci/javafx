package fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginControlador {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField senhaField;

    public void entrar() {
        boolean emailValido = emailField.getText().equals("aluno@cod3r.com.br");
        boolean senhaValida = senhaField.getText().equals("123456");

        if(emailValido && senhaValida) {
            Notifications.create()
                    .title("Login FXML")
                    .text("Login efetuado com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login FXML")
                    .text("Ocorreu uma falha no login!")
                    .showError();
        }
    }
}
