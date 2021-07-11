package model;

/**
 *
 * @author elder
 */
public class Medico {
    
    private int cod_med;
    private String nombre_med;
    private String apellido_med;
    private String dist_med;
    private int telf_med;

    public int getCod_med() {
        return cod_med;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getApellido_med() {
        return apellido_med;
    }

    public void setApellido_med(String apellido_med) {
        this.apellido_med = apellido_med;
    }

    public String getDist_med() {
        return dist_med;
    }

    public void setDist_med(String dist_med) {
        this.dist_med = dist_med;
    }

    public int getTelf_med() {
        return telf_med;
    }

    public void setTelf_med(int telf_med) {
        this.telf_med = telf_med;
    }
    
}
