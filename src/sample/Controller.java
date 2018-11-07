package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {
@FXML
TextField displayer;

@FXML
TextArea outputDisplay;


    public void sendKommando(ActionEvent actionEvent) {
        String s = displayer.getText();
        outputDisplay.setText((outputDisplay.getText() + "Du har skrevet: " + s + "\n"));
    }

    public void clear(ActionEvent actionEvent) {
        outputDisplay.clear();
    }

    public void getInfo(ActionEvent actionEvent) {

        outputDisplay.setText(outputDisplay.getText() + "Navn: Dan" + "\nAlder: 21 år" + "\nUddannelse: DAT\n");
    }
}
