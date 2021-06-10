
package model;

import java.util.Date;

public class Paciente {
    private int cod_pac;
    private String nombre_pac;
    private String apellido_pac;
    private Date fecha_nac;
    private String sexo_pac;
    private String dni_pac;
    private String direccion;
    private int telefono;

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

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getSexo_pac() {
        return sexo_pac;
    }

    public void setSexo_pac(String sexo_pac) {
        this.sexo_pac = sexo_pac;
    }

    public String getDni_pac() {
        return dni_pac;
    }

    public void setDni_pac(String dni_pac) {
        this.dni_pac = dni_pac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cod_pac=" + cod_pac + ", nombre_pac=" + nombre_pac + ", apellido_pac=" + apellido_pac + ", fecha_nac=" + fecha_nac + ", sexo_pac=" + sexo_pac + ", dni_pac=" + dni_pac + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
