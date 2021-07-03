
package model;

import java.util.Date;

public class Citas {
    private int cod_cita;
    private int cod_pac;
    private Date dia_cita;
    private int hora_cita;
    private int cod_area;
    private int cod_med;
    private String motivo_cita;

    public int getCod_cita() {
        return cod_cita;
    }

    public void setCod_cita(int cod_cita) {
        this.cod_cita = cod_cita;
    }

    public int getCod_pac() {
        return cod_pac;
    }

    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
    }

    public Date getDia_cita() {
        return dia_cita;
    }

    public void setDia_cita(Date dia_cita) {
        this.dia_cita = dia_cita;
    }

    public int getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(int hora_cita) {
        this.hora_cita = hora_cita;
    }

    public int getCod_area() {
        return cod_area;
    }

    public void setCod_area(int cod_area) {
        this.cod_area = cod_area;
    }

    public int getCod_med() {
        return cod_med;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public String getMotivo_cita() {
        return motivo_cita;
    }

    public void setMotivo_cita(String motivo_cita) {
        this.motivo_cita = motivo_cita;
    }
    
    
}
