package Clases;


import Vista.*;

public class Navegador {
    public vistaRecepcion vRep;
    public gestionarCliente gCli;
    public registrarCliente rCli;
    
    public Navegador(){
        vRep = new vistaRecepcion(this);
        gCli = new gestionarCliente(this);
        rCli = new registrarCliente(this);
    }
}
