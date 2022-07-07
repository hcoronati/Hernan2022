/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinal.Hernan2022.Service;

/**
 *
 * @author Hernan
 */
import com.ProyectoFinal.Hernan2022.Entity.Educacion;
import com.ProyectoFinal.Hernan2022.Interface.IEducacionService;
import com.ProyectoFinal.Hernan2022.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService{

    @Autowired IEducacionRepository ieducacionRepository;
    
    @Override
    public List<Educacion> getEducacion() {
         List<Educacion> listaEducaciones = ieducacionRepository.findAll();
         return listaEducaciones;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        ieducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = ieducacionRepository.findById(id).orElse(null);
        return educacion;
                
    }
    
}
