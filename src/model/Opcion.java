
package model;


public class Opcion {
    private int cod_opc;
    private String opcion;
    private String descripcion;
    private int estado;
    private int weight;
    private String ico;

    public Opcion(int cod_opc, String opcion, String descripcion, int estado, int weight, String ico) {
        this.cod_opc = cod_opc;
        this.opcion = opcion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.weight = weight;
        this.ico = ico;
    }
    
    public Opcion(){
    }
    
    public int getCod_opc() {
        return cod_opc;
    }

    public void setCod_opc(int cod_opc) {
        this.cod_opc = cod_opc;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
    
    
}
