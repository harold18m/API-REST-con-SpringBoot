package pe.tecsup.microservicios_2978.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String continente;
    private Integer provincias;
    private boolean isBeach;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Integer getProvincias() {
        return provincias;
    }

    public void setProvincias(Integer provincias) {
        this.provincias = provincias;
    }

    public boolean isBeach() {
        return isBeach;
    }

    public void setBeach(boolean beach) {
        isBeach = beach;
    }
}
