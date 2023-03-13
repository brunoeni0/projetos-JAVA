package aula_2b;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    boolean v = true;
    @FXML
    private Label lblMensagem;
    private Button btnClick;
    @FXML
    private void clicouBotao(ActionEvent event) {
        if (v) {
            v = false;
            lblMensagem.setText("Olá, Mundo!");
            lblMensagem.setTextFill(javafx.scene.paint.Color.AQUA);
        } else {
            v = true;
            lblMensagem.setText("Mensagem");
            lblMensagem.setTextFill(javafx.scene.paint.Color.LIGHTCORAL);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
