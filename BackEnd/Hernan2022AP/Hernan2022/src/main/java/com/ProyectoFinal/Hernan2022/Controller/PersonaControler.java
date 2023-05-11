package com.ProyectoFinal.Hernan2022.Controller;

import com.ProyectoFinal.Hernan2022.Entity.Persona;
import com.ProyectoFinal.Hernan2022.Interface.IPersonaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
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
//@CrossOrigin(origins = "*")
public class PersonaControler {
    @Autowired 
    private IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
//    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona se creo con éxito";
    }
    
 //   @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada";
    }
    
 //   @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("ocupacion") String nuevaOcupacion,
                                @RequestParam("sobre_mi") String nuevoSobreMi,
                                @RequestParam("url_perfil") String nuevaUrlPerfil) {

        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setOcupacion(nuevaOcupacion);
        persona.setSobre_mi(nuevoSobreMi);
        persona.setUrl_perfil(nuevaUrlPerfil);

        
        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil/{id}")
    public Persona findPersona(@PathVariable Long id){
        return ipersonaService.findPersona(id);
    }
    
}
