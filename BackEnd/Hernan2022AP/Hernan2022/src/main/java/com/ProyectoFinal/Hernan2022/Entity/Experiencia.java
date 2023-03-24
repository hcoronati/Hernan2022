package main.java.com.ProyectoFinal.Hernan2022.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Hernan
 */

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_expe;
    private String actividad;
    private String fecha;

    public void setactividad(String nuevaActividad) {
        this.actividad = nuevaActividad;
    }

    public void setnombre_expe(String nuevoNombre) {
        this.nombre_expe = nuevoNombre;
    }

    public void setfecha(String nuevaFecha) {
        this.fecha = nuevaFecha;
    }
}
