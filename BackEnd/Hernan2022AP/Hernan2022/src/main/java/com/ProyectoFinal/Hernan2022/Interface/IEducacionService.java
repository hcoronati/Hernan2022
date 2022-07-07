/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoFinal.Hernan2022.Interface;

/**
 *
 * @author Hernan
 */
import com.ProyectoFinal.Hernan2022.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    //Traer educacion
    public List<Educacion> getEducacion();
    
    //Guardar objeto educacion
    public void saveEducacion(Educacion educacion);
    
    //Borrar objeto educacion por id
    public void deleteEducacion(Long id);
    
    //Buscar educacion por id
    public Educacion findEducacion(Long id);
}
