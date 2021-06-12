
package model;

import java.util.Date;

public class Historia {
    private int cod_his;
    private Date fecha_his;
    private int cod_pac;  
    private String nombre_pac;
    private String apellido_pac;
    private String sangre;
    private String VIH;
    private String alergias;
    private String alergia_medic;
    private String medicamentos;
    private String enfermedades;
    private String habitos;
    private String antec_fami;
    private Date fecha_act;

    public int getCod_his() {
        return cod_his;
    }

    public void setCod_his(int cod_his) {
        this.cod_his = cod_his;
    }

    public Date getFecha_his() {
        return fecha_his;
    }

    public void setFecha_his(Date fecha_his) {
        this.fecha_his = fecha_his;
    }

    public int getCod_pac() {
        return cod_pac;
    }

    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
    }

    public String getNombre_pac() {
        return nombre_pac;
    }

    public void setNombre_pac(String nombre_pac) {
        this.nombre_pac = nombre_pac;
    }

    public String getApellido_pac() {
        return apellido_pac;
    }

    public void setApellido_pac(String apellido_pac) {
        this.apellido_pac = apellido_pac;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getVIH() {
        return VIH;
    }

    public void setVIH(String VIH) {
        this.VIH = VIH;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAlergia_medic() {
        return alergia_medic;
    }

    public void setAlergia_medic(String alergia_medic) {
        this.alergia_medic = alergia_medic;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getAntec_fami() {
        return antec_fami;
    }

    public void setAntec_fami(String antec_fami) {
        this.antec_fami = antec_fami;
    }

    public Date getFecha_act() {
        return fecha_act;
    }

    public void setFecha_act(Date fecha_act) {
        this.fecha_act = fecha_act;
    }
    
    
}
