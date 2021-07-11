
package model;

/**
 *
 * @author elder
 */
public class Servicio {    
    private int cod_serv;
    private Area area;
    private String tipo_serv;
    private String nomb_serv;
    private double cost_serv;
    private int estado;

    public int getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(int cod_serv) {
        this.cod_serv = cod_serv;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getTipo_serv() {
        return tipo_serv;
    }

    public void setTipo_serv(String tipo_serv) {
        this.tipo_serv = tipo_serv;
    }

    public String getNomb_serv() {
        return nomb_serv;
    }

    public void setNomb_serv(String nomb_serv) {
        this.nomb_serv = nomb_serv;
    }

    public double getCost_serv() {
        return cost_serv;
    }

    public void setCost_serv(double cost_serv) {
        this.cost_serv = cost_serv;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
