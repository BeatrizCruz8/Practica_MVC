package Controlador;

import Modelo.MDB;
import Vista.FrmSeguimientoClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeguimientoCliente implements ActionListener {

    private FrmSeguimientoClientes _view;
    private MDB _model;

    /* @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
    public ControladorSeguimientoCliente(FrmSeguimientoClientes _view, MDB _model) {
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
            leyenda = _model.registrarAlta("seguimiento_clientes", " null," + _view.txtCedula.getText() + ",'" + _view.txtLugarExpedicion.getText() + "','" + _view.txtNombreCompleto.getText() + "','" + _view.txtProfesion.getText() + "','" + _view.txtDireccionResidencial.getText() + "','" + _view.txtCiudad.getText() + "','" + _view.txtDepartamento.getText() + "','" + _view.txtEmail.getText() + "'," + _view.txtTelResidencia.getText() + "," + _view.txtTelTrabajo.getText() + "," + _view.txtNumFactura.getText() + ",'" + _view.txtTipoCartera.getText() + "','" + _view.txtFechaMora.getText() + "','" + _view.txtFechaMora1.getText()+ "'," +_view.TxtValmora.getText()+","+_view.TxtVseguro.getText()+","+_view.TxtIntMora.getText()+","+_view.TxtSaldMora.getText()+",'"+_view.TxtTipoCobro.getText()+"','"+_view.TxtFeAcuerdo.getText()+"','"+_view.TxtAcuerdouno.getText()+"','"+_view.TxtFeacudos.getText()+"','"+_view.txtAcuerdoDos.getText()+"','"+ _view.txtFechaAcuerdoTres.getText()+"','"+_view.txtAcuerdoTres.getText()+"','"+_view.txtFechaAcuerdoCuatro.getText()+"','"+_view.txtAcuerdoCuatro.getText()+"'");
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
        _view.txtID.setText(null);
        _view.txtCedula.setText(null);
        _view.txtLugarExpedicion.setText(null);
        _view.txtNombreCompleto.setText(null);
        _view.txtProfesion.setText(null);
        _view.txtDireccionResidencial.setText(null);
        _view.txtCiudad.setText(null);
        _view.txtDepartamento.setText(null);
        _view.txtEmail.setText(null);
        _view.txtTelResidencia.setText(null);
        _view.txtTelTrabajo.setText(null);
        _view.txtNumFactura.setText(null);
        _view.txtTipoCartera.setText(null);
        _view.txtFechaMora.setText(null);
        _view.txtFechaMora1.setText(null);
        _view.TxtValmora.setText(null);
        _view.TxtVseguro.setText(null);
        _view.TxtIntMora.setText(null);
        _view.TxtSaldMora.setText(null);
        _view.TxtTipoCobro.setText(null);
        _view.TxtFeAcuerdo.setText(null);
        _view.TxtAcuerdouno.setText(null);
        _view.TxtFeacudos.setText(null);
        _view.txtAcuerdoDos.setText(null);
        _view.txtFechaAcuerdoTres.setText(null);
        _view.txtAcuerdoTres.setText(null);
        _view.txtFechaAcuerdoCuatro.setText(null);
        _view.txtAcuerdoCuatro.setText(null);
    }
}
