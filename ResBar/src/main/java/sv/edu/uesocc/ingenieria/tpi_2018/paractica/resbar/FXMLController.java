package sv.edu.uesocc.ingenieria.tpi_2018.paractica.resbar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    @FXML
    private Button btnLlevar;
    private Button btnComerAqui;
    private Label label;

    @FXML
    private void abrirOrdenes(ActionEvent e) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("/fxml/Ordenes.fxml"));
        Scene ordenes = new Scene(root2);
        Stage stage2= (Stage)((Node) e.getSource()).getScene().getWindow();
        stage2.setTitle("ResBar");
        stage2.setScene(ordenes);
        stage2.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
