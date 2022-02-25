/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorCliente;
import Controlador.ControladorMDB;
import Controlador.ControladorSeguimientoCliente;
import Modelo.MDB;
import Vista.FrmCliente;
import Vista.FrmSeguimientoClientes;
import Vista.FrmVista;

/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        FrmSeguimientoClientes segcli = new FrmSeguimientoClientes();
        ControladorSeguimientoCliente objControlSegClie;
        ControladorMDB objController;
        FrmCliente cli = new FrmCliente();
        ControladorCliente objControlClie;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objControlClie = new ControladorCliente(cli,objModelo);
        objControlClie.iniciar();
        objControlSegClie = new ControladorSeguimientoCliente(segcli,objModelo);
        objControlSegClie.iniciar();
        segcli.setVisible(true);
        cli.setVisible(true);
        objVista.setVisible(true);
        
        
        
    }
    
}
