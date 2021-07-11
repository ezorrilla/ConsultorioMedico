
package model;

/**
 *
 * @author elder
 */
public class Pago {
    
    private int cod_pago;
    private int cod_cita;
    private int cod_exa;
    private String tipo_tran;
    private int cod_transac;
    private String fecha_crea;
    private String fecha_pago;
    private double monto;
    private String estado;
    private int usu_crea;
    private int usu_pago;

    public int getCod_pago() {
        return cod_pago;
    }

    public void setCod_pago(int cod_pago) {
        this.cod_pago = cod_pago;
    }

    public int getCod_cita() {
        return cod_cita;
    }

    public void setCod_cita(int cod_cita) {
        this.cod_cita = cod_cita;
    }

    public int getCod_exa() {
        return cod_exa;
    }

    public void setCod_exa(int cod_exa) {
        this.cod_exa = cod_exa;
    }

    public String getTipo_tran() {
        return tipo_tran;
    }

    public void setTipo_tran(String tipo_tran) {
        this.tipo_tran = tipo_tran;
    }

    public int getCod_transac() {
        return cod_transac;
    }

    public void setCod_transac(int cod_transac) {
        this.cod_transac = cod_transac;
    }

    public String getFecha_crea() {
        return fecha_crea;
    }

    public void setFecha_crea(String fecha_crea) {
        this.fecha_crea = fecha_crea;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getUsu_crea() {
        return usu_crea;
    }

    public void setUsu_crea(int usu_crea) {
        this.usu_crea = usu_crea;
    }

    public int getUsu_pago() {
        return usu_pago;
    }

    public void setUsu_pago(int usu_pago) {
        this.usu_pago = usu_pago;
    }
    
    
}
