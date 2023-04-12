
package com.ProyectoFinal.Hernan2022.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


//con estas anotaciones evitamos insertar codigo de getters y setters, es de lombok
@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")

    private String apellido;
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    
    private String ocupacion;
    private String fecha_nac;
    private String correo;
    private String sobre_mi;
    private String url_perfil;
    private String url_banner;
    private String usuario_email;
    private int id_domicilio;
    
}