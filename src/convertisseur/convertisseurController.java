package convertisseur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nico
 */
public class convertisseurController {

    @FXML
    TextField euros;

    @FXML
    TextField dollars;

    public void onButtonClick(ActionEvent event) {
        double tx = 1.2020;
        dollars.setText(String.valueOf(Double.valueOf(euros.getText()) * tx));
        euros.setText("");
    }

}///class
