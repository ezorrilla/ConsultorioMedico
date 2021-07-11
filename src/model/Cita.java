
package model;

import java.util.Date;

public class Cita {
    private int cod_cita;
    private int cod_pac;
    private Paciente paciente;
    private Date dia_cita;
    private String hora_cita;
    private int cod_area;
    private Area area;
    private int cod_serv;
    private Servicio servicio;
    private int cod_med;
    private Medico medico;
    private String motivo_cita;
    private String estado;

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

    public String getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(String hora_cita) {
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

    public Paciente getPaciente() {
        if (paciente == null) paciente = new Paciente();
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Area getArea() {
        if (area == null) area = new Area();
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public int getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(int cod_serv) {
        this.cod_serv = cod_serv;
    }

    public Servicio getServicio() {
        if (servicio == null) servicio = new Servicio();
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        if (medico == null) medico = new Medico();
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
