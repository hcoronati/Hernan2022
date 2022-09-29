
package com.ProyectoFinal.Hernan2022.Interface;

import com.ProyectoFinal.Hernan2022.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long Id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long Id);
    
    
}
