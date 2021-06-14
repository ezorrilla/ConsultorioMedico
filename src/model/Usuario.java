
package model;

public class Usuario {    
    private int num_usu;
    private String nombre_usu;
    private String apellido_usu;
    private String dni_usu;
    private String pass;
    private String cod_perf;
    private String perfil;
    private int estado;

    public int getNum_usu() {
        return num_usu;
    }

    public void setNum_usu(int num_usu) {
        this.num_usu = num_usu;
    }

    public String getNombre_usu() {
        return nombre_usu;
    }

    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public String getApellido_usu() {
        return apellido_usu;
    }

    public void setApellido_usu(String apellido_usu) {
        this.apellido_usu = apellido_usu;
    }

    public String getDni_usu() {
        return dni_usu;
    }

    public void setDni_usu(String dni_usu) {
        this.dni_usu = dni_usu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCod_perf() {
        return cod_perf;
    }

    public void setCod_perf(String cod_perf) {
        this.cod_perf = cod_perf;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
