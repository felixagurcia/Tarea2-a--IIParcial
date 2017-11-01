package sample.Controladores;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Modelos.Persona;

import javax.swing.*;

public class Controller {
    public TextField txtBuscar;
    public Button boton;



    public void buscarPersona(ActionEvent actionEvent) {
        String busca = txtBuscar.getText();
        Persona.busquedaInicial(busca);


    }



    private void campoVacio() {
        txtBuscar.clear();
    }
}
