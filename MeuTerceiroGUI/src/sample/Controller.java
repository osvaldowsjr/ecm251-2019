package sample;

import Model.BasicCalculator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtSecond;
    @FXML
    private Label lblResult;

    BasicCalculator cassio = new BasicCalculator();

    @FXML
    public void sum(){
        lblResult.setText(""+cassio.Add(txtFirst.getText(),txtSecond.getText()));
        txtSecond.setText(lblResult.getText());
    }
    @FXML
    public void Sub(){
        lblResult.setText(""+cassio.Subs(txtFirst.getText(),txtSecond.getText()));
    }
    @FXML
    public void Mult(){
        lblResult.setText(""+cassio.Mult(txtFirst.getText(),txtSecond.getText()));
    }
    @FXML
    public void Divd(){
        lblResult.setText(""+cassio.Divd(txtFirst.getText(),txtSecond.getText()));
    }


}
