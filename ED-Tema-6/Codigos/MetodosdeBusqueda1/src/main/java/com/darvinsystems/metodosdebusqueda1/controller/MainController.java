package com.darvinsystems.metodosdebusqueda1.controller;

import com.darvinsystems.metodosdebusqueda1.funciones.Busqueda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtElementos;

    @FXML
    private TextField txtBuscar;

    @FXML
    private ListView<String> listViewResultado;

    @FXML
    private Label lblMensaje;

    private int[] arreglo; // arreglo global

    // 🔹 INGRESAR ELEMENTOS
    @FXML
    void OnIngresar(ActionEvent event) {

        try {
            listViewResultado.getItems().clear();
            lblMensaje.setText("");

            int n = Integer.parseInt(txtCantidad.getText());
            String[] valores = txtElementos.getText().split(",");

            if (valores.length != n) {
                lblMensaje.setText("❌ La cantidad no coincide");
                return;
            }

            arreglo = new int[n];

            for (int i = 0; i < n; i++) {
                arreglo[i] = Integer.parseInt(valores[i].trim());
                listViewResultado.getItems().add("Elemento: " + arreglo[i]);
            }

            lblMensaje.setText("✅ Elementos ingresados correctamente");

        } catch (Exception e) {
            lblMensaje.setText("❌ Error en los datos ingresados");
        }
    }

    // 🔍 BUSCAR ELEMENTO (BÚSQUEDA SECUENCIAL)
    @FXML
    void OnBuscar(ActionEvent event) {

        try {
            lblMensaje.setText("");

            if (arreglo == null) {
                lblMensaje.setText("❌ Primero ingresa los elementos");
                return;
            }

            int valor = Integer.parseInt(txtBuscar.getText());

            int posicion = Busqueda.busquedaSecuencial(arreglo, valor);

            if (posicion != -1) {
                lblMensaje.setText("✅ Encontrado en la posición: " + posicion);
            } else {
                lblMensaje.setText("❌ Elemento no encontrado");
            }

        } catch (Exception e) {
            lblMensaje.setText("❌ Error al buscar");
        }
    }
}
