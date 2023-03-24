
package main.java.com.ProyectoFinal.Hernan2022.Service;

import com.ProyectoFinal.Hernan2022.Entity.Habilidad;
import com.ProyectoFinal.Hernan2022.Interface.IHabilidadService;
import com.ProyectoFinal.Hernan2022.Repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidadService implements IHabilidadService{

    @Autowired IHabilidadRepository ihabilidadRepository;
    
    @Override
    public List<Habilidad> getHabilidad() {
         List<Habilidad> listaHabilidades = ihabilidadRepository.findAll();
         return listaHabilidades;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        ihabilidadRepository.save(habilidad);
    }

    @Override
    public void deleteHabilidad(Long id) {
        ihabilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad habilidad = ihabilidadRepository.findById(id).orElse(null);
        return habilidad;
                
    }
    
}
