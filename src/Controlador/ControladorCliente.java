package Controlador;

import Modelo.MDB;
import Vista.FrmCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener {

    private FrmCliente _view;
    private MDB _model;

    /* @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
    public ControladorCliente(FrmCliente _view, MDB _model) {
        this._view = _view;
        this._model = _model;
        this._view.cmdAgregar.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
        this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
    }

    @Override
    //En este método se ΗatrapaΗ la interacción del usuario
    public void actionPerformed(ActionEvent e) {
        String leyenda = "";//esta variable servirá para atrapar los errores sql

        if (e.getSource() == _view.cmdAgregar) { //Si el botón presionado fue el de alta
            leyenda = _model.registrarAlta("clientes", _view.TxtCedula.getText() + ",'" + _view.TxtLugarExpe.getText() + "','" + _view.TxtNombreCom.getText() + "','" + _view.TxtProfesion.getText() + "','" + _view.TxtdireccionResi.getText() + "','" + _view.TxtCiudad.getText() + "','" + _view.TxtDepa.getText() + "','" + _view.txtEmail.getText() + "'," + _view.txtTelResidencia.getText() + "," + _view.txtTelTrabajo.getText() + "," + _view.txtNumFactura.getText() + ",'" + _view.txtFechaCredito.getText() + "','" + _view.txtTipoCartera.getText() + "'," + _view.txtValorCredito.getText() + "," + _view.txtNumCuotas.getText());
            //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
            // validación aquí sobre los datos obteindos de las cajas de texto
            JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
            //consulta de inserción
            limpiar();//se limpian las cajas de texto
            //agregar otros botones si se necesitan implementar
        }
    }

    public void iniciar() {
        _view.setTitle("MVC_Visual clientes");
    }

    public void limpiar() {
        _view.TxtCedula.setText(null);
        _view.TxtLugarExpe.setText(null);
        _view.TxtNombreCom.setText(null);
        _view.TxtProfesion.setText(null);
        _view.TxtdireccionResi.setText(null);
        _view.TxtCiudad.setText(null);
        _view.TxtDepa.setText(null);
        _view.txtEmail.setText(null);
        _view.txtTelResidencia.setText(null);
        _view.txtTelTrabajo.setText(null);
        _view.txtNumFactura.setText(null);
        _view.txtFechaCredito.setText(null);
        _view.txtTipoCartera.setText(null);
        _view.txtValorCredito.setText(null);
        _view.txtNumCuotas.setText(null);
    }
}
