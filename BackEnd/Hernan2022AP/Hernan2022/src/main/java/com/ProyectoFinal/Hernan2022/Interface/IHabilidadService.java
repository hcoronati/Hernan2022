
package main.java.com.ProyectoFinal.Hernan2022.Interface;

import com.ProyectoFinal.Hernan2022.Entity.Habilidad;
import java.util.List;


public interface IHabilidadService {
    //Traer Habilidad
    public List<Habilidad> getHabilidad();
    
    //Guardar objeto Habilidad
    public void saveHabilidad(Habilidad habilidad);
    
    //Borrar objeto Habilidad por id
    public void deleteHabilidad(Long id);
    
    //Buscar Habilidad por id
    public Habilidad findHabilidad(Long id);
}
