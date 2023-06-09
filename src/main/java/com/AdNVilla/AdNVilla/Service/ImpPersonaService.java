package com.AdNVilla.AdNVilla.Service;

import com.AdNVilla.AdNVilla.entity.Persona;
import com.AdNVilla.AdNVilla.repositoty.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    public List<Persona> list(){
        return ipersonaRepository.findAll();
    }
    
    public Optional<Persona> getOne(int id){
        return ipersonaRepository.findById(id);
    }
    
    public Optional<Persona> getByNombreE (String nombre){
        return ipersonaRepository.findByNombre(nombre);
    }
    
    public void save (Persona expe){
        ipersonaRepository.save(expe);
    }
    
    public void delete(int id){
        ipersonaRepository.deleteById(id);
    }
    
    public boolean existsById (int id){
        return ipersonaRepository.existsById(id);
    }
    
    public boolean existsByNombreE(String nombre){
        return ipersonaRepository.existsByNombre(nombre);
    }
}
