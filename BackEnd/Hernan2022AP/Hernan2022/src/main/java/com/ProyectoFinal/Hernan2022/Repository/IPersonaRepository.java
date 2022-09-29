
package com.ProyectoFinal.Hernan2022.Repository;

import com.ProyectoFinal.Hernan2022.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
