package com.javier.views;

import com.javier.ut5.ComponenteHolaMundo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainWindowController{

    @FXML
    private ComponenteHolaMundo comp;

    @FXML
    private Button button;

    @FXML
    void saludar(ActionEvent actionEvent){
        comp.saluda();
    }
}
