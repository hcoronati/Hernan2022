
package main.java.com.ProyectoFinal.Hernan2022.Repository;

import com.ProyectoFinal.Hernan2022.Entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad,Long>{
    
}