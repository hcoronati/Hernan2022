package com.ProyectoFinal.Hernan2022.Controller;

import com.ProyectoFinal.Hernan2022.Entity.Experiencia;
import com.ProyectoFinal.Hernan2022.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin(origins = "*")
public class ExperienciaController {
    @Autowired
    private IExperienciaService iexperienciaService;

    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "La experiencia se creo con éxito";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La experiencia fue eliminada";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                   @RequestParam("nombre_expe") String nuevoNombre,
                                   @RequestParam("actividad") String nuevaActividad,
                                   @RequestParam("fecha") String nuevaFecha) {
        Experiencia experiencia = iexperienciaService.findExperiencia(id);

        experiencia.setnombre_expe(nuevoNombre);
        experiencia.setactividad(nuevaActividad);
        experiencia.setfecha(nuevaFecha);

        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }

    @GetMapping("/experiencias/traer/perfil/{id}")
    public Experiencia findExperiencia(@PathVariable Long id){
        return iexperienciaService.findExperiencia(id);
    }

}