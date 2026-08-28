
package pruebarepo;


public class Codigos {
    
    protected String tipoCodigo;
    protected int cantidad;
    protected boolean practica; 

    public Codigos(String tipoCodigo, int cantidad, boolean practica) {
        this.tipoCodigo = tipoCodigo;
        this.cantidad = cantidad;
        this.practica = practica;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isPractica() {
        return practica;
    }

    public void setPractica(boolean practica) {
        this.practica = practica;
    }
    
    
    
}
