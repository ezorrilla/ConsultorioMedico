//Clase padre "Consulta"
package model;

import java.util.Date;


public class Consulta {
    
    private int cod_cons;
    private int cod_pac;
    private int cod_serv;
    private int cod_med;
    private double peso;
    private double talla;
    private double presion_art;
    private double temperatura;
    private String notas;
    private String motivo_consu;
    private String diagnostico;
    private String tratamiento;
    private String estado;
    private String fecha;
    private String nom_pac;

    public int getCod_cons() {
        return cod_cons;
    }

    public void setCod_cons(int cod_cons) {
        this.cod_cons = cod_cons;
    }

    public int getCod_pac() {
        return cod_pac;
    }

    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
    }

    public int getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(int cod_serv) {
        this.cod_serv = cod_serv;
    }

    public int getCod_med() {
        return cod_med;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPresion_art() {
        return presion_art;
    }

    public void setPresion_art(double presion_art) {
        this.presion_art = presion_art;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getMotivo_consu() {
        return motivo_consu;
    }

    public void setMotivo_consu(String motivo_consu) {
        this.motivo_consu = motivo_consu;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getNom_pac() {
        return nom_pac;
    }

    public void setNom_pac(String nom_pac) {
        this.nom_pac = nom_pac;
    }

    @Override
    public String toString() {
        return "Consulta{" + "cod_cons=" + cod_cons + ", cod_pac=" + cod_pac + ", cod_serv=" + cod_serv + ", cod_med=" + cod_med + ", peso=" + peso + ", talla=" + talla + ", presion_art=" + presion_art + ", temperatura=" + temperatura + ", notas=" + notas + ", motivo_consu=" + motivo_consu + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + ", estado=" + estado + ", fecha=" + fecha + '}';
    }
    
    
    
}
