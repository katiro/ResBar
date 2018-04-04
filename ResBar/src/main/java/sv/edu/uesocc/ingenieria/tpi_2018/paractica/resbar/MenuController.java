package sv.edu.uesocc.ingenieria.tpi_2018.paractica.resbar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author katiro
 */
public class MenuController implements Initializable {

     @FXML
    private void regresarMenu(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Ordenes.fxml"));
        Scene Ordenes = new Scene(root);
        Stage stage2= (Stage)((Node) e.getSource()).getScene().getWindow();
        stage2.setTitle("ResBar");
        stage2.setScene(Ordenes);
        stage2.show();

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
