package main.java.com.ProyectoFinal.Hernan2022.Service;


import com.ProyectoFinal.Hernan2022.Entity.Experiencia;
import com.ProyectoFinal.Hernan2022.Interface.IExperienciaService;
import com.ProyectoFinal.Hernan2022.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService {

    @Autowired
    IExperienciaRepository iexperienciaRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> listaExperiencias = iexperienciaRepository.findAll();
        return listaExperiencias;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
        return experiencia;

    }

}